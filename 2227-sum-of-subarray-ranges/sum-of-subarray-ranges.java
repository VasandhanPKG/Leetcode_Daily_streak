class Solution {
    public long subArrayRanges(int[] nums) {
        long result = subArrayMax(nums) - subArrayMin(nums);
        return result;
    }

    public long subArrayMin(int[] arr) {
        int n = arr.length;
        int[] psee = get_psee(arr);
        int[] nse = get_nse(arr);
        long res = 0;
        long mod = 1000000007;
        for (int i = 0; i < n; i++) {
            long left = i - psee[i];
            long right = nse[i] - i;
            res = (res + (left * right * arr[i]));
        }
        return res;
    }

    public long subArrayMax(int[] arr) {
        int n = arr.length;
        int[] pgee = get_pgee(arr);
        int[] nge = get_nge(arr);
        long res = 0;
        long mod = 1000000007;
        for (int i = 0; i < n; i++) {
            long left = i - pgee[i];
            long right = nge[i] - i;
            res = (res + (left * right * arr[i]));
        }
        return res;
    }

    public int[] get_psee(int[] arr) {
        int n = arr.length;
        int psee[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i])
                stack.pop();
            psee[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);

        }
        return psee;
    }

    public int[] get_nse(int[] arr) {
        int n = arr.length;
        int nse[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                stack.pop();
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return nse;
    }

    public int[] get_pgee(int[] arr) {
        int n = arr.length;
        int pgee[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i])
                stack.pop();
            pgee[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);

        }
        return pgee;
    }

    public int[] get_nge(int[] arr) {
        int n = arr.length;
        int nge[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i])
                stack.pop();
            nge[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return nge;
    }
}