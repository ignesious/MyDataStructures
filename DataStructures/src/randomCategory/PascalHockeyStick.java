package randomCategory;

/*
 * Row start with 0
 * Column with 1
 * https://www.google.co.in/search?q=pascal%27s+hockey+stick+pattern&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi6jLq1r8ndAhWUV30KHZEEDqoQ_AUIDigB&biw=1396&bih=697
 * https://www.geeksforgeeks.org/binomial-coefficient-dp-9/
 * https://brilliant.org/wiki/hockey-stick-identity/
 * 
 */



public class PascalHockeyStick {

	public static int binomialCoeff(int n, int k) {
		// Base Cases
		if (k == 0 || k == n)
			return 1;

		// Recur
		return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
	}

	public static void generateHockeyStick(int row, int column) {

		StringBuilder sb = new StringBuilder();
		int coefficient = 0;
		int finalValue = 0;
		for (int i = 0; i < column; i++) {

			coefficient = binomialCoeff(row + i, row);
			finalValue += coefficient;
			sb.append(coefficient + " ");

		}

		sb.append(finalValue);
		System.out.println("Pattern is" + sb.toString());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
generateHockeyStick(2, 4);
	}

}
