import java.util.Scanner;

public class moreLoops {

	public static void main(String[] args) 
	{
		/*1. Write a program that determines the winner of a sales contest that would input the number of units 
		 * sold by each salesperson. The salesperson who sells the most units wins the contest.  
		 * Write a program that inputs a series of 10 integers and determines and prints the largest integer.  
		 * Your program should use at least the following three variables:
			A) Counter
			B) number:
			C) largest:
			2.  Now modify the program to find the TWO largest values of the 10 values entered.*/ 
		
		Scanner input = new Scanner(System.in); //allows input from the user.
		
		int counter = 0;
		int number=0;
		int largest=0;
		int secondLargest=0;
		int numberSold = 0;
		
		do 
		{
			System.out.println("Enter the number of units sold.");
			numberSold = input.nextInt();
			counter++;
			if (numberSold>largest)
				largest = numberSold;
			if (-1<secondLargest && secondLargest<largest)
			{
				secondLargest = numberSold;
			}
		}
		
		while (counter !=10);
			System.out.println("The largest number is:\t" +largest);
			System.out.println("The second largest number is:\t" +secondLargest);
			
		

	}

}
