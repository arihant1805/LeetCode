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
        for(int i : l1){
            if(i>x){
                root.val+=i;
            }
        }
        gst(root.right);
        gst(root.left);
    }
    static void Add(TreeNode root){
        if(root==null){
            return;
            }
        Add(root.left);
        Add(root.right);
        l1.add(root.val);
    }
    public TreeNode convertBST(TreeNode root) {
        l1.clear();
        Add(root);
        gst(root);
        return root;
    }
}
