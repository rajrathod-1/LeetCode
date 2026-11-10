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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] size = new int[1];
        findDiameter(root, size);
        return size[0];
    }

    private int findDiameter(TreeNode node, int[] size)
    {
        if(node == null)
            return 0;
        
        int lh = findDiameter(node.left, size);
        int rh = findDiameter(node.right, size);
        size[0] = Math.max(size[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
}