import java.util.*;
class create_bt_java {
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
    
    // This is how we can create a binary tree in java
    
	}
}
