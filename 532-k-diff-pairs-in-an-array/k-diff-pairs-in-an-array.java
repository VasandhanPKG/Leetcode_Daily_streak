class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int num : freq.keySet()) {
            if (k == 0) {
                if (freq.get(num) > 1) count++;
            } else {
                if (freq.containsKey(num + k)) count++;
            }
        }
        return count;
    }
}
