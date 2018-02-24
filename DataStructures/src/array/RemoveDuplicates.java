package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveDuplicates {

	
	public int[] splitter(String arrValue) {
		String[] parts = arrValue.split(" ");
		int array[] = new int[parts.length];
		for (int u = 0; u < parts.length; u++) {
			array[u] = Integer.parseInt(parts[u]);
		}

		return array;

	}
	
	 public int removeDuplicates(int[] nums) {
	       int finalCount=0;
	       int i=0,j=1;
	       
	       while(j<nums.length)
	       {
	    	   if(nums[i]!=nums[j])
	    	   {
	    		   
	    		   finalCount++;
	    		   
	    	   }i++;j++;
	       }
		 
		 
		 return finalCount+1;
		 
	    }
	
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		
		RemoveDuplicates removeDup= new RemoveDuplicates();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arraySize = Integer.parseInt(br.readLine());
		int array[] = new int[arraySize];
		array = removeDup.splitter(br.readLine());
		
		
		System.out.println(removeDup.removeDuplicates(array));
		
		
	}

}
