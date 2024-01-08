package day4Arrays;

import java.util.Arrays;

public class SortColors {
	public static void main(String[] args) {
		int[] arr = new int[] {2,0,2,1,1,0};
		System.out.println(Arrays.toString(sortColors(arr)));
	}

	private static int[] sortColors(int[] arr) {
		int low=0,mid=0,high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr,low,mid);
				low++;
				mid++;
			}else if (arr[mid]==1) {
				mid++;
			}else {
				swap(arr,mid,high);
				high--;
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int num1, int num2) {
		int temp=arr[num1];
		arr[num1]=arr[num2];
		arr[num2]=temp;
	}
}
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
//Example 1:
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:
//Input: nums = [2,0,1]
//Output: [0,1,2]