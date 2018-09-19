package randomCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScratchPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Integer> cacheMap=new HashMap<Integer,Integer>();
		ArrayList<Integer> listMatter=new ArrayList<Integer>();
		
		
		cacheMap.put(1,1);
		cacheMap.put(2,2);
		
		listMatter.add(1);
		listMatter.add(2);
		
		System.out.println(cacheMap.containsKey(2));
		System.out.println(cacheMap.size());
		
		System.out.println(listMatter.indexOf(1));
		
		
		
	}

}
