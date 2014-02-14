
public class Solution {
	public static int maxMinPath(int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return -1;
		int row = matrix.length;
		int col = matrix[0].length;
		
		int[][] path = new int[row][col];
		path[0][0] = matrix[0][0];
		path[row - 1][col - 1] = matrix[row - 1][col - 1];
		
		for(int i = 1; i < row; i++) {
			path[i][0] = Math.min(path[i - 1][0], matrix[i][0]);
		}
		
		for(int j = 1; j < col; j++) {
			path[0][j] = Math.min(path[0][j - 1], matrix[0][j]);
		}
		
		for(int i = 1; i < row; i++) {
			for(int j = 1; j < col; j++) {
				path[i][j] = Math.min(Math.max(path[i - 1][j], path[i][j - 1]), matrix[i][j]);
			}
		}
		
		return path[row - 1][col - 1];
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 7;
		matrix[0][1] = 5;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 6;
		matrix[1][2] = 5;
		matrix[2][0] = 7;
		matrix[2][1] = 9;
		matrix[2][2] = 8;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]);	
			}
			System.out.println();
		}
		int result = maxMinPath(matrix);
		System.out.print(result);
	}
	
	

}
