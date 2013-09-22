
public class Solution {
	public TreeNode findLca(TreeNode node, int t1, int t2) {
		if(node == null) return null;
		if(node.val > t2 && node.val > t1) {
			return findLca(node.left, t1, t2);
		} else if(node.val < t2 && node.val < t1) {
			return findLca(node.right, t1, t2);
		} else {
			return node;
		}
	}

}
