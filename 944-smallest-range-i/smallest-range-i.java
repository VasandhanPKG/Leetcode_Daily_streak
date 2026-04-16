class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:nums)
        {
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        if((max-min)<= 2*k) return 0;
        return max-min-2*k;
    }
}