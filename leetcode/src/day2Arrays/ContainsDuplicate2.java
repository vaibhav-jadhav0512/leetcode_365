package day2Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, 1, 1 };
		System.out.println(containsDuplicate2(arr, 1));
	}

	private static boolean containsDuplicate2(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]) && Math.abs(i - map.get(arr[i])) <= k)
				return true;
			map.put(arr[i], i);
		}
		return false;
	}
}
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//Example 1:
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false