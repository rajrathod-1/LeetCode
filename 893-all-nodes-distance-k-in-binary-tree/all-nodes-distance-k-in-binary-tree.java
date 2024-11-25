/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    // Helper method to mark the parent of each node using BFS
    private void markParent(TreeNode root, Map<TreeNode, TreeNode> parentTrack) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if(curr.left != null) {
                parentTrack.put(curr.left, curr);
                queue.offer(curr.left);
            }
            if(curr.right != null) {
                parentTrack.put(curr.right, curr);
                queue.offer(curr.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // Step 1: Mark parents of each node
        Map<TreeNode, TreeNode> parentTrack = new HashMap<>();
        markParent(root, parentTrack);

        // Step 2: BFS to find all nodes at distance k
        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target, true);
        int currLevel = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            if(currLevel == k) break;
            currLevel++;
            for(int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                // Check left child
                if(current.left != null && visited.get(current.left) == null) {
                    queue.offer(current.left);
                    visited.put(current.left, true);
                }
                // Check right child
                if(current.right != null && visited.get(current.right) == null) {
                    queue.offer(current.right);
                    visited.put(current.right, true);
                }
                // Check parent node
                TreeNode parent = parentTrack.get(current);
                if(parent != null && visited.get(parent) == null) {
                    queue.offer(parent);
                    visited.put(parent, true);
                }
            }
        }

        // Step 3: Collect the results at level k
        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            result.add(curr.val);
        }
        return result;
    }
}