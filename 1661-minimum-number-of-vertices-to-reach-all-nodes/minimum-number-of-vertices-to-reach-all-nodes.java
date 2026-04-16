class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] in=new int[n];
        for(List<Integer> edge:edges)
        {
            int val=edge.get(1);
            in[val]++;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(in[i]==0)res.add(i);
        }
        return res;
    }
}