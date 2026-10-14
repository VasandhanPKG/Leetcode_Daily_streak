class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        int count=0;
        int i=0;
        while(i<num.length())
        {
            int n=num.charAt(i)-'0';
            while(!st.isEmpty() && st.peek()>n && count<k)
            {
                st.pop();count++;
            }
            st.push(n);
            i++;

        }
        while(count<k)
        {
            st.pop();count++; 
        }
        StringBuilder sb=new StringBuilder();
        for(int dig:st)
        {
            if(!(sb.length()==0 && dig==0)) sb.append(dig);
        }
        return sb.length()==0?"0":sb.toString();
    }
    
}