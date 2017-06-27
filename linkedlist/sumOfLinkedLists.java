
public class sumOfLinkedLists {
    public ListNode addLinkedLists(ListNode l1, ListNode l2) {
        ListNode pointer = new ListNode(0);
        ListNode ln = pointer;
        int remainder = 0;
       
        while(l1!=null || l2!= null){
            int val1 = l1 == null ? 0 : l1.val;
			int val2 = l2 == null ? 0 : l2.val;
            
            int newVal = val1 + val2;
            ListNode l = new ListNode((newVal + reminder)%10);
            ln.next = l;
            ln = ln.next;
            reminder = (val1 + val2)/10;
            l1 = l1 == null ? null : l1.next;
	    l2 = l2 == null ? null : l2.next;
            
        }
        ln.next = reminder == 0 ? null : new ListNode(reminder);
        return pointer.next;
    }
}
