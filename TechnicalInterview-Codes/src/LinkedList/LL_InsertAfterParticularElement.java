package LinkedList;

public class LL_InsertAfterParticularElement {
	public ListNode InsertAfterAParticularElement(ListNode head,int data, int target) {
		ListNode newNode=new ListNode(data);
		ListNode tag=head;
		while(tag.data!=target) {
			tag=tag.next;
		}
		newNode.next=tag.next;
		tag.next=newNode;
	
		return head;
	}
}
