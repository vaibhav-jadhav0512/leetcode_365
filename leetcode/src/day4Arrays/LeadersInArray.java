package day4Arrays;

import java.util.Arrays;

public class LeadersInArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 22, 12, 3, 0, 6 };
		System.out.println(Arrays.toString(leadersInArrayOptimum(arr)));
	}

	private static int[] leadersInArrayOptimum(int[] arr) {
		int[] leaders = new int[arr.length];int k=0;
		int max=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				leaders[k]=arr[i];
				k++;
			}
		}
		return leaders;
	}

	private static int[] leadersInArray(int[] arr) {
		int[] leaders = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean leader = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					leader = false;
					break;
				}
			}
			if (leader == true) {
				leaders[k] = arr[i];
				k++;
			}
		}
		return leaders;
	}

}
