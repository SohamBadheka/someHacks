public class isSubtreeCheck {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
      if(isSame(s, t))
        return true;
     
      return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    public boolean isSame(TreeNode s, TreeNode t){
        if(s == null && t == null)
            return true;
        if(s == null || t == null){
            return false;
        }
        if(s.val == t.val)
            return true;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
    
  
}