package stringscustom;

import java.util.ArrayList;

/*
 *https://www.interviewbit.com/problems/longest-common-prefix/
 */

public class LongestCommonPrefix {

	public String checkCommonPrefix(ArrayList<String> inputList) {
		int inputLength = inputList.size();
		int prefixGetter = 0;
		char checker = (char) 0;
		boolean checkerDone = true;

		while (checkerDone) {

			// System.out.println("prefixgetter is--->" + prefixGetter);
			try {
				checker = inputList.get(0).charAt(prefixGetter);
			} catch (Exception e) {
				break;
			}

			// System.out.println("Checker At--->>>>" + checker);
			for (int i = 1; i < inputLength; i++) {
				try {
					if (checker == inputList.get(i).charAt(prefixGetter)) {
						continue;
					} else {
						checkerDone = false;
						break;
					}
				} catch (Exception e) {
					checkerDone = false;
					break;
				}
			}
			if (!checkerDone)
				break;
			prefixGetter++;
			// Corner case
			if (prefixGetter == inputList.get(0).length())
				checkerDone = false;

		}

		// System.out.println("Final prefixgetter" + prefixGetter);

		if (prefixGetter >= 1)
			return inputList.get(0).substring(0, prefixGetter);
		else

			return "";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestCommonPrefix longComPrefixObj = new LongestCommonPrefix();
		ArrayList<String> inputList = new ArrayList<String>();
		inputList.add("abc");
		inputList.add("ab");
		inputList.add("abc");
		longComPrefixObj.checkCommonPrefix(inputList);

	}

}
