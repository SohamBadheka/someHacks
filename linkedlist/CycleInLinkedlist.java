public class CycleInLinkedList {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        boolean flag = false;
        while(p != null && q != null){
        if (q.next == null || p.next == null) return null;
        p = p.next;
       
        q = q.next.next;
        if (p == q) { flag = true; break; }
            
        }
        if(flag != true)
            return null;
        p = head;
        while(p != q){
            p = p.next;
            q = q.next;
        }
        return p;
        
    }
}