package day3Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		int[] arr = new int[] {4,1,2,1,2};
		System.out.println(singleNumber(arr));
	}

	private static int singleNumber(int[] arr) {
		int xor=0;
		for(int i=0;i<arr.length;i++) {
			xor=xor ^ arr[i];
		}
		return xor;
	}
}
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Example 1:
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//Input: nums = [1]
//Output: 1