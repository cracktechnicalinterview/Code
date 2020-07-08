package LinkedList;

public class LinkedList {
	
	ListNode head;
	


	


	public static void main(String[] args) {

		
		LinkedList list=new LinkedList();
		ListNode head=list.head;
		
		LL_InsertAtBeginning insBeg=new LL_InsertAtBeginning();
		LL_InsertAtEnd insEnd=new LL_InsertAtEnd();
		LL_Display llDisplay=new LL_Display();
		LL_InsertAfterParticularElement insEle=new LL_InsertAfterParticularElement();
		LL_ReverseALinkedList reverse=new LL_ReverseALinkedList();
		
		
		
		head=insBeg.InsertAtBeginning(head, 5);
		head=insBeg.InsertAtBeginning(head, 6);
		head=insBeg.InsertAtBeginning(head, 7);
		
		llDisplay.display(head);
		head=insBeg.InsertAtBeginning(head, 9);
		llDisplay.display(head);
		head=insEnd.InsertAtEnd(head, 10);
		llDisplay.display(head);
		head=insEle.InsertAfterAParticularElement(head, 99, 6);
		llDisplay.display(head);
		head=insEle.InsertAfterAParticularElement(head, 11, 5);
		llDisplay.display(head);
		head=reverse.reverseLinkedList(head);
		llDisplay.display(head);
		
	}

}
