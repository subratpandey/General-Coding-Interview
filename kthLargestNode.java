/**
 * 
 * @author GGPAUE
 * find the kth largest element in a BST
 *
 */

public class Solution {
	static int counter = 0;
	
	public static TreeNode findKthLargest(TreeNode root, int k) {															
		if(root == null) return null;
					
		if(root != null) {
			TreeNode right = findKthLargest(root.right, k);
			counter++;
			if (right != null) {
				return right;
		    }
		
			if(counter == k) {
				return root;
			} else if(counter < k) {
				TreeNode left = findKthLargest(root.left, k);
				if (left != null) {
					return left;
			    }
			}
			
		}
		return null;
		
	}


}
