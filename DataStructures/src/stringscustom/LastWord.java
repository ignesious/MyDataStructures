package stringscustom;
/*
 * https://www.interviewbit.com/problems/length-of-last-word/
 */
public class LastWord {
	 public int lengthOfLastWord(final String A) {
	     String toCheker=A.trim();
		 char toCheck[]=toCheker.toCharArray();  
	
	  int lastWordPoint=0;
	  int i=0;
		for( i=0;i<toCheck.length;i++)
		 {
			// System.out.println((int)toCheck[i]);
			 
			 if((int)toCheck[i] == 32)
			 {
				 lastWordPoint=i;
			 }
		 }
    // System.out.println("LastWordPoint is"+lastWordPoint);	
   //  System.out.println("i is at"+i);
     
     if(lastWordPoint!=0)
     return i-lastWordPoint-1;
     if(toCheck.length!=0)
    	 return toCheck.length;
	 return 0;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LastWord lastWord=new LastWord();
        System.out.println(lastWord.lengthOfLastWord("                   jsdfsdfsdf"));
	}

}
