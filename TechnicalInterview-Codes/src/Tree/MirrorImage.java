package TreeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorImage {

	public static BinaryTreeNode mirrorImage(BinaryTreeNode root) {
		
		if(root==null)
			return root;
		
		Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			
			BinaryTreeNode current=q.poll();
			
			if(current!=null) {				
				BinaryTreeNode temp=current.left;
				current.left=current.right;
				current.right=temp;
			}
			
			if(current.getLeft()!=null)
				q.offer(current.getLeft());
			if(current.getRight()!=null)
				q.offer(current.getRight());

		}
		return root;
	}
}
