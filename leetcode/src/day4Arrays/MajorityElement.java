package day4Arrays;


public class MajorityElement {
	public static void main(String[] args) {
		int[] arr = new int[] {2,2,1,1,1,2,2,3,3,3,3,3,3};
		System.out.println(majorityElement(arr));
	}

	private static int majorityElement(int[] arr) {
		int ele=arr[0],count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				count++;
			}else if (count==0) {
				ele=arr[i];
			}else {
				count--;
			}
		}
		return ele;
	}
}
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//Example 1:
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2