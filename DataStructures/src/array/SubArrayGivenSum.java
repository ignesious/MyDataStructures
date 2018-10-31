package array;

import java.util.HashMap;
import java.util.Map;

/*
 * https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
 * https://www.youtube.com/watch?v=HJDlxZNe1UI
 * https://www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/
 * 
 */

public class SubArrayGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 2, -2, -20, 10 };
		int k = -10;

		printAllSubarrays(a, k);
	}

	private static void printAllSubarrays(int[] a, int k) {
		// TODO Auto-generated method stub
		int curr_sum = 0;
		int toFind = 0;
		Map<Integer, Integer> subMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {

			curr_sum += a[i];

			if (curr_sum == k) {
				System.out.println("Subarray found case initial " + " Start 0" + " End --> " + i);
			}

			toFind = curr_sum - k;
			System.out.println("Calculated to Find--> " + toFind);

			if (subMap.containsKey(toFind)) {
				System.out.println("Subarray found case second " + " Start Index " + (subMap.get(toFind) + 1)
						+ " End Index-->" + i);
			}

			subMap.put(curr_sum, i);

		}

	}

}
