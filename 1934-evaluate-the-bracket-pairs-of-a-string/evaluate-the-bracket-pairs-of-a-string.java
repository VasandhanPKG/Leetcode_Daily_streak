class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();
        for(List<String> pair : knowledge)
        {
           map.put(pair.get(0),pair.get(1));
        }
        int index=0;
        StringBuilder result=new StringBuilder();
        while(index<s.length())
        {

            if(s.charAt(index)=='(')
            {
                index++;
                StringBuilder key=new StringBuilder();
                while(index<s.length()&&s.charAt(index)!=')')
                {
                    key.append(s.charAt(index));
                    index++;
                }
                if(map.containsKey(key.toString()))
                {
                    result.append(map.get(key.toString()));
                }
                else
                {
                    result.append("?");
                }
            }
            else
            {
                result.append(s.charAt(index));
            }
            index++;

        }
        return result.toString();
    }
}