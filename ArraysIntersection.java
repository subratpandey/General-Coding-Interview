import java.util.*;
public class Solution {
	public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : a) {
			set.add(i);
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int j : b) {
			if(set.contains(j)) {
				set.remove(j);
				result.add(j);
			}
		}
		return result;
	}

}
