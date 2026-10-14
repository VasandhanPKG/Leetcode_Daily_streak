class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] psee=get_psee(arr);
        int[] nse=get_nse(arr);
        long res=0;
        long mod=1000000007;
        for(int i=0;i<n;i++)
        {
            long left=i-psee[i];
            long  right=nse[i]-i;
            res= (res+(left*right*arr[i])%mod)%mod;
        }
        return (int) res;
    }
    public int[] get_psee(int[] arr)
    {
        int n=arr.length;
        int psee[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]) stack.pop();
            psee[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);

        }
        return psee;
    }
    public int[] get_nse( int[] arr)
    {
        int n=arr.length;
        int nse[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]) stack.pop();
            nse[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        return nse;
    }
}