// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
// A leaf is a node with no children.

import javax.swing.tree.TreeNode;

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int target;
        return helper(root,0);
    }
    public boolean helper(TreeNode root, int sum){
        if(root == null){
            return false;
        }
        sum += root.val;
        if(root.left == null && root.right == null){
            return sum == target;
        }
        boolean lans = helper(root.left, sum);
        boolean rans = helper(root.right, sum);
        return lans || rans;
    }
}