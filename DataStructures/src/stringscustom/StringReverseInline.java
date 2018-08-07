package stringscustom;

/*
 * https://www.geeksforgeeks.org/reverse-a-string-in-java-5-different-ways/
 */

public class StringReverseInline {

	public void stringReverseUtil(String input, StringBuilder sb, int count) {
		if (count == input.length())
			return;
		else {
			char temp = input.charAt(count);
			count++;
			stringReverseUtil(input, sb, count);
			sb.append(temp);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringReverseInline stringReverseInline = new StringReverseInline();
		StringBuilder sb = new StringBuilder();
		stringReverseInline.stringReverseUtil("moma", sb, 0);
		System.out.println("Final reversed string--->" + sb.toString());
	}

}
