class Solution {
    public String maxSumOfSquares(int num, int sum) {
       StringBuilder res=new StringBuilder();
        for(int i=num;i>0;i--)
        {
            int n=9;
            while(sum<n && n>=0)n--;
            if(sum>=n)
            {
                res.append(n+"");
                sum-=n;
            }
            // else 
            // {
            //     return "";
            // }
        }
        if(sum==0)
        return res.toString();
        else return "";
    }
}