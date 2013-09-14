/**
 * 
 * @author GGPAUE
 * find the kth largest element in a BST
 *
 */

public class Solution {
	public static TreeNode findKthLargest(TreeNode root, int k) {
																	
		if(root == null) return null;
									
		int counter = 0;
		
		TreeNode temp = findKthLargest(root.right, k);
		
		
		if(++counter == k) {
			return root;
		} else if (counter < k) {
			temp = findKthLargest(root.left, k);
		}
		return temp;
	}

}
