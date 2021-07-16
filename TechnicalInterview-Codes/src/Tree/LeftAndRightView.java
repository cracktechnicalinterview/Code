package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftAndRightView {

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	public static void leftAndRightSideView(Node root) {

		ArrayList<Node> leftView = new ArrayList<LeftAndRightView.Node>();
		ArrayList<Node> rightView = new ArrayList<LeftAndRightView.Node>();

		Queue<Node> q = new LinkedList<LeftAndRightView.Node>();
		q.offer(root);

		while (!q.isEmpty()) {

			int size = q.size();

			for (int i = 0; i < size; i++) {

				Node current = q.poll();

				if (i == 0)
					leftView.add(current);
				if (i == size - 1)
					rightView.add(current);

				if (current.left != null)
					q.offer(current.left);
				if (current.right != null)
					q.offer(current.right);

			}
		}
		
		System.out.println("left Hand side view: ");
		for(int i=0;i<leftView.size();i++) {
			System.out.print(leftView.get(i).data+" ");
		}
		
		System.out.println();
		
		System.out.println("Right Hand side view: ");
		for(int i=0;i<rightView.size();i++) {
			System.out.print(rightView.get(i).data+" ");
		}

	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);

		root.right.left = new Node(5);
		root.right.right = new Node(6);

		root.right.left.left = new Node(7);

		leftAndRightSideView(root);

	}

}
