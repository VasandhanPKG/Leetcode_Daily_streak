class Solution {
    public boolean checkOnesSegment(String s) {
        boolean change=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0') change=true;
            if(s.charAt(i)=='1'&& change==true) return false;
        }
        return true;
        
    }
}