class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int n=nums.length;
        for (int i = 0; i < n / 2; i++) {
            res += (nums[n - i - 1] - nums[i]);
        }
        return res;

    }
}