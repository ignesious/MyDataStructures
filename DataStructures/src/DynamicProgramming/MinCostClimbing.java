package DynamicProgramming;


//https://leetcode.com/problems/min-cost-climbing-stairs/description/

public class MinCostClimbing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int stairCost[] = {10,15,20};
	int solDP[]= new int[4];
	solDP[0]=0;	
	solDP[1]=10;
	
	// Dp calculation....!!
	
	for(int i=2;i<4;i++)
	{
        int j=i;
		int oneStep = solDP[j-2]+solDP[j-1]+stairCost[j-1];
		int twoStep = solDP[j-2]+stairCost[j-1];
		solDP[i] = (oneStep<twoStep) ? oneStep : twoStep; // Doing tabulization here..........
		
	}
	
	System.out.println(solDP[3]);
	
}

}
