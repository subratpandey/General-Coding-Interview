
public class Solution {
	public static int divide(int a, int b) {
		int c = 0; 
		int d = 0;
		while(a >= b) {
			c++;
			a = a - b;
		}
		d = a;
		System.out.println("quotient= " + c);
		System.out.println("remainder= " + d);
		return c;
	}
	
	public static void main(String[] args) {
		divide(10, 3);
	}

}
