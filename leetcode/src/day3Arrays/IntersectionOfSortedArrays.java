package day3Arrays;

import java.util.Arrays;

public class IntersectionOfSortedArrays {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 2, 2, 3, 4, 5, 5, 6 };
		int[] arr1 = new int[] { 2, 2, 2, 3, 3, 4, 5, 5, 6, 7 };
		System.out.println(Arrays.toString(intersectionOfSortedArrays(arr, arr1)));
	}

	private static int[] intersectionOfSortedArrays(int[] arr, int[] arr1) {
		int i = 0, j = 0, k = 0;
		int[] intersection = new int[arr.length + arr1.length];
		while (i < arr.length && j < arr1.length) {
			if (arr[i] < arr1[j]) {
				i++;
			} else if (arr1[j] < arr[i]) {
				j++;
			} else {
				intersection[k++] = arr[i];
				i++;
				j++;
			}
		}
		return Arrays.copyOf(intersection, k);
	}
}
