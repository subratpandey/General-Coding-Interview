
public class Solution {
	public static boolean isSafe(int[][] matrix, int row, int col) {
		int ROW = matrix.length;
		int COL = matrix[0].length;
		if(row >= 0 && row < ROW && col >=0 && col < COL) {
			if(matrix[row][col] == 1) return true;
			return false;
		}
		return false;
	}
	
	public static void DFS(int[][] matrix, int row, int col) {
		int[] rowNbr = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
		int[] colNbr = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};
		matrix[row][col] = 2;
		for(int k = 0; k < 8; k++) {
			if(isSafe(matrix, row + rowNbr[k], col + colNbr[k])) {
				DFS(matrix, row + rowNbr[k], col + colNbr[k]);
			}
		}
	}
	
	public static int countIslands(int[][] matrix) {
		int ROW = matrix.length;
		int COL = matrix[0].length;
		int result = 0;
		for(int i = 0; i < ROW; ++i) {
			for(int j = 0; j < COL; ++j) {
				if(matrix[i][j] == 1) {
					DFS(matrix, i, j);
					++result;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1, 1, 0, 0, 0},
				{0, 1, 0, 0, 1},
				{1, 0, 0, 1, 1},
				{0, 0, 0, 0, 0},
				{1, 0, 1, 0, 1}
		};
		System.out.print(countIslands(matrix));
		
	}

}
