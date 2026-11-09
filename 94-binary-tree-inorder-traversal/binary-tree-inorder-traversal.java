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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> traverse = new ArrayList<>();
        traversal(root, traverse);
        return traverse;
    }

    private void traversal(TreeNode node, ArrayList<Integer> traverse)
    {
        if(node == null)
            return;
        
        traversal(node.left, traverse);
        traverse.add(node.val);
        traversal(node.right, traverse);
    }
}