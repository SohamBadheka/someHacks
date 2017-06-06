public class ReverseLinkedlist {
 public ListNode reverseList(ListNode head) {
    
    ListNode l = head;
    ListNode prev = null;
    ListNode curr = null;
    
    ListNode next = null;
    if(l == null)
        return null;
    if(l.next == null)
        return l;
    while(l!=null){
        curr = l;
        next = l.next;
        curr.next = prev;
        prev = curr;
        l = next;
     
    }
    return curr;

}
}