public class MaxHeight {
  
    
    public int diameterOfBinaryTree(TreeNode root) {
        mx = maxDepth(root);
        return mx;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        if(root.left == null && root.right == null)
            return 1;
        
        if(root.left!=null)
            
            int left = maxDepth(root.left);
        
        if(root.right!=null)
    
            int right = maxDepth(root.right);
        
        return Math.max(left, right) + 1;
    }
}