package randomCategory;

/*
 * https://www.geeksforgeeks.org/pascal-triangle/
 * https://www.google.co.in/search?q=hockey+stick+pascal&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiV96uhycfdAhVkxosKHXxLCT4Q_AUIDigB#imgrc=N7OFUyD7kh4BBM:
 */


public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		long matter[][] = new long[n][n];

		for (int line = 0; line < n; line++) {

			for (int elem = 0; elem <= line; elem++) {

				if (elem == 0 || elem == line) {
					matter[line][elem] = 1;
					System.out.print(matter[line][elem] + "\t");
				} else {
					matter[line][elem] = matter[line - 1][elem - 1]
							+ matter[line - 1][elem];
					System.out.print(matter[line][elem] + "\t");
				}
			}
			System.out.println(" ");
		}

	}

}
