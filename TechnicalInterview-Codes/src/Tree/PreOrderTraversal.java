package Tree;

public class PreOrderTraversal {

	public void preOrderTraversal(BinaryTreeNode root) {
		if(root!=null) {
			System.out.print(root.getData()+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
}
