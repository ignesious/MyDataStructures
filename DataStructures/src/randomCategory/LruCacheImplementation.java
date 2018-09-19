package randomCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * https://www.geeksforgeeks.org/lru-cache-implementation/
 * https://leetcode.com/problems/lru-cache/description/
 */

class LRUCache {
	private int pageSize;

	Map<Integer, Integer> cacheMap = new HashMap<Integer, Integer>();
	List<Integer> logicList = new ArrayList<Integer>();

	public LRUCache(int pageSize) {
		this.pageSize = pageSize;
	}

	public int get(int key) {

		if (cacheMap.containsKey(key)) {

			// logic to add the value to the first of the list

			int valueToAddFirst = logicList.get(logicList.size() - 1);
			logicList.remove(logicList.size() - 1);
			logicList.add(0, valueToAddFirst);
			// System.out.println("Logic List on get method state" + logicList);

			return cacheMap.get(key);
		}

		return -1;
	}

	public void put(int inputkey, int inputvalue) {

		if (cacheMap.size() == pageSize) {

			if (cacheMap.containsKey(inputkey)) {

				// logic to add the value to the first of the list

				int indexis = logicList.indexOf(inputkey);

				logicList.remove(indexis);
				logicList.add(0, inputkey);
				cacheMap.put(inputkey, inputvalue);
				// System.out
				// .println("Logic List on get method state" + logicList);

			}

			else {

				// System.out.println("Page size is reached");

				int valueToRemove = logicList.get(logicList.size() - 1);

				// System.out.println("##########Deleting the entry here");
				cacheMap.remove(valueToRemove);

				// System.out.println("###########After Deletion map is"
				// + cacheMap);
				// System.out.println("CacheMap After removal" + cacheMap);
				logicList.remove(logicList.size() - 1);
				// System.out.println("List after Removal" + logicList);

				// To add Portion

				cacheMap.put(inputkey, inputvalue);
				logicList.add(0, inputkey);

				// System.out.println("Map and list at end of addtion put"
				// + cacheMap + "List at the end is" + logicList);

			}
		}

		else {

			cacheMap.put(inputkey, inputvalue);
			logicList.add(0, inputkey);
			// System.out
			// .println("List and map on addition but size not reached yet"
			// + cacheMap + "List is" + logicList);

		}

	}
}

public class LruCacheImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LRUCache cache = new LRUCache(2);

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

		System.out.println("Value got is" + cache.get(2));
		cache.put(2, 6);
		System.out.println("Value got is" + cache.get(1));
		cache.put(1, 5);
		System.out.println("Erronious case");
		cache.put(1, 2);
		System.out.println("Value got is" + cache.get(1));
		System.out.println("Value got is" + cache.get(2));
	}

}
