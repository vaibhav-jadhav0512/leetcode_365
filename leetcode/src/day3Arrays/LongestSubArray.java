package day3Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,1,1,1,1,2,4,2,3};
		System.out.println(longestSubArray(arr,4));
	}

	private static int longestSubArray(int[] arr,int k) {
		int i=0,j=0,maxlen=0,sum=arr[0];
		while(j<arr.length) {
			while(i<=j && sum>k) {
				sum-=arr[i];
				i++;
			}
			if(sum==k) {
				maxlen=Math.max(maxlen,j-i+1);
			}
			j++;
			if(j<arr.length)
				sum+=arr[j];
		}
		return maxlen;
	}
}
