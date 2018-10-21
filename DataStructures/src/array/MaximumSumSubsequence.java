package array;

/*
 * https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence/0
 * https://www.youtube.com/watch?v=99ssGWhLPUE&t=187s
 * 
 * 
 * There are two condition in this question
 * 
 * 1. It should be an increasing subsequence
 * 2. It also should be the elements in increasing order
 * 
 * How DP:-
 * 
 * To calculate the end sequence we use the sequence till we found... Thats how DP tabulazation is used.
 */

public class MaximumSumSubsequence {
	private static int finalArr[];
	private static int seqArr[];

	// private static List<Integer> sequenceCalculator=new ArrayList<Integer>();
	private static void doComputation(int a[]) {
		finalArr = a.clone();
		seqArr = new int[finalArr.length];
		for (int i = 0; i < finalArr.length; i++) {
			seqArr[i] = i;

		}
		// System.out.println(finalArr.length);

		for (int i = 0; i < finalArr.length; i++) {

			for (int j = 0; j < i; j++) {

				if (a[j] < a[i]) {
					int temp = finalArr[j] + a[i];
					if (temp > finalArr[i]) {
						finalArr[i] = temp;
						seqArr[i] = j;
					}
				}

			}

		}

		System.out.println("-------------Elements are ------------");
		for (int ai : finalArr) {
			System.out.print(ai + "\t");
		}
		System.out.println(" ");
		System.out.println("-------------From Indexes ------------");
		for (int ai : seqArr) {
			System.out.print(ai + "\t");
		}
		int endSequence = 0;
		// Answer
		int result = 0;
		for (int i = 0; i < finalArr.length; i++) {
			if (result < finalArr[i]) {
				result = finalArr[i];
				endSequence = i;
			}
		}
		System.out.println(" ");
		System.out.println("Final max increasing sequence is " + result + " " + endSequence);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 6, 1, 3, 8, 4, 6 };
		doComputation(a);

	}

}
