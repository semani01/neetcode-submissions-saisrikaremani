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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root != null) {
            queue.add(root);
        }
        List<List<Integer>> traversalMat = new ArrayList<>();
        while(!queue.isEmpty()){
            int levelLength = queue.size();
            List<Integer> row = new ArrayList<>();
            for(int i = 0; i < levelLength; i++){
                TreeNode curr = queue.removeFirst();
                row.add(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            traversalMat.add(row);

        }

        return traversalMat;
    }
}
