package day5Arrays;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] arr2 = new int[] { 2, 5, 6 };
		System.out.println(Arrays.toString(mergeSortedArray(arr1, 3, arr2, 3)));
	}

	private static int[] mergeSortedArray(int[] arr1, int m, int[] arr2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = arr1.length - 1;
		while (j >= 0) {
			if (i >= 0 && arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				k--;
				i--;
			} else {
				arr1[k] = arr2[j];
				k--;
				j--;
			}
		}
		return arr1;
	}
}
//You are given two integer arrays arr1 and arr2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in arr1 and arr2 respectively.
//Merge arr1 and arr2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array arr1. To accommodate this, arr1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. arr2 has a length of n.
//Example 1:
//Input: arr1 = [1,2,3,0,0,0], m = 3, arr2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from arr1.
//Example 2:
//Input: arr1 = [1], m = 1, arr2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//Input: arr1 = [0], m = 0, arr2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in arr1. The 0 is only there to ensure the merge result can fit in arr1.
