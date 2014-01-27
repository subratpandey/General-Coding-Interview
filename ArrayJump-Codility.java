/**
 * 
 * @author GGPAUE
 * 
 * A non-empty zero-indexed array A consisting of N integers is given. Each element of the array can be treated as a relative pointer to another element in the array: if A[K] = M then element A[K] points to element A[K+M].
 * The array defines a sequence of jumps of a pawn as follows:
 * initially, the pawn is located at element A[0];
 * on each jump the pawn moves from its current element to the destination element pointed to by the current element; i.e. if the pawn stands on element A[K] then it jumps to the element pointed to by A[K];
 * the pawn may jump forever or may jump out of the array.
 * For example, consider the following array A.
 *   A[0] = 2    A[1] = 3    A[2] = -1
 *   A[3] = 1    A[4] = 3
 * 
 * This array defines the following sequence of jumps of the pawn:
 * initially, the pawn is located at element A[0];
 * on the first jump, the pawn moves from A[0] to A[2] because 0 + A[0] = 2;
 * on the second jump, the pawn moves from A[2] to A[1] because 2 + A[2] = 1;
 * on the third jump, the pawn moves from A[1] to A[4] because 1 + A[1] = 4;
 * on the fourth jump, the pawn jumps out of the array.

 * Write a function:
 * def solution(A)
 * that, given a non-empty zero-indexed array A consisting of N integers, returns the number of jumps after which the pawn will jump out of the array. The function should return −1 if the pawn will never jump out of the array.
 * For example, for the array A given above, the function should return 4, as explained above. Given array A such that:
 *  A[0] = 1    A[1] = 1    A[2] = -1
 *  A[3] = 1

 * the function should return −1.
 * Assume that:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 * 
 * 
 */

public class Solution {
	public int solution(int[] A) {
        // write your code in Java SE 6
        int current = 0;
        int jumps = 0;
        while(current >= 0 && current < A.length) {
            if(A[current] != Integer.MIN_VALUE) {
                int next = current + A[current];
                A[current] = Integer.MIN_VALUE;
                current = next;
                jumps += 1;
            } else {
                return -1;
            }
        }
        return jumps;       
    }
}
