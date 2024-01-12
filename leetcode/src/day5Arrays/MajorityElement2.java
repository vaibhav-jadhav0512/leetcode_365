package day5Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2 };
		System.out.println(majorityElement2(arr).toString());
	}

	private static List<Integer> majorityElement2(int[] arr) {
		List<Integer> ans = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int value = map.getOrDefault(arr[i], 0);
			map.put(arr[i], value + 1);
			if (map.get(arr[i]) == ((arr.length / 3) + 1)) {
				ans.add(arr[i]);
			}
			if(ans.size()==2)
				break;
		}
		return ans;
	}
}
//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//Example 1:
//Input: nums = [3,2,3]
//Output: [3]
//Example 2:
//Input: nums = [1]
//Output: [1]
//Example 3:
//Input: nums = [1,2]
//Output: [1,2]
