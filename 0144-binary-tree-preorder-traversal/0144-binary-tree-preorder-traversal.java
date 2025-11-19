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
    LinkedList<Integer> ans = new LinkedList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
      if(root == null) return new LinkedList<Integer>();
      // System.out.println(root.val);
      ans.add(root.val);
      preorderTraversal(root.left);
      preorderTraversal(root.right);
      return ans;
    }
}