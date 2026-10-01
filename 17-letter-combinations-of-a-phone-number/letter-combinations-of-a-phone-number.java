class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
       
        String mapping[] = {"",    "",    "abc",  "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits,result,mapping,new StringBuilder(),0);
        return result;
                              
    }

    public void solve(String digits, List<String> result, String[] mapping,StringBuilder comb,int i)
    {
        if(i>=digits.length())
        {
            result.add(comb.toString());
            return;
        }
        int num=digits.charAt(i)-'0';
        String value=mapping[num];
        for(int j=0;j<value.length();j++)
        {
            comb.append(value.charAt(j));
            solve(digits,result,mapping,comb,i+1);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}