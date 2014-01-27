/**
 * 
 * @author GGPAUE
 * 
 * A binary tree is either an empty pointer or a node that consists of an integer value and two sub-trees.
 * A binary tree T is given. A node of that tree containing value V is described as visible if the path from the root of the tree to that node does not contain a node with any value exceeding V. In particular, the root is always visible and nodes with values lower than that of the root are never visible.
 * Assume that the following declarations are given:
 * class Tree {
 *   public int x;
 *   public Tree l;
 *   public Tree r;
 * }
 *
 * Write a function:
 * class Solution { public int solution(Tree T); }
 * that, given a binary tree T consisting of N nodes, returns the number of its visible nodes.
 * Assume that:
 * N is an integer within the range [0..1,000,000];
 * each element of tree T is an integer within the range [−1,000,000,000..1,000,000,000].
 * For example, given tree T that has the following structure:
 * 
 * the function should return 4, because there are four visible nodes, namely those with values 5, 10, 20 and 21. The node with value 1 is not visible because there is a node with value 10 on the path from the root to that node, and 10 exceeds 1. The node with value 3 is not visible because its value is lower than that of the root, which has value 5.
 * Given tree T that has the following structure:
 *
 * the function should return 2, because the only visible nodes are those with value 8.
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N).
 * 
 */

public class Solution {
	public int solution(Tree T) {
        // write your code in Java SE 6
        return findVisible(T, T.x);
    }
    
    public int findVisible(Tree T, int max) {
        if(T == null) return 0;
        if(T.x >= max) {
            return 1 + findVisible(T.l, T.x) + findVisible(T.r, T.x);
        } else {
            return findVisible(T.l, max) + findVisible(T.r, max);
        }
    }
}
