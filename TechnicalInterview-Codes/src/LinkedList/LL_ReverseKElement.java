package LinkedList;

public class LL_ReverseKElement {
	public ListNode reverseKNode(ListNode node, int k) {
		ListNode current = node;
		ListNode next = null;
		ListNode prev = null;
		int count = 0;
		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		if (next != null)
			node.next = reverseKNode(next, k);

		return prev;
	}
}
