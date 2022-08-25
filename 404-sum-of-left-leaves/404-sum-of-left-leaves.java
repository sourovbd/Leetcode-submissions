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
    Integer sum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        if (root.left == null && root.right == null)
            return 0;
        traverse(root);
        return sum;
    }
    private void traverse(TreeNode root) {
        if (root.left == null && root.right == null) {
            sum += root.val;
        }
        if (root.left != null) {
            traverse(root.left);
        }


        if (root.right != null) {
            if ( root.right.left == null && root.right.right == null) {
                root.right.val = 0;          
            }
            traverse(root.right);
        }
    }
}