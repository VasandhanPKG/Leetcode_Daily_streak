class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n=nums.length;
        long mod = 1000000007L;
        long[] prefix = new long[n+1];
        for (int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }
        Stack<Integer> stack=new Stack<>();

        int left[]=new int[n];
        int right[]=new int[n];
       for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) stack.pop();
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();

        for (int i = n-1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) stack.pop();
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        } 
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long subSum = prefix[right[i]] - prefix[left[i]+1];
            ans = Math.max(ans, subSum * nums[i]);
        }

        return (int)(ans % mod);  
        
    }
}