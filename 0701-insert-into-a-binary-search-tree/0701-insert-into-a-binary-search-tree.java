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
    public void insert(TreeNode root, int val) {
      if(root.val > val) {
        if(root.left == null) {
          TreeNode t = new TreeNode(val);
          root.left = t;
        } else {
          insert(root.left,val);
        }
      } else {
        if(root.right == null) {
          TreeNode t = new TreeNode(val);
          root.right = t;
        } else {
          insert(root.right, val);
        }
      }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        insert(root,val);
        return root;
    }
}