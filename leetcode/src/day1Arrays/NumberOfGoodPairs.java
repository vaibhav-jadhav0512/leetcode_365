package day1Arrays;

public class NumberOfGoodPairs {
	public static void main(String[] args) {
		int[] arr = new int[] { 1,2,3,1,1,3 };
		System.out.println(numberOfGoodPairsApproach2(arr));
	}
	private static int numberOfGoodPairsApproach2(int[] arr) {
		int count=0;
		int[]frequencyArr=new int[102];
		for(int num:arr) {
			frequencyArr[num]++;
		}
		for(int i:frequencyArr) {
			count+=((i)*(i-1))/2;
		}
		return count;
	}
	private static int numberOfGoodPairs(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i<j)
					count++;
			}
		}
		return count;
	}
}
//Given an array of integers nums, return the number of good pairs.
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//Example 1:
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//Example 2:
//Input: nums = [1,1,1,1]
//Output: 6
//Explanation: Each pair in the array are good.
//Example 3:
//Input: nums = [1,2,3]
//Output: 0
