class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] res= s.split("\\s+");
        int l=0;
        int r=res.length-1;
        while(l<r)
        {
            String temp=res[l];
            res[l]=res[r];
            res[r]=temp;
            l++;
            r--;

        }
         return String.join(" ", res);
    }
}