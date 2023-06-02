// check whether 2 binary trees are equal or not 


import java.util.*;
class bin_equal {
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
	static void inorder(TreeNode root) {
		if(root==null) {return;}
		inorder(root.left);
		System.out.print(root.val+" ");
		inorder(root.right);
	}
	static boolean isIdentical(TreeNode root1,TreeNode root2){
		 if(root1==null && root2==null) return true;
		
	   	 if(root1!=null && root2!=null) {
	        	return (root1.data==root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right));
	    	 }
	  	 return false;
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
		
		TreeNode root1 = new TreeNode(1);
		TreeNode node11 = new TreeNode(2);
		TreeNode node12 = new TreeNode(3);
		TreeNode node13 = new TreeNode(4);
		TreeNode node14 = new TreeNode(5);
		root1.left = node11;
		root1.right = node12;
		root1.left.left = node13;
		root1.left.right = node14;
		
		System.out.println(isIdentical(root,root1));
		
	}
}
