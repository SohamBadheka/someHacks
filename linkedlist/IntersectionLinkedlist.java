
public class IntersectionLinkedlist {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    int lenA = 0, lenB = 0;
    if(headA == null || headB == null)
        return null;
    while(headA != null){
        headA = headA.next;
        lenA++;
    }
    while(headB != null){
        headB = headB.next;
        lenB++;
    }
    
    
    // move headA and headB to the same start point
    while (lenA > lenB) {
       
        headA = headA.next;
        
        lenA--;
    }
    while (lenA < lenB) {
      
        headB = headB.next;
        lenB--;
    }
    // find the intersection until end
    while (headA != headB) {
        headA = headA.next;
        headB = headB.next;
    }
    return headA;
}

}  