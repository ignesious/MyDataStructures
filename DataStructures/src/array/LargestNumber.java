package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Leetcode.....
// 747. Largest Number At Least Twice of Others
// https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/

/*
 * Reference :- https://www.geeksforgeeks.org/find-second-largest-element-array/
 */

public class LargestNumber {

	public int[] splitter(String arrValue) {
		String[] parts = arrValue.split(" ");
		int array[] = new int[parts.length];
		for (int u = 0; u < parts.length; u++) {
			array[u] = Integer.parseInt(parts[u]);
		}

		return array;

	}

	public int dominantIndex(int[] nums) {
		int first = 0, second = 0;
		int firstindex=0;
		//List<Integer> finalComputed = new ArrayList<>();

		for (int j = 0; j < nums.length; j++) {
		//	finalComputed.add(nums[j]);
			if (nums[j] > first) {
				second = first;
				first = nums[j];
				firstindex=j;
			} else if (nums[j] > second) {
				second = nums[j];
			}

		}

		System.out.println(first + "second" + second);

		if (first >= second * 2) {
		//	return finalComputed.indexOf(first);
			return firstindex;
		}

		else {
			return -1;
		}

	}

	public static void main(String args[]) throws NumberFormatException, IOException {

		LargestNumber lrg = new LargestNumber();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arraySize = Integer.parseInt(br.readLine());
		int array[] = new int[arraySize];
		array = lrg.splitter(br.readLine());

		System.out.println(lrg.dominantIndex(array));

		/*
		 * for (int i=0;i<array.length;i++) {
		 * 
		 * System.out.println(array[i]);
		 * 
		 * 
		 * }
		 */

	}

}
