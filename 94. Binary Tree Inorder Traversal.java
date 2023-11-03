class Solution {
    static List<Integer> l1=new ArrayList<>();
    public void inorder(TreeNode root) {
        if(root==null){
            return;
        }
       
        inorder(root.left);
        l1.add(root.val);
        inorder(root.right);
       
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        l1.clear();
        inorder(root);
        return l1;
    }
}
