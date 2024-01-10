package day4Arrays;

import java.util.Arrays;

public class SpiralArray {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(spiralArray(arr)));
	}

	private static int[] spiralArray(int[][] arr) {
		int[] temp = new int[arr.length * arr[0].length];
		int top = 0, left = 0, right = arr[0].length-1, bottom = arr.length-1, k = 0;
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				temp[k++] = arr[top][i];
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				temp[k++] = arr[i][right];
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					temp[k++] = arr[bottom][i];
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					temp[k++] = arr[i][left];
				}
				left++;
			}
		}
		return temp;
	}
}
//Given an m x n matrix, return all elements of the matrix in spiral order.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]