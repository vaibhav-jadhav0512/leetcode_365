package day5Arrays;

public class MaximumProductSubarray {
	public static void main(String[] args) {
		int[] arr = new int[] { -2,0,-1};
		System.out.println(maximumProductSubarray(arr));
	}

	private static int maximumProductSubarray(int[] arr) {
		int max = Integer.MIN_VALUE, prefix = 1, suffix = 1;
		for (int i = 0; i < arr.length; i++) {
			if (prefix == 0)
				prefix = 1;
			if (suffix == 0)
				suffix = 1;
			prefix = prefix * arr[i];
			suffix = suffix * arr[arr.length - i - 1];
			max = Math.max(max, Math.max(prefix, suffix));
		}
		return max;
	}
}
//Given an integer array nums, find a subarray that has the largest product, and return the product.
//The test cases are generated so that the answer will fit in a 32-bit integer.
//Example 1:
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
