package stringscustom;
/*
 * https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places/0
 */
public class ClockWiseAntiWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="amazon";
		String b="azonam";
		StringBuffer anticlockChecker=new StringBuffer();
		anticlockChecker.append(a.substring(2, a.length()));
		anticlockChecker.append(a.substring(0, 2));
		if(anticlockChecker.toString().equals(b))
		{
			System.out.println("Anti man");
		}
	}

}
