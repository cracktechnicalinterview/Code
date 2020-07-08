package LinkedList;

public class LL_InsertAtEnd {
	
	public ListNode InsertAtEnd(ListNode head,int data) {
		ListNode newNode=new ListNode(data);
		newNode.next=null;
		
		ListNode tag=head;
		while(tag.next!=null)
			tag=tag.next;
		
		tag.next=newNode;
		return head;
	}
}
