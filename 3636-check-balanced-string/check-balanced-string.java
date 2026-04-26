class Solution {
    public boolean isBalanced(String num) {
        int even=0;
        int odd=0;
        int i=0;
        for(char ch:num.toCharArray())
        {
           if(i%2==0) even+=ch-'0';
           else odd+=ch-'0'; 
           i++;
        }
        return even==odd;
    }
}