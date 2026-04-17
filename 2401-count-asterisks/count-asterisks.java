class Solution {
    public int countAsterisks(String s) {
        boolean flag=false;
        int count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='|') flag=!flag;
            if(!flag && ch=='*') count++;

        }
        return count;
    }
}