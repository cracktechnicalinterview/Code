package LinkedList;

public class LL_Display {

	public void display(ListNode head) {
		ListNode tag=head;
		while(tag!=null) {
			System.out.print(tag.data+" ");
			tag=tag.next;
		}
		
		System.out.println();
	}
}
