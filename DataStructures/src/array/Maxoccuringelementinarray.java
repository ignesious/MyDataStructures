package array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/*
 * https://www.geeksforgeeks.org/find-the-maximum-repeating-number-in-ok-time/
 */
class customComparator implements Comparator<Map.Entry<Integer, Integer>> {

	@Override
	public int compare(Map.Entry<Integer, Integer> o1,
			Map.Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		return o2.getValue() - o1.getValue();
	}

}

public class Maxoccuringelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "4451234485213";

		HashMap<Integer, Integer> compareMap = new HashMap<Integer, Integer>();
		Set<Character> dupSet = new HashSet<Character>();

		for (char temp : input.toCharArray()) {

			boolean finder = dupSet.add(temp);

			if (finder) {
				// Element not in set first occurence
				compareMap.put(Character.getNumericValue(temp), 1);
			} else {
				compareMap.put(Character.getNumericValue(temp),
						compareMap.get(Character.getNumericValue(temp)) + 1);
			}

		}

		/*
		 * for(int finalshit:compareMap.keySet()) {
		 * System.out.println("Key--> "+finalshit + "   Occurence-->" +
		 * compareMap.get(finalshit));
		 * //compareMap2.put(compareMap.get(finalshit), finalshit); }
		 */

		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(
				compareMap.entrySet());

		Collections.sort(list, new customComparator());

		// System.out.println(compareMap2);

		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}

		for (int a : temp.keySet()) {
			System.out.println("Key = " + a + "  value=" + temp.get(a));
		}

	}

}
