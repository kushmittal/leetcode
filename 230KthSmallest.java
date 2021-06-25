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
    List<Integer> inorder = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        kthSmallestParse(root);
        return inorder.get(k-1);
       
    }
    
    public int kthSmallestParse(TreeNode root) {

        if(root == null){
            return -1;
        }

        kthSmallestParse(root.left);
        inorder.add(root.val);
        kthSmallestParse(root.right);

        return -1;
    }
}
