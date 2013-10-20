/**
 * 
 * @author GGPAUE
 * A zero-indexed array A consisting of N integers is given. A magnitude pole of this array is an integer Q such that:
 * 0 ≤ Q < N;
 * A[P] ≤ A[Q] for 0 ≤ P < Q;
 * A[Q] ≤ A[R] for Q < R < N.
 * For example, consider array A consisting of ten elements such that:
 *  A[0] = 4  
 *  A[1] = 2  
 *  A[2] = 2
 *  A[3] = 3  
 *  A[4] = 1  
 *  A[5] = 4
 *  A[6] = 7  
 *  A[7] = 8  
 *  A[8] = 6
 *  A[9] = 9
 * Number 5 is a magnitude pole of this array, because all elements to the left of A[5] have values smaller than or equal to A[5] (4, 2, 2, 3 and 1 are smaller than or equal to 4) and all elements to the right of A[5] have values greater than or equal to A[5] (7, 8, 6 and 9 are greater than or equal to 4). Number 9 is also a magnitude pole of this array.
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A consisting of N integers, returns any of its magnitude poles. The function should return −1 if array A does not have a magnitude pole.
 * For example, given array A consisting of ten elements such that:
 *  A[0] = 4  
 *  A[1] = 2  
 *  A[2] = 2
 *  A[3] = 3  
 *  A[4] = 1  
 *  A[5] = 4
 *  A[6] = 7  
 *  A[7] = 8  
 *  A[8] = 6
 *  A[9] = 9
 * the function may return 5 or 9, as explained above.
 * Assume that:
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2147483648..2147483647].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */

public class Solution {
	public static int solution(int[] A) {
		if (A == null || A.length == 0) return -1;
		
		int[] min = new int[A.length];
		int[] max = new int[A.length];
		
		max[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			max[i] = Math.max(max[i - 1], A[i]);
		}
		
		min[A.length - 1] = A[A.length - 1];
		for (int i = A.length - 2; i >= 0; i--) {
			min[i] = Math.min(min[i + 1], A[i]);
		}

		for (int i = 0; i < A.length; i++) {
			if (min[i] >= A[i] && max[i] <= A[i])
				return i;
		}
		return -1;
	}


}
