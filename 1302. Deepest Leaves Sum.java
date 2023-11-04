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
    static int s,i,max;
    public static void sum(TreeNode root){
        if(root==null){
            return;
        }
        if(max<i){
            max=i;
            s=0;
        }
        if(i==max){
            s+=root.val;
        }
        i++;
        sum(root.left);
        sum(root.right);
        i--;
    }
    public int deepestLeavesSum(TreeNode root) {
        i=0;
        s=0;
        max=0;
        sum(root);
        return s;
    }
}
