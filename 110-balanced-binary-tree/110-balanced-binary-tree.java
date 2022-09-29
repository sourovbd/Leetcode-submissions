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
    public boolean isBalanced(TreeNode root) {
        // If the tree is empty, we can say it’s balanced...
        if (root == null)  return true;
        // Height Function will return -1, when it’s an unbalanced tree...
		if (Height(root) == -1)  return false;
		return true;
	}
    // Create a function to return the “height” of a current subtree using recursion...
	public static int Height(TreeNode root) {
        if (root == null)  return 0;
        
        int leftHeight = 0, rightHeight = 0;

        leftHeight = Height(root.left);

        rightHeight = Height(root.right);

        if (leftHeight == -1 || rightHeight == -1)  {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1)  {
             return -1;
        }
           
        return Math.max(leftHeight, rightHeight) + 1;
    }
}