/**
 * 
 * @author GGPAUE
 * 
 * find the nth prime number
 * 0th is 2, 1st is 3.
 * 
 */

import java.util.ArrayList;
public class Solution {
	public static int calPrime(int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(3);
		
		int counter = 4;
		while(result.size() < n) {
			if(counter % 2 != 0 && counter % 3 != 0) {
				int temp = 4;
				while(temp * temp <= counter) {
					if(counter % temp == 0){
						break;
					}
					temp++;
				}
				if(temp * temp > counter) {
					result.add(counter);
				}
			}
			counter++;
		}
		
		return result.get(n - 1);
		
	}
	
	public static void main(String[] args) {
		System.out.println("5th prime number: " + calPrime(5));
	}

}
