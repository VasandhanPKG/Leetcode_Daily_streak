class Solution {
    public String addStrings(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();
        int length=(m>n)?m+1:n+1;
        
        int carry=0;
        int sum=0;
        m--;
        n--;
        StringBuilder res=new StringBuilder();
        while(m>=0 || n>=0 || carry!=0)
        {
          sum=carry;
          if(m>=0)
          {
            sum+=num1.charAt(m)-'0';m--;
          }
          if(n>=0)
          {
            sum+=num2.charAt(n)-'0';n--;
          }
          res.append(sum %10);
          carry=sum/10;
        }
        return res.reverse().toString();
    }
}