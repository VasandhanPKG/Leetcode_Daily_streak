class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (get_digit_sum(nums[i]) == i)
                return i;
        }
        return -1;

    }

    public int get_digit_sum(int num) {
        int sum = 0;
        if (num < 10)
            return num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;

        }
        return sum;
    }
}