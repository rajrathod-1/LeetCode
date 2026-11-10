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
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[1];
        ans[0] = Integer.MIN_VALUE;
        traverse(root, ans);
        return ans[0];
    }

    private int traverse(TreeNode node, int[] ans)
    {
        if(node == null)
            return 0;
        
        int lh = Math.max(0,traverse(node.left, ans));
        int rh = Math.max(0,traverse(node.right, ans));
        ans[0] = Math.max(ans[0], lh + rh + node.val);
        return node.val + Math.max(lh, rh);
    }
}
