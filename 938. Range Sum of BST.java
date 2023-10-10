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
    static int sum;
    public static void add(TreeNode root, int low, int high){
        if(root==null){
            return;
        }
        if(root.val<=high&&root.val>=low){
            sum+=root.val;
        }
        add(root.left,low,high);
        add(root.right,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        add(root,low,high);
        return sum;
    }
}
