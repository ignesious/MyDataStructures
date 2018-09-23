package randomCategory;

/*
 * https://www.geeksforgeeks.org/check-if-a-number-can-be-expressed-as-xy-x-raised-to-power-y/
 */
public class PowerofXY {
	public static int fracion(double x) {
		String a = "" + x;
		String spilts[] = a.split("\\."); // split using decimal
		int b = spilts[1].length(); // find the decimal length
		int denominator = (int) Math.pow(10, b); // calculate the denominator
		int numerator = (int) (x * denominator); // calculate the nerumrator Ex
													// 1.2*10 = 12
		int gcd = getGCD(numerator, denominator); // Find the greatest common
													// divisor bw them
		String fraction = "" + numerator / gcd + "/" + denominator / gcd;

		System.out.println(fraction);
		return denominator / gcd;
	}

	public static int getGCD(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return getGCD(n2, n1 % n2);
	}

	static int getMaxPower(double n) {

		int finalPow = 1;

		for (int x = 2; x <= Math.sqrt(n); x++) {
			int y = 2;

			double p = Math.pow(x, y);

			while (p <= n && p > 0) {
				if (p == n) {

					System.out.println("x" + x + "y" + y);
					if (finalPow < y)
						finalPow = y;

				}
				y++;
				p = Math.pow(x, y);
			}
		}

		return finalPow;

	}

	static int generatePower(double n) {
		if (n < 0)
			n = n * -1;
		int finalReturn = 0;
		// whole Value
		if (n % 1 == 0) {
			finalReturn = getMaxPower(n);
			System.out.println(finalReturn);
			return finalReturn;
		}

		else {
			int denominator = fracion(n);
			finalReturn = getMaxPower(denominator);
			finalReturn = finalReturn * -1;
			System.out.println(finalReturn);
			return finalReturn;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		generatePower(2147483647);

	}

}
