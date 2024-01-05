package day3Arrays;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 0, 3, 12 };
		System.out.println(Arrays.toString(moveZeroesOptimum(arr)));
	}

	private static int[] moveZeroesOptimum(int[] arr) {
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}
		for (int i = j + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				swap(arr, i, j);
				j++;
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int[] moveZeroes(int[] arr) {
		int[] temp = new int[arr.length];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		for (int i = temp.length; i < arr.length; i++) {
			arr[i] = 0;
		}
		return arr;
	}

}
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//Input: nums = [0]
//Output: [0]