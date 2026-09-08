
class Solution {
    public int subsetXORSum(int[] nums) {
        
        int sum=0;
        List<List<Integer>> subsets=new ArrayList<>();
        getSubset(0,nums,new ArrayList<>(),subsets);
        for(List<Integer> subset:subsets)
        {
            int xor=0;
            for(int num:subset)
            {
                xor^=num;
            }
            sum+=xor;
        }
        return sum;
    }
    public void getSubset(int i ,int [] nums, List<Integer> subset, List<List<Integer>> result)
    {
        if(i==nums.length)
        {
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        getSubset(i+1,nums,subset,result);
        subset.remove(subset.size()-1);
        getSubset(i+1,nums,subset,result);

    }
}