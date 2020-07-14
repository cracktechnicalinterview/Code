package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class LevelOrderTraversal {

	public ArrayList<Integer> levelOrderTraversal(BinaryTreeNode root){
		
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		if(root==null)
			return result;
		
		Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			BinaryTreeNode node=queue.poll();
			result.add(node.getData());
			
			if(node.getLeft()!=null)
				queue.offer(node.left);
			if(node.getRight()!=null)
				queue.offer(node.right);
			
		}
		
		return result;
	}
}
