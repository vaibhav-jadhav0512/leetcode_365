package day5Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static void main(String[] args) {
		int[] arr = new int[] { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSumOptimum(arr).toString());
	}

	private static List<List<Integer>> threeSumOptimum(int[] arr) {
		List<List<Integer>> ans=new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(i>0 && arr[i]==arr[i-1])continue;
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				int sum=arr[i]+arr[j]+arr[k];
				if(sum<0) {
					j++;}
				else if (sum>0) {
					k--;}
				else {
					List<Integer>temp= Arrays.asList(arr[i],arr[j],arr[k]);
					ans.add(temp);
					j++;
					k--;
					while(j<k && arr[j]==arr[j-1])j++;
					while(j<k && arr[k]==arr[k+1])k--;
				}
			}
		}
		return ans;
	}

	private static List<List<Integer>> threeSum(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		Set<List<Integer>>set=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						List<Integer>temp=Arrays.asList(arr[i], arr[j], arr[k]);
						temp.sort(null);
						set.add(temp);
					}
				}
			}
		}
		ans.addAll(set);
		return ans;
	}
}
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//Example 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation: 
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.
//Example 2:
//Input: nums = [0,1,1]
//Output: []
//Explanation: The only possible triplet does not sum up to 0.
//Example 3:
//Input: nums = [0,0,0]
//Output: [[0,0,0]]
//Explanation: The only possible triplet sums up to 0.