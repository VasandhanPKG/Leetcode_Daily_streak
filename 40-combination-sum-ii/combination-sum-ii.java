class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();

        Arrays.sort(candidates);
        backtrack(0,target,candidates,new ArrayList<>(),res);
        return res;
        
    }
    public void backtrack(int i, int target,int[] candidates,List<Integer> cur, List<List<Integer>> res)
    {
        if(target==0) 
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        if(target<0||i==candidates.length)      return;
        cur.add(candidates[i]);
        backtrack(i+1,target-candidates[i],candidates,cur,res);
        cur.remove(cur.size()-1);
        while (i + 1 < candidates.length &&
               candidates[i] == candidates[i + 1]) {
            i++;
        }
        backtrack(i+1,target,candidates,cur,res);

    }
}