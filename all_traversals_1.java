import java.util.*;
class all_traversals_1 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int item){
			this.val = item;
			this.left = null;
			this.right = null;
		}
	}
	static void inorder_traversal(TreeNode root){
		if(root==null) return;
		inorder_traversal(root.left);
		System.out.print(root.val+" ");
		inorder_traversal(root.right);
	}
	static void preorder_traversal(TreeNode root){
		if(root==null) return;
		System.out.print(root.val+" ");
		preorder_traversal(root.left);
		preorder_traversal(root.right);
	}
	static void postorder_traversal(TreeNode root) {
		if(root==null) return;
		postorder_traversal(root.left);
		postorder_traversal(root.right);
		System.out.print(root.val+" ");
	}
	public static void main(String[]args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		root.left = node1;
		root.right = node2;
		root.left.left = node3;
		root.left.right = node4;
		inorder_traversal(root);System.out.println();
		preorder_traversal(root);System.out.println();
		postorder_traversal(root);System.out.println();
		
	}
}
