class Solution {
    public int cherryPickup(int[][] grid) {
        int n= grid.length;
        
        int[][][][] dp=new int[n][n][n][n];
        for (int[][][] arr1 : dp)
            for (int[][] arr2 : arr1)
                for (int[] arr3 : arr2)
                    Arrays.fill(arr3, Integer.MIN_VALUE);

        return Math.max(0,fun(grid, 0, 0, 0,0,dp));
    }

    public int fun(int[][] grid, int i1, int j1, int i2, int j2, int[][][][] dp) {
        int n= grid.length;
        if (i1 >= n|| j1 >=n || i2 >=n|| j2 >=n ) return Integer.MIN_VALUE;
   
        if (grid[i1][j1] == -1 || grid[i2][j2] == -1) return Integer.MIN_VALUE;

    
        if (i1 == n- 1 && j1 == n- 1 && i2 == n-1 && j2 == n-1) 
        return grid[i1][j1] ; 

       if (dp[i1][j1][i2][j2] != Integer.MIN_VALUE) {
            return dp[i1][j1][i2][j2];
        } 

        int chocolates = (i1 == i2 && j1 == j2) ? grid[i1][j1] : grid[i1][j1] + grid[i2][j2];

        int best = Integer.MIN_VALUE;
       
        best = Math.max(best, fun(grid, i1 + 1, j1, i2 +1, j2,dp)); 
        best = Math.max(best, fun(grid, i1, j1 + 1, i2 + 1, j2,dp)); 
        best = Math.max(best, fun(grid, i1 + 1, j1, i2, j2 + 1,dp)); 
        best = Math.max(best, fun(grid, i1, j1 + 1, i2, j2 + 1,dp)); 
        return dp[i1][j1][i2][j2]=chocolates + best;
    }
}