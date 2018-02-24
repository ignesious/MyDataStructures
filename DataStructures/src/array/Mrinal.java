package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Mrinal {

	public int[] splitter(String arrValue) {
		String[] parts = arrValue.split(" ");
		int array[] = new int[parts.length];
		for (int u = 0; u < parts.length; u++) {
			array[u] = Integer.parseInt(parts[u]);
		}

		return array;

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Mrinal mrine = new Mrinal();
		Set<Integer> set = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int parts[]=new int[2];
		int arraySize = Integer.parseInt(br.readLine());
		int array[] = new int[arraySize];
		array = mrine.splitter(br.readLine());
		int magicQ = Integer.parseInt(br.readLine());

		for (int i = 0; i < magicQ; i++) {
            
			parts=mrine.splitter(br.readLine());
			int lower = parts[0]-1;
			int higher = parts[1]-1;
			 
			  for(int j=lower;j<=higher;j++)
			  {
				  set.add(array[j]);
				  
			  }
			
			System.out.println(set.size());
			set.clear();
			System.out.println(set.size()+"Empty");
		}

	}

}
