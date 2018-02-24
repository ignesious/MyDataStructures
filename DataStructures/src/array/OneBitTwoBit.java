package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://leetcode.com/problems/1-bit-and-2-bit-characters/description/

//717. 1-bit and 2-bit Characters



public class OneBitTwoBit {

	public int[] splitter(String arrValue) {
		String[] parts = arrValue.split(" ");
		int array[] = new int[parts.length];
		for (int u = 0; u < parts.length; u++) {
			array[u] = Integer.parseInt(parts[u]);
		}

		return array;

	}

	 public boolean isOneBitCharacter(int[] bits) {
		
		 boolean isMatter= false;
		 if ((bits.length % 2) == 0)
		 {
		     isMatter = false;
		 }
		 else
		 {
			 isMatter = true;
		 }
		 
		 
		 return isMatter;
		   
	        
	        
	    }
	
	
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		OneBitTwoBit oneBitTwoBit=new OneBitTwoBit();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arraySize = Integer.parseInt(br.readLine());
		int array[] = new int[arraySize];
		array = oneBitTwoBit.splitter(br.readLine());
		
		System.out.println(oneBitTwoBit.isOneBitCharacter(array));
		
		
	}

}
