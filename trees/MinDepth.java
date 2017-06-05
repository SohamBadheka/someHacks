public class MinDepth {

    
    public int diameterOfBinaryTree(TreeNode root) {
        int depth = minDepth(root);
        return depth;
    }
    
    private int minDepth(TreeNode root) {
        if (root == null) return 0;
        if(root.left == null && root.right == null)
            return 1;
        
        if(root.left!=null)
            
            int left = minDepth(root.left);
        
        if(root.right!=null)
    
            int right = minDepth(root.right);
        
        return Math.min(left, right) + 1;
    }
}