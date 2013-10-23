
public class Solution {
	public static TreeNode insertR(TreeNode root, int value) {
		if(root == null) root = new TreeNode(value);
		while(root != null) {
			if(value < root.val) {
				if(root.left == null) {
					root.left = new TreeNode(value);
				} else {
					insertR(root.left, value);
				}
			} else if(value > root.val) {
				if(root.right == null) {
					root.right = new TreeNode(value);
				} else {
					insertR(root.right, value);
				}
			} else {
				throw new IllegalArgumentException("No Duplicates!");
			}
		}
		return root;
	}
	
	public static TreeNode insertNon(TreeNode root, int value) {
		if(root == null) root = new TreeNode(value);
		while(root != null) {
			if(value < root.val) {
				if(root.left == null) {
					root.left = new TreeNode(value);
				} else {
					root = root.left;
				}
			} else if(value > root.val) {
				if(root.right == null) {
					root.right = new TreeNode(value);
				} else {
					root = root.right;
				}
			} else {
				throw new IllegalArgumentException("No Duplicates!");
			}
		}
		return root;
	}

}
