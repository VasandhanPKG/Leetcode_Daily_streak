class Solution {
    public int reverseDegree(String s) {
        
        int rev_deg=0;
        int index=1;
        for(char ch:s.toCharArray())
        {
            rev_deg+=index*('z'-ch+1);
            index++;
        }
        return rev_deg;
    }
}