class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int freq[] = new int[51];
        int max = 0;
        for (int num : nums) {
            freq[num]++;
            max = Math.max(max, num);
        }
        int ans = 0;
        if (k == n)
            return max;
        if (k == 1) {
            for (int i = 50; i >= 0; i--) {
                if (freq[i] == 1)
                    return i;
            }
        }
        if (freq[nums[n - 1]] == 1 && freq[nums[0]] == 1) {
            return (nums[0] > nums[n - 1]) ? nums[0] : nums[n - 1];
        }
        if (freq[nums[n - 1]] == 1)
            return nums[n - 1];
        if (freq[nums[0]] == 1)
            return nums[0];
        return -1;

    }
}