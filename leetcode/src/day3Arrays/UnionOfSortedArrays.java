package day3Arrays;

import java.util.Arrays;

public class UnionOfSortedArrays {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 2, 2, 3, 4, 5, 5, 6 };
		int[] arr1 = new int[] { 2, 2, 2, 3, 3, 4, 5, 5, 6, 7 };
		System.out.println(Arrays.toString(unionOfSortedArrays(arr, arr1)));
	}

	private static int[] unionOfSortedArrays(int arr1[], int arr2[]) {
		int m = arr1.length;
		int n = arr2.length;
		int[] unionArray = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				if (k == 0 || unionArray[k - 1] != arr1[i]) {
					unionArray[k++] = arr1[i];
				}
				i++;
			} else if (arr2[j] < arr1[i]) {
				if (k == 0 || unionArray[k - 1] != arr2[j]) {
					unionArray[k++] = arr2[j];
				}
				j++;
			} else {
				if (k == 0 || unionArray[k - 1] != arr1[i]) {
					unionArray[k++] = arr1[i];
				}
				i++;
				j++;
			}
		}
		while (i < m) {
			if (k == 0 || unionArray[k - 1] != arr1[i]) {
				unionArray[k++] = arr1[i];
			}
			i++;
		}
		while (j < n) {
			if (k == 0 || unionArray[k - 1] != arr2[j]) {
				unionArray[k++] = arr2[j];
			}
			j++;
		}
		return Arrays.copyOf(unionArray, k);
	}
}
