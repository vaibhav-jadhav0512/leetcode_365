package day1Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MaxWidthOfVerticalArea {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 3, 1 }, { 9, 0 }, { 1, 0 }, { 1, 4 }, { 5, 3 }, { 8, 8 } };
		System.out.println(maxWidthOfVerticalArea(arr));
	}

	private static int maxWidthOfVerticalArea(int[][] arr) {
		int diff = 0;
		Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
		for (int i = 0; i < arr.length - 1; i++) {
			diff = Math.max(diff, arr[i + 1][0] - arr[i][0]);
		}
		return diff;
	}
}
//Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.
//A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.
//Note that points on the edge of a vertical area are not considered included in the area.
//Input: points = [[8,7],[9,9],[7,4],[9,7]]
//Output: 1
//Explanation: Both the red and the blue area are optimal.
//Example 2:
//Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
//Output: 3