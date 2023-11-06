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
    static List<Integer> l1=new ArrayList<>();
    static void gst(TreeNode root){
        if(root==null){ 
            return;
            }
            int x=root.val;
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)>x){
                root.val+=l1.get(i);
            }
        }
        gst(root.right);
        gst(root.left);
    }
    static void add(TreeNode root){
        if(root==null){
            return;
            }
        l1.add(root.val);
        add(root.left);
        add(root.right);
    }
    public TreeNode bstToGst(TreeNode root) {
        l1.clear();
        add(root);
        gst(root);
        return root;
    }
}
