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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)    return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++)
            {
                TreeNode curr = queue.poll();
                if(leftToRight)
                {
                    level.addLast(curr.val);
                }
                else{
                    level.addFirst(curr.val);
                }

                if(curr.left != null)   queue.offer(curr.left);
                if(curr.right != null)  queue.offer(curr.right);

            }
            result.add(level);
            leftToRight = !leftToRight;
        }

        return result;
    }
}