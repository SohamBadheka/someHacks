/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedlist {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode fast = head;
        Stack<Integer> st = new Stack<Integer>();
        if(head == null || head.next == null)
            return true;
            
        while(fast != null && fast.next != null){
            st.push(curr.val);
            curr = curr.next;
            fast = fast.next.next;
        }
        if(fast != null){
            curr = curr.next;
        }
       
        if(st.empty()){

            return true;
        }
        else{
           
             while(curr != null && st.peek() == curr.val){
                st.pop();
                curr = curr.next;
            }
           return st.empty();
        
        }
        
    }
    
}