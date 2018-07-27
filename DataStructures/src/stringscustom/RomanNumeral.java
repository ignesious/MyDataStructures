package stringscustom;
/*
 * https://www.interviewbit.com/problems/roman-to-integer/
 */
		
public class RomanNumeral {

	public int romanToInt(String A) {
		String romanNumeral = A;
		int decimalNum = 0;

		int l = romanNumeral.length();
		int num = 0;
		int previousnum = 0;
		for (int i = l - 1; i >= 0; i--) {
			char x = romanNumeral.charAt(i);
			x = Character.toUpperCase(x);
			switch (x) {
			case 'I':
				previousnum = num;
				num = 1;
				break;
			case 'V':
				previousnum = num;
				num = 5;
				break;
			case 'X':
				previousnum = num;
				num = 10;
				break;
			case 'L':
				previousnum = num;
				num = 50;
				break;
			case 'C':
				previousnum = num;
				num = 100;
				break;
			case 'D':
				previousnum = num;
				num = 500;
				break;
			case 'M':
				previousnum = num;
				num = 1000;
				break;
			}
			if (num < previousnum) {
				decimalNum = decimalNum - num;
			} else
				decimalNum = decimalNum + num;
		}

		return decimalNum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
