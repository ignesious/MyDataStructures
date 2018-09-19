
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * https://www.geeksforgeeks.org/lru-cache-implementation/
 * https://leetcode.com/problems/lru-cache/description/
 */

class LRUCache {

    private  LinkedHashMap<Integer,Integer> cache;
    
    public LRUCache(int capacity) {
        cache = new LinkedHashMap<Integer, Integer>(capacity, /* loadFactor */ 0.75f, /* accessOrder */ true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }    
        };
    }
    
    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        cache.put(key, value);
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