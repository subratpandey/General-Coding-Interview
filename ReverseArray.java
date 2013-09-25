import java.util.*;
public class Solution {
	public static ArrayList<Character> reverseArray(char[] validData) {
		ArrayList<Character> result = new ArrayList<Character>();
		for(int i = 0; i < validData.length / 2; i++) {
			char temp = validData[i];
			validData[i] = validData[validData.length - i - 1];
			validData[validData.length - i - 1] = temp;
		}
		for(int j = 0; j <= validData.length - 1; j++) {
			result.add(validData[j]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		char[] test = new char[3];
		test[0] = 'a';
		test[1] = 'b';
		test[2] = 'c';
		System.out.println(reverseArray(test));
	}

}
