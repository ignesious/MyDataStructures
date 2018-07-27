package stringscustom;

/*
 * https://www.interviewbit.com/problems/count-and-say/
 * 
 */

public class CountandSay {

	public String countAndSay(int A) {

		char[] chars = ("" + A).toCharArray();
		int startPointer = 0;
		int nextPointer = 1;
		int counter = 1;
		System.out.println(chars.length);
		for (int i = 0; i < chars.length; i++) {
			System.out.println("char is " + (int) chars[i]);

			if (nextPointer == chars.length) {
				System.out.println("There are --->" + counter + "values are"
						+ Character.getNumericValue(chars[startPointer]));
				break;
			}

			else {
				if (chars[startPointer] == chars[nextPointer]) {
					counter++;
				} else {
					// Print
					// reinitialize counter

					System.out.println("There are --->" + counter
							+ "values are"
							+ Character.getNumericValue(chars[startPointer]));
					counter = 1;
				}

				startPointer++;
				nextPointer++;
			}

		}

		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountandSay countandSay = new CountandSay();
		countandSay.countAndSay(2345);

	}

}
