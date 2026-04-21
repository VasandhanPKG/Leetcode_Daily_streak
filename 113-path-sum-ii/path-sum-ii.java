/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> output=new ArrayList<>();
        dfs(root,0,targetSum,output,new ArrayList<>());
        return output;
        
    }
    private void dfs(TreeNode root,int CurrentSum ,int targetSum, List<List<Integer>> output, List<Integer> currentpath)
    {
        if(root==null) return ;
        CurrentSum+=root.val;
        currentpath.add(root.val);
        if(root.left==null && root.right==null && CurrentSum==targetSum)
        {
            output.add(new ArrayList<>(currentpath));
        }
        dfs(root.left,CurrentSum,targetSum,output,currentpath);
        dfs(root.right,CurrentSum,targetSum,output,currentpath);
        currentpath.remove(currentpath.size()-1);
    }
}