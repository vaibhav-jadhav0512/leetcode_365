package day4Arrays;

import java.util.Arrays;

public class SetMatrixZeroes {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		System.out.println(Arrays.deepToString(setMatrixZeroes(arr)));
	}

	private static int[][] setMatrixZeroes(int[][] arr) {
		int[] col = new int[arr[0].length];
		int[] row = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (row[i] == 1 || col[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}
}
//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//You must do it in place.
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
//Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]