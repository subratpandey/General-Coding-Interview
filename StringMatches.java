
public class Solution {
	public static void main(String[] args) {
		
	
		String text = "0123hello9012hello8901hello7890";
		String word = "hello";
	
		System.out.println(text.indexOf(word));
		System.out.println(text.lastIndexOf(word));
	
		for(int i = -1; (i = text.indexOf(word, i + 1)) != -1;) {
			System.out.println(i);
		}
	
		for(int i = text.length(); (i = text.lastIndexOf(word, i - 1)) != -1;) {
			System.out.println(i);
		}
	}

}
