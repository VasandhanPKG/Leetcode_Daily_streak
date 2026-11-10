class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return fun(0, n , costs,dp);
    }

    public int fun(int i, int n, int[] costs,int[] dp) {

        if (i == n)
            return 0;
        if(dp[i]!=-1) return dp[i];
        int one = Integer.MAX_VALUE;

        if (i + 1 <= n)
            one = fun(i + 1, n, costs,dp) + 1 + costs[i];

        int two = Integer.MAX_VALUE;
        if (i + 2 <= n)
            two = fun(i + 2, n, costs,dp) + 4 + costs[i + 1];

        int three = Integer.MAX_VALUE;
        if (i + 3 <= n)
            three = fun(i + 3, n, costs,dp) + 9 + costs[i + 2];

        return dp[i]= Math.min(Math.min(one, two), three);
    }

}