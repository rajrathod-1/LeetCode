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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));
        int maxWidth = 0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            int startIndex = queue.peek().index;
            int end = -1;

            for(int i = 0; i < size; i++)
            {
                Pair current =  queue.poll();
                end = current.index;
                TreeNode node = current.node;

                if(node.left != null)
                {
                    queue.offer(new Pair(node.left, 2* end));
                }

                if(node.right != null)
                {
                    queue.offer(new Pair(node.right, 2*end + 1));
                }

            }
            maxWidth = Math.max(maxWidth, (end - startIndex  + 1));

        }
        return maxWidth;
        
    }
}
class Pair{
    TreeNode node;
    int index;
    

    Pair(TreeNode node, int index)
    {
        this.node = node;
        this.index = index;
    }
}