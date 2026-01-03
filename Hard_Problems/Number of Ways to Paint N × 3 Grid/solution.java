public int solve(int i, int n, int prev1, int prev2, int prev3) {
    if (i == n) return 1;
    if (dp[i][prev1 + 1][prev2 + 1][prev3 + 1] != -1) {
        return dp[i][prev1 + 1][prev2 + 1][prev3 + 1];
    }

    int ans = 0;
    for (int c1 = 0; c1 < 3; c1++) {
        for (int c2 = 0; c2 < 3; c2++) {
            for (int c3 = 0; c3 < 3; c3++) {
                if (c1 != c2 && c2 != c3 && c1 != prev1 && c2 != prev2 && c3 != prev3) {
                    ans = (ans + solve(i + 1, n, c1, c2, c3)) % MOD;
                }
            }
        }
    }

    return dp[i][prev1 + 1][prev2 + 1][prev3 + 1] = ans;
}

public int numOfWays(int n) {
    dp = new int[n + 1][4][4][4];
    for (int[][][] arr3D : dp) {
        for (int[][] arr2D : arr3D) {
            for (int[] arr1D : arr2D) {
                Arrays.fill(arr1D, -1);
            }
        }
    }
    return solve(0, n, -1, -1, -1);
}
