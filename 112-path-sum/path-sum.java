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
    boolean found;
    public void inorder(TreeNode root, int targetSum,int sum){
        if(root==null) return;
        if(found) return;

        sum+=root.val;
        if(root.left==null && root.right==null){
        if(targetSum==sum) found=true;
        return;
        }
        inorder(root.left,targetSum,sum);
        inorder(root.right,targetSum,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        inorder(root,targetSum,0);
        return found;

    }
}