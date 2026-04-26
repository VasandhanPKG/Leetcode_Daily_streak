class Solution {
    public String countAndSay(int n) {
        String cur="1";
        if(n==1) return cur;
        for(int i=2;i<=n;i++)
        {
            StringBuilder sb=new StringBuilder();
            int count=1;
            char ele=cur.charAt(0);
            for(int j=1;j<cur.length();j++)
            {
               char curChar=cur.charAt(j);
               if(curChar==ele) count++;
               else
               {
                sb.append(count).append(ele);
                ele=curChar;
                count=1;
               }
            }
            sb.append(count).append(ele);
            cur=sb.toString();
        }
        return cur;
    }
}