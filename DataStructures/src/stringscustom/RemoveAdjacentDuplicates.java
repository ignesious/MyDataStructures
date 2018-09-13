package stringscustom;


import java.util.Arrays;

/*
 * https://practice.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates/0
 * 
 */

class DupFinder {

	int start;
	int end;

}

public class RemoveAdjacentDuplicates {
	public static String removeDuplicate(String string) {
		if (string == null)
			return null;
		return String.copyValueOf(removeDuplicate(string.toCharArray()));
	}

	public static char[] removeDuplicate(char[] chars) {
		if (chars.length < 1)
			return new char[0];
		else if (chars.length == 1)
			return chars;

		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] == chars[i + 1]) {
				char[] before = Arrays.copyOfRange(chars, 0, i);
				char[] after = Arrays.copyOfRange(chars, i + 2, chars.length);
				char[] combined = new char[before.length + after.length];
				System.arraycopy(before, 0, combined, 0, before.length);
				System.arraycopy(after, 0, combined, before.length,
						after.length);
				chars = removeDuplicate(combined);
				break;
			}
		}
		return chars;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "wowwwwowowowowwwwww";
		 System.out.println(removeDuplicate(input));
	}
}
