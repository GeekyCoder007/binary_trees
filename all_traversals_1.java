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
	static void level_order_traversal(TreeNode root) {
		List<List<Integer>> levels = new ArrayList<>();
		if(root==null) return 0;
		// this is the iterative BFS method
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> curr_level = new ArrayList<>();
			for (int i=0;i<size;++i) {
				TreeNode curr = q.poll();
				curr_level.add(curr.val);
				if(curr!=null && curr.left!=null) {q.offer(curr.left);}
				if(curr!=null && curr.right!=null) {q.offer(curr.right);}
			}
			levels.add(curr_level);
		}
		//System.out.println("The level order traversal is");
		//System.out.println(levels);
		System.out.println("The height of the binary tree is : "+levels.size());
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
		level_order_traversal(root);System.out.println();
		
	}
}
