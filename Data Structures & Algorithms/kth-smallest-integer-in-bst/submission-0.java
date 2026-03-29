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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        kthSmallestHelper(root, list);

        for(int i = 0; i < list.size(); i++){
            if(k == i+1){
                return list.get(i);
            }
        }

        return -1;
    }

    public void kthSmallestHelper(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        kthSmallestHelper(root.left, list);
        list.add(root.val);
        kthSmallestHelper(root.right, list);
    }
}
