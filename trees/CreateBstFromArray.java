 
public class CreateBstFromArray {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int len = nums.length;
        TreeNode head = makeTree(nums, 0, len-1);
        return head;
    }
    public TreeNode makeTree(int nums[], int start, int end){
        
        if(start>end)
            return null;
            
        int mid = (start + end)/2;
        
        TreeNode tn = new TreeNode(nums[mid]);
        tn.left = makeTree(nums, start, mid-1);
        tn.right = makeTree(nums, mid+1, end);
        return tn;
    }
}