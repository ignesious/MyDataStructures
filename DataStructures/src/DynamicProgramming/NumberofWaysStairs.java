package DynamicProgramming;

import java.util.ArrayList;

public class NumberofWaysStairs {

	public int climbStairs(int n) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(0, 1);
		result.add(1, 1);

		for (int i = 2; i <= n; i++) {
			result.add(i, result.get(i - 1) + result.get(i - 2));

		}
		return result.get(n);
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberofWaysStairs driverObj = new NumberofWaysStairs();

		System.out.println(driverObj.climbStairs(1));

	}

}
