class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int ele:nums)
        {
            sum+=ele;
            if(ele<min)
            {
                min=ele;
            }
        }
     
         return sum-nums.length*min;
        

        
    }
}