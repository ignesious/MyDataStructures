package stringscustom;
/*
 * https://www.interviewbit.com/problems/add-binary-strings/
 */
public class AddBinary {

	   public String addBinary(String A, String B) {
		   long binary1, binary2;
		   int i = 0, remainder = 0;
		   int[] sum = new int[20];
		   StringBuffer c=new StringBuffer();

		  // System.out.print("Input first binary number: ");
		   binary1 = Long.valueOf(A).longValue();
		   //System.out.print("Input second binary number: ");
		   binary2 = Long.valueOf(B).longValue();

		   while (binary1 != 0 || binary2 != 0) 
		   {
		    sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
		    remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
		    binary1 = binary1 / 10;
		    binary2 = binary2 / 10;
		   }
		   if (remainder != 0) {
		    sum[i++] = remainder;
		   }
		   --i;
		   System.out.print("Sum of two binary numbers: ");
		   while (i >= 0) {
		  
		    c.append(sum[i--]);
		   }
		   // System.out.println("Final shit is "+ c.toString());
		    return c.toString();
		  }
	   

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddBinary addBinary=new AddBinary();
		addBinary.addBinary("1001", "10001");
		
	}

}
