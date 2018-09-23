package randomCategory;


import java.util.LinkedHashMap;
import java.util.Map;

/*
 * https://www.geeksforgeeks.org/lru-cache-implementation/
 * https://leetcode.com/problems/lru-cache/description/
 * 
 * length and numbers of the cache output
 * 
 * input stream of strings.
 */

//class LRUCache {
//
//    private  LinkedHashMap<Integer,Integer> cache;
//    
//    public LRUCache(int capacity) {
//        cache = new LinkedHashMap<Integer, Integer>(capacity, /* loadFactor */ 0.75f, /* accessOrder */ true) {
//            @Override
//            protected boolean removeEldestEntry(Map.Entry eldest) {
//                return size() > capacity;
//            }    
//        };
//    }
//    
//    public int get(int key) {
//        return cache.getOrDefault(key, -1);
//    }
//    
//    public void put(int key, int value) {
//        cache.put(key, value);
//    }
//}

class LRUCache2 {

	private LinkedHashMap<Character, Character> cache;
	private String input;

	public LRUCache2(int capacity, String input) {

		this.input = input;

			cache = new LinkedHashMap<Character, Character>(capacity, /* loadFactor */
			0.75f, /* accessOrder */true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry eldest) {
				return size() > capacity;
			}
		};

		this.triggerCache();

	}

	private void triggerCache() {
		// TODO Auto-generated method stub

		String toProcess[] = input.split(" ");
		String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}";

		for (String temp : toProcess) {
			char charToInsert = temp.charAt(0);
			System.out.println("To Process char is " + charToInsert);

			// special character shit
			if (specialCharacters.contains(Character.toString(charToInsert))) {
				System.out.println("special character encountered breaking");

				break;
			}

			else
				this.refer(charToInsert);

		}

		this.display();

	}

	// public int get(int key) {
	// return cache.getOrDefault(key, -1);
	// }
	//
	// public void put(int key, int value) {
	// cache.put(key, value);
	// }

	public void refer(Character key) {
		if (cache.containsKey(key)) {
			cache.get(key);
		} else {
			cache.put(key, null);
		}

	}

	public void display() {
		StringBuilder sb = new StringBuilder();
		for (Character key : cache.keySet()) {
			sb.append(key + " ");
		}

		System.out.println(sb.reverse().toString().trim());
	}

}

public class LruCacheImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LRUCache2 ca = new LRUCache2(4, "1 2 3 s a b c d i n t h e 4 5");

		/*
		 * cache.put(1, 1); cache.put(2, 2); System.out.println("Value got is" +
		 * cache.get(1)); // returns 1 cache.put(3, 3); // evicts key 2
		 * System.out.println("Value got is" + cache.get(2)); // returns -1 (not
		 * // found) cache.put(4, 4); // evicts key 1
		 * System.out.println("Value got is" + cache.get(1)); // returns -1 (not
		 * // found) System.out.println("Value got is" + cache.get(3)); //
		 * returns 3 System.out.println("Value got is" + cache.get(4)); //
		 * returns 4
		 */
		//
		// System.out.println("Value got is" + cache.get(2));
		// cache.put(2, 6);
		// System.out.println("Value got is" + cache.get(1));
		// cache.put(1, 5);
		// System.out.println("Erronious case");
		// cache.put(1, 2);
		// System.out.println("Value got is" + cache.get(1));
		// System.out.println("Value got is" + cache.get(2));

		// ca.refer(1);
		// ca.refer(2);
		// ca.refer(3);
		// ca.refer(1);
		// ca.refer(4);
		// ca.refer(5);
		// ca.display();

	}

}
