package day6BST;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 7, 7, 8, 8, 10 };
		System.out.println(Arrays.toString( findFirstAndLastPositionOfElementInSortedArray(arr, 6)));
	}

	private static int[] findFirstAndLastPositionOfElementInSortedArray(int[] arr, int target) {
		int low = 0, high = arr.length - 1, first = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				first = mid;
				high = mid - 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		low=0;high=arr.length-1;
		int last=-1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				last = mid;
				low = mid + 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return new int[] {first,last};
	}
}
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//Input: nums = [], target = 0
//Output: [-1,-1]