class Solution {
    final int mod=1_000_000_007;
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][][] = new int[m][n][3];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return fun(m-1, n-1, 0,grid,dp);
    }
    public int fun(int i, int j,int last_move,int[][] grid ,int[][][] dp)
    {
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j][last_move] !=-1) return dp[i][j][last_move];
        long ans=0;

        if(grid[i][j]==1)
        {
            if(last_move==1) ans=fun(i,j-1,2,grid,dp);
            else  ans=fun(i-1,j,1,grid,dp);
        }
        else
        {
        int up=fun(i-1,j,1,grid,dp);
        int left=fun(i,j-1,2,grid,dp);
        ans=(up+(long)left)%mod;
        }
         dp[i][j][last_move]=(int) ans;
        return  dp[i][j][last_move];

    }
}