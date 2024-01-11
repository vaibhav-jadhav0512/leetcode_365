package day5Arrays;

import java.util.Arrays;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(pascalTriangle(5)));
	}

	private static int[][] pascalTriangle(int k) {
		int[][] ans = new int[k][];
		for (int row = 0; row < k; row++) {
			ans[row] = new int[row + 1];
			for (int col = 0; col <= row; col++) {
				ans[row][col] = nCr(row, col);
			}
		}
		return ans;
	}

	private static int nCr(int row, int col) {
		int ans = 1;
		for (int i = 0; i < col; i++) {
			ans = ans * (row - i);
			ans = ans / (i + 1);
		}
		return ans;
	}
}
