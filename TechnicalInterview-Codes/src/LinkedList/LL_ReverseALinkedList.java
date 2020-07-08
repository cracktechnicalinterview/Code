package LinkedList;

public class LL_ReverseALinkedList {

	public ListNode reverseLinkedList(ListNode head) {
		ListNode current,prev,next;
		prev=null;next=null;
		current=head;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}
}
