package DynamicProgramming;

public class Robbank {

	public int rob(int[] nums) {
		int even = 0;
		int odd = 0;
		// Even block

		for (int i = 0; i < nums.length; i = i + 2) {
			even += nums[i];
		}

		// Odd block
		for (int i = 1; i < nums.length; i = i + 2) {
			odd += nums[i];
		}

		return odd >= even ? odd : even;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 7, 9, 3, 1 };
		System.out.println(new Robbank().rob(a));

	}

}
