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
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        } else {
            queue.add(root);
            while (!queue.isEmpty()) {
                int levelLength = queue.size();
                for (int i = 0; i < levelLength; i++) {
                    TreeNode curr = queue.removeFirst();
                    // Only add the value of the last node at the current level (rightmost node)
                    if (i == levelLength - 1) {
                        list.add(curr.val);
                    }
                    // Add left child first, so the right child will be processed last (and be the rightmost)
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
            }
            return list;
        }
    }
}
