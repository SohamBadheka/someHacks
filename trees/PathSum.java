public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root==null){
            return false;
        }
        if(root.left == null && root.right == null){
                if(sum == root.val)
                    return true;
                else
                    return false;
        }
        
        boolean a = hasPathSum(root.left, sum - root.val);
        boolean b = hasPathSum(root.right, sum - root.val);
        if(a || b)
            return true;
        else
            return false;
    } 
       
}