package stringscustom;

import java.util.TreeMap;

/*
 * https://www.interviewbit.com/problems/integer-to-roman/
 */
public class IntegertoRoman {

	public String intToRoman(int number) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		int l = map.floorKey(number);
		if (number == l) {
			return map.get(number);
		}
		return map.get(l) + intToRoman(number - l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegertoRoman integertoRoman=new IntegertoRoman();
		System.out.println(integertoRoman.intToRoman(52043));
	}

}
