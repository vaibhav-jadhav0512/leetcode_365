package day4Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int[] arr = new int[] { 100,4,200,1,3,2 };
		System.out.println(longestConsecutiveSequence(arr));
	}

	private static int longestConsecutiveSequence(int[] arr) {
		int maxLen=1;
		if(arr.length==0) return 0;
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int s:set) {
			if(!set.contains(s-1)) {
				int count=1;
				int x=s;
				while(set.contains(x+1)) {
					x++;
					count++;
				}
				maxLen=Math.max(maxLen,count);
			}
		}
		return maxLen;
	}
}
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.
//Example 1:
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//Example 2:
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9