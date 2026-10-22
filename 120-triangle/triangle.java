class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                int val = triangle.get(i).get(j);

                int upLeft = Integer.MAX_VALUE;
                int up = Integer.MAX_VALUE;

                if (j > 0)
                    upLeft = dp[i - 1][j - 1];

                if (j < i)
                    up = dp[i - 1][j];

                dp[i][j] = val + Math.min(upLeft, up);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(dp[n - 1][i], min);
        }
        return min;
    }
}