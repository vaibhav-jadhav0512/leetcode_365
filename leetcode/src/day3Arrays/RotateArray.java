package day3Arrays;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(rotateArrayOptimum(arr, 3)));
	}

	private static int[] rotateArrayOptimum(int[] arr, int k) {
		k = k % arr.length;
		reverse(arr, 0, arr.length - k - 1);
		reverse(arr, arr.length - k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
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

	private static int[] rotateArray(int[] arr, int k) {
		k = k % arr.length;
		int[] temp = new int[k];
		for (int i = arr.length - k, j = 0; i < arr.length; i++, j++) {
			temp[j] = arr[i];
		}
		for (int i = arr.length - k - 1; i >= 0; i--) {
			arr[i + k] = arr[i];
		}
		for (int i = 0; i < k; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}
}
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//Example 1:
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation: 
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]