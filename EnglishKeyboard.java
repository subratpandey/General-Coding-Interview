
public class Solution {
	public static String getSequence(int cols, String word) {
		if(cols <= 0) {
			throw new IllegalArgumentException(String.format("cols should be > 0. You passed: %d", cols));
		}
		
		if(word == null) {
			throw new NullPointerException("word cannot be null");
		}
		
		StringBuffer sb = new StringBuffer();
		int prevRow = 2;
		int prevCol = 2;
		for(int i = 0; i < word.length(); i++) {
			int row = findRow(word.charAt(i), cols);
			int col = findCol(word.charAt(i), cols);
			
			move(prevRow, row, sb, "down(), ");
			move(row, prevRow, sb, "up(), ");
			move(prevCol, col, sb, "right(), ");
			move(col, prevCol, sb, "left(), ");
			
			sb.append("enter(), ");
			
			prevRow = row;
			prevCol = col;
				
		}
		
		return sb.toString();
	}
	
	private static int findRow(char ch, int cols) {
		return (ch - 'a') / cols;
	}
	
	private static int findCol(char ch, int cols) {
		return (ch - 'a') % cols;
	}
	
	private static void move(int start, int end, StringBuffer sb, String appendMethod) {
		while(start < end) {
			sb.append(appendMethod);
			start++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getSequence(5, "hi"));
	}

}
