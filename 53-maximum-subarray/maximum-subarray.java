class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int num:nums)
        {
            current_sum+=num;
            if (current_sum>max_sum) max_sum=current_sum;
            if (current_sum<0) current_sum=0;

                   
        }
        return max_sum;
    }
}