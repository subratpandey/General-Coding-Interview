public class Solution {
	public TreeNode findNextNode(TreeNode node) {
		if(node == null) return null;
		if(node.right != null) {
			node = node.right;
			while(node.left != null) {
				node = node.left;
			}
			return node;	
		}
		
		if(node.parent != null) {
			TreeNode parent = node.parent;
			if(parent.left.val == node.val) {
				return parent;
			} else if(parent.right.val == node.val) {
				while(parent.parent != null) {
					TreeNode prev = parent.parent;
					if(prev.left.val == parent.val) {
						break;
					} else if(prev.right.val == parent.val) {
						prev = parent.parent;
					}
				}
				return parent.parent;
			}
		}
		return null;
	}

}
