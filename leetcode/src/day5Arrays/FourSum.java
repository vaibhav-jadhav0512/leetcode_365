package day5Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, -1, 0, -2, 2 };
		System.out.println(fourSum(arr, 0).toString());
	}

	private static List<List<Integer>> fourSum(int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1])
				continue;
			for (int j = i + 1; j < arr.length; j++) {
				if (j > i + 1 && arr[j] == arr[j - 1])
					continue;
				int k = j + 1;
				int l = arr.length - 1;
				while (k < l) {
					int sum = arr[i];
					sum += arr[j];
					sum += arr[k];
					sum += arr[l];
					if (sum == target) {
						List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
						ans.add(temp);
						k++;
						l--;
						while (k < l && arr[k] == arr[k - 1])
							k++;
						while (k < l && arr[l] == arr[l + 1])
							l--;
					} else if (sum < target) {
						k++;
					} else {
						l--;
					}
				}
			}
		}
		return ans;
	}
}
//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//0 <= a, b, c, d < n
//a, b, c, and d are distinct.
//nums[a] + nums[b] + nums[c] + nums[d] == target
//You may return the answer in any order.
//Example 1:
//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
//Example 2:
//Input: nums = [2,2,2,2,2], target = 8
//Output: [[2,2,2,2]]