package LinkedList;

public class LL_DeletedTargetElement {

	public ListNode deleteElement(ListNode head,int target) {
		ListNode tag=head,prev=null;
		while(tag.data!=target) {
			prev=tag;
			tag=tag.next;
		}
		prev.next=tag.next;
		return head;
	}
}
