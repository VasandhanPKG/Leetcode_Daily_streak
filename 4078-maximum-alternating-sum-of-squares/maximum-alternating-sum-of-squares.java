class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] square= new long[nums.length];
        for (int i = 0; i < nums.length; i++)
            square[i] = (long) nums[i] * nums[i];

        Arrays.sort(square);
        long result = 0;
        int k = nums.length / 2; 
        for (int i = 0; i < k; i++)
            result -= square[i];
        for (int i = k; i < nums.length; i++)
            result  += square[i];

        return result;
    }
}