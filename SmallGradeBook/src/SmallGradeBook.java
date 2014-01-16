import java.util.Scanner;
public class SmallGradeBook {

	public static void main(String[] args) 
	{
		
		// this is a program to calculate and average test scores
		
		Scanner input = new Scanner(System.in); //allows input from the user.
		int testScore=0;
		int testPassed=0;
		int testFailed=0;
		int totalTest=0;
		int totalScore=0;
		int average;
		
		while (testScore != -1) //allows the user to enter test scores until -1 is entered
		{
			
		System.out.println("Enter the test scores. If you have no more tests to enter, please enter -1.");
		testScore = input.nextInt();
		if (testScore != -1) 
		{
			totalScore+=testScore; //adds the total score with the test score
			totalTest++; //adds the total number of tests entered
		}
		System.out.println("Total number of tests:\t" + totalTest);
		
		if (testScore >=60) //if the test score is greater than or equal to 60, does the following
		{
			testPassed++; //adds the total number of tests passed
			System.out.println("Total number of passed:\t" +testPassed);
		}
		
		if (testScore<60) //if the test score is less than 60, does the following
		{
			testFailed++; //adds the total number of tests failed
			System.out.println("Total number of failed:\t" +testFailed);
		}
		
		}
		
		average = (totalScore/(totalTest++)); //calculates the average by dividing the total score by the total number of tests
		System.out.println("The average is:\t" +average);
	}

}
