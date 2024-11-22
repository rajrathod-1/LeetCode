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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        preOrder(preOrderList, root);
        return preOrderList;
    }

    void preOrder(List<Integer> preOrderList, TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        preOrderList.add(node.val);
        preOrder(preOrderList, node.left);
        preOrder(preOrderList, node.right);

    }
}