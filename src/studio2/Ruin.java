package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting amount: ");
		double startAmount = in.nextDouble(); 
		System.out.print("Enter win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Enter win limit: ");
		double winLimit = in.nextDouble(); 
		System.out.print("Enter total simulation number: ");
		int totalSimulations = in.nextInt();
		int ruinCount = 0;
		
		for (int count = 1; count <= totalSimulations; count++)
		{
		double startAmountA=startAmount;	
		
		
		while (startAmount>0 && startAmount < winLimit) 
		{
		
		double winOrLoss = Math.random();
		
		if (winOrLoss < winChance)
		{startAmount = startAmount +1;
		
		}
		else 
		{startAmount = startAmount-1;
		
		}
	
		}
		
		if (startAmount <= 0) {
			System.out.println("Simulation " + count + ": The day was a ruin.");
			ruinCount = ruinCount + 1;
			
		}
		
		else if (startAmount == winLimit) {
			System.out.println("Simulation " + count+ ": It was a successful day!");
		}
		
		startAmount = startAmountA; }
		
		if (winChance == 0.5) {
			double expectedRuin = 1 - (startAmount / winLimit);
			System.out.println("Expected ruin: " + expectedRuin);

		}
		else {
			double a = ((1-winChance)/winChance);
			double expectedRuin =( Math.pow(startAmount, a) - Math.pow(winLimit, a) ) / (1- Math.pow(winLimit, a)); 
			System.out.println("Expected ruin: " + expectedRuin);
		}
		System.out.println("Number of ruins: " + ruinCount);
		double actualRuin = (double) ruinCount/totalSimulations;
		System.out.println("Actual ruin: " + actualRuin);
	}
	
	
}


