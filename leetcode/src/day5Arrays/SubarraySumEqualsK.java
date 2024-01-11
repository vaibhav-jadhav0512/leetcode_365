package day5Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
	public static void main(String[] args) {
		int[] arr = new int[] {1,1,1 };
		System.out.println(subarraySumEqualsK(arr,2));
	}

	private static int subarraySumEqualsK(int[] arr, int k) {
		int n = arr.length; 
        Map<Integer,Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;
        mpp.put(0, 1); 
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - k;
            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
	}
}
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//Example 1:
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//Input: nums = [1,2,3], k = 3
//Output: 2