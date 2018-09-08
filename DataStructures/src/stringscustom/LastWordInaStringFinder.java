package stringscustom;

import java.util.HashSet;
import java.util.Set;

/*
 * https://stackoverflow.com/questions/38457233/last-repeating-character-in-a-string
 */
public class LastWordInaStringFinder {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "how are you doing today";

		 StringBuilder input1 = new StringBuilder();
		 input1.append(input);
		 input1 = input1.reverse(); 
		 
		Set<Character> resultfinder=new HashSet<Character>();

       for(char temp:input1.toString().toCharArray())
       {
    	   
    	   boolean finder=resultfinder.add(temp);
    	   if(!finder){
    		   System.out.println("Found the character--------->  " + temp);
    		break;   
    	   }
       }
		 
	}

}
