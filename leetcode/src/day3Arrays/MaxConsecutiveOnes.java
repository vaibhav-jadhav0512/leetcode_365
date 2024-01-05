package day3Arrays;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] arr = new int[] {1,1,0,1,1,1};
		System.out.println(maxConsecutiveOnes(arr));
	}

	private static int maxConsecutiveOnes(int[] arr) {
		int max=0;
		int consecutive=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				consecutive++;
				max=Math.max(max,consecutive);
			}else {
				consecutive=0;
			}
		}
		return max;
	}
}
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//Example 1:
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//Example 2:
//Input: nums = [1,0,1,1,0,1]
//Output: 2