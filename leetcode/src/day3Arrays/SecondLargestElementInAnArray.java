package day3Arrays;

public class SecondLargestElementInAnArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 3,2,1,5,6,4 };
		System.out.println(secondLargestElementInAnArray(arr));
	}

	private static int secondLargestElementInAnArray(int[] arr) {
		int largest=arr[0];
		int secLargest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}
		}
		return secLargest;
	}
}
//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//Can you solve it without sorting?
//Example 1:
//Input: nums = [3,2,1,5,6,4], k = 2
//Output: 5
//Example 2:
//Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//Output: 4