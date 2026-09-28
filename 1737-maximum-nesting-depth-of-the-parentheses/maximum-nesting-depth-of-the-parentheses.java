class Solution {
    public int maxDepth(String s) {
        int brac=0;
        int max=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(') brac++;
            if(ch==')') brac--;
            max=Math.max(max,brac);
            
        }
        return max;
    }
}