package LinkedList;

public class LinkedList {
	
	ListNode head;
	
	public ListNode InsertAtBeginning(ListNode head, int data) {
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	public void display(ListNode head) {
		ListNode tag=head;
		while(tag!=null) {
			System.out.print(tag.data+" ");
			tag=tag.next;
		}
	}
	
	public ListNode InsertAtEnd(ListNode head,int data) {
		ListNode newNode=new ListNode(data);
		newNode.next=null;
		
		ListNode tag=head;
		while(tag.next!=null)
			tag=tag.next;
		
		tag.next=newNode;
		return head;
	}
	
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

	public static void main(String[] args) {

		LinkedList list=new LinkedList();
		ListNode head=list.head;
		
		head=list.InsertAtBeginning(head, 5);
		head=list.InsertAtBeginning(head, 6);
		head=list.InsertAtBeginning(head, 7);
		
		list.display(head);
		System.out.println();
		head=list.InsertAtBeginning(head, 9);
		list.display(head);
		System.out.println();
		head=list.InsertAtEnd(head, 10);
		list.display(head);
		
		System.out.println();
		head=list.InsertAfterAParticularElement(head, 99, 6);
		list.display(head);
		System.out.println();
		head=list.InsertAfterAParticularElement(head, 11, 5);
		list.display(head);
		
	}

}
