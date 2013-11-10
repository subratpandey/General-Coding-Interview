import java.util.ArrayList;
public class Solution {
	public static ArrayList<Integer> minHops(int[] array) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int l = 0, h = array.length - 1;
		
		if(h == 0) return result;
		
		if(array[l] == 0) return result;
		
		int x = array[l];
		int max = 0;
		int record = l;
		result.add(record);
		
		while(l <= h) {
			
			for(int i = l + 1; i <= x; i++) {
				int temp = i + array[i];
				if(temp >= max) {
					max = temp;
					record = i;
				}
			}
			
			result.add(record);
			l = record;
			x = array[l];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 6, 0, 4, 2, 4, 1, 0, 0, 4};
		minHops(arr);
		
	}

}
