public class LowestCommonAncestor{
    public TreeNode getLCA(TreeNode root, TreeNode A, TreeNode B){
        if(root == null){
            return null;
        }
        if(root == A || root == B){
            return root;
        }
        TreeNode left = getLCA(root.left, A, B);
        TreeNode right = getLCA(root.right, A, B);
        if(left!=null && right!= null){
            return root;
        }
        if(left == null)
            return right;
        else
            return left;
    }
}