import java.util.*;
public class Solution {
	public static int[] windowSum(int[] A, int size) {
		if(A == null) return null;
		if(A.length == 0 || size == 0) return A;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < A.length - size + 1; i++) {
			int temp = 0;
			for(int j = 0; j < size; j++) { 
				temp += A[i + j];	
			}
			result.add(temp);
		}
		
		
		int[] ret = new int[result.size()];
		for(int i = 0; i < ret.length; i++) {
			ret[i] = result.get(i).intValue();
		}
		return ret;
	}
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5};
		int[] result = windowSum(A, 2);
		
		System.out.print(Arrays.toString(result));
	}
 
}
