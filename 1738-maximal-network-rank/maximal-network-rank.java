class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int [] degree=new int[n];
        Set<String> roadset=new HashSet<>();
        for(int [] road:roads)
        {
            degree[road[0]]++;
            degree[road[1]]++;
            roadset.add(road[0]+","+road[1]);
            roadset.add(road[1]+","+road[0]);

        }
        int max_rank=0;
        for(int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                int rank=degree[i]+degree[j];
                if(roadset.contains(i+","+j))
                {
                    rank--;
                }
                max_rank=Math.max(max_rank,rank);
            }
        }
        return max_rank;
    }
}