package randomCategory;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * https://www.geeksforgeeks.org/print-characters-frequencies-order-occurrence/
 */

public class ADP1PrintChar {

	public void printFrequencies(String input) {
		char inputCharArray[] = input.toCharArray();
		// to print the shit
		for (char print : inputCharArray) {
			System.out.println(print);
		}
		LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<Character, Integer>();

		for (char print : inputCharArray) {

			if (frequencyMap.get(print) != null) {
				int increValue = frequencyMap.get(print);
				frequencyMap.put(print, increValue + 1);
			} else {
				frequencyMap.put(print, 1);
			}
		}
		Iterator<Entry<Character, Integer>> it = frequencyMap.entrySet()
				.iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			// it.remove(); // avoids a ConcurrentModificationException
		}
	}

	// To print all the elements

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ADP1PrintChar adp1PrintChar = new ADP1PrintChar();
		adp1PrintChar.printFrequencies("geeksforgeeks");
	}

}
