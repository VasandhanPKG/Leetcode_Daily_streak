class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int degree[]=new int[n];
        long cost=1;
        long res=0;
        for(int[] road:roads)
        {
            degree[road[0]]++;
            degree[road[1]]++;
        }
        Arrays.sort(degree);
        for(int deg:degree)
        {
           res+=deg*(cost++);
        }
        return res;

        
    }
}