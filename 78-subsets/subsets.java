class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> Subsets=new ArrayList<>();
        getSubset(0,nums,new ArrayList<>(),Subsets);
        return Subsets;
    }
    public void getSubset(int i,int[] arr,List<Integer> subset, List<List<Integer>> result)
    {
        if(i==arr.length)
        {
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(arr[i]);
        getSubset(i+1,arr,subset,result);
        subset.remove(subset.size()-1);
        getSubset(i+1,arr,subset,result);

    }
}