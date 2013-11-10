import java.util.ArrayList;
public class Solution {
	public static ArrayList<Integer> minHops(int[] array) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int l = 0, h = array.length;
		
		if(h == 0) return null;
		if(array[l] == 0) return null;
		
		int x = array[l];
		int max = 0;
		int record = l;
		int temp = 0;
		result.add(record);

		while(l + x < h) {
			
			for(int i = l + 1; i <= l + x; i++) {
				if(array[i] == 0) continue;
				temp = i + array[i];
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
		int[] arr2 = {0};
		System.out.println(minHops(arr) + " out");
		System.out.println(minHops(arr2) + " out");
		
	}

}
