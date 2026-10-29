class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] candidates, int target, int index,
            List<Integer> cur, List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        cur.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, cur, res);
        cur.remove(cur.size() - 1);

        backtrack(candidates, target, index + 1, cur, res);
    }
}