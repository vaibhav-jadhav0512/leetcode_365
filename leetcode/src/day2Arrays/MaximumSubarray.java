package day2Arrays;

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maximumSubarray(arr));
	}

	private static int maximumSubarray(int[] arr) {
		int max = arr[0], sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max = sum > max ? sum : max;
			sum = sum < 0 ? 0 : sum;
		}
		return max;
	}
}
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Example 1:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Example 2:
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//Example 3:
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
