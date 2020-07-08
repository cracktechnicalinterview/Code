package LinkedList;

public class LL_InsertAtBeginning {
	
	public ListNode InsertAtBeginning(ListNode head, int data) {
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;
		return head;
	}
	
}
