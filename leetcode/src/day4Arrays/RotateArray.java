package day4Arrays;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(rotateArrayOptimum(arr)));
	}

	private static int[][] rotateArrayOptimum(int[][] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				int temp=arr[j][i];
				arr[j][i]=arr[i][j];
				arr[i][j]=temp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
		return arr;
	}
	private static void reverse(int[] arr, int start, int end) {
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	private static int[][] rotateArray(int[][] arr) {
		int[][] temp = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				temp[j][(arr.length - 1) - i] = arr[i][j];
			}
		}
		return temp;
	}
}
//You are given an n x n 2D arr representing an image, rotate the image by 90 degrees (clockwise).
//You have to rotate the image in-place, which means you have to modify the input 2D arr directly. DO NOT allocate another 2D arr and do the rotation.
//Input: arr = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]
//Input: arr = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]