class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left_sum = new int[n];
        int[] right_sum = new int[n];
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            left_sum[i] = sum;
            sum += nums[i];
        }
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            right_sum[i] = sum;
            sum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(left_sum[i] - right_sum[i]);

        }

        return result;
    }
}