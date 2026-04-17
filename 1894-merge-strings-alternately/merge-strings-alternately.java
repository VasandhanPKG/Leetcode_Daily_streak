class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        
        String res="";
        int i=0;
        int j=0;
        int m=word1.length();
        int n=word2.length();
        int ind=0;
        while(i<m && j<n)
        {
          res+=word1.charAt(i);
          res+=word2.charAt(j);
          i++;
          j++;
        }
        while(i<m)
        {
          res+=word1.charAt(i);
          i++;

        }
        while(j<n)
        {
          res+=word2.charAt(j);
          j++;
        }
       return res;
    }
}