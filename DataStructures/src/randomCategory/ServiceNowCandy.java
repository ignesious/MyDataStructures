package randomCategory;

/*
 * There are N children Standing in line.Each Child is assigned a rating value
 * 
 * https://www.programcreek.com/2014/03/leetcode-candy-java/
 * 
 * You are giving candies to these children subjected to the following requirements.
 * 
 * 1. Each child mush have at least one candy
 * 2. Children with a higher rating get more candies than their neighbors.
 * 
 * What is the minimum candies you must give ?.
 * 
 * Sample Input
 * 
 * Ratings:[1,2]
 * Sample Output
 * 
 * 3
 * 
 * 
 */

public class ServiceNowCandy {

	public static int candy(int[] ratings) {
		int sum = 0;
		if (ratings.length == 0)
			return sum;
		int[] lc = new int[ratings.length];
		int[] rc = new int[ratings.length];
		for (int i = 0; i < ratings.length; i++)
			lc[i] = rc[i] = 1;
		for (int i = 0; i < ratings.length - 1; i++) {
			if (ratings[i] < ratings[i + 1])
				lc[i + 1] = lc[i] + 1;
		}
		for (int i = ratings.length - 1; i > 0; i--) {
			if (ratings[i - 1] > ratings[i])
				rc[i - 1] = rc[i] + 1;
		}
		for (int i = 0; i < ratings.length; i++) {
			sum += max(lc[i], rc[i]);
		}
		return sum;
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 20, 30, 10, 10, 10, 100, 80, 90, 70 };

		System.out.println(candy(input));

	}

}
