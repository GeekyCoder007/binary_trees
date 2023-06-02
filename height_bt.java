// determine the height of the binary tree 
import java.util.*;
class height_dp {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int data) {
			this.val = data;
			this.left = null;
			this.right = null;
		}
	}
	static int tree_height(TreeNode root) {
		if(root==null) {
			return 0;
		} 
		int left_tree_depth = tree_height(root.left); // recursive dfs on every left node
		int right_tree_depth = tree_height(root.right); // recursive dfs on every right node
		// if left > right 
		// 		return left+1 
		// or vice versa because , when a node is correctly found , increase the height 
		return (left_tree_depth>right_tree_depth)?left_tree_depth+1:right_tree_depth+1;
	}
	public static void main(String[]args){
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		root.left = node1;
		root.right = node2;
		root.left.left = node3;
		root.left.right = node4;
		System.out.println("Height of the tree is : "+tree_height(root));
	}
}
