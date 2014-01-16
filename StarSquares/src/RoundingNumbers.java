import java.util.Scanner;

public class RoundingNumbers 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("This is a program for rounding numbers.");
		System.out.println("y = x + 0.5");
		System.out.println("Enter a number for x.");
		double x = input.nextDouble();
		double y = 0;
		double z = 0;
		String answerType;
		
		System.out.println("Would you like to round to the nearest whole number, nearest tenth, nearest hundredth, or nearest thousandth?");
		answerType = input.nextLine();
		
		if(answerType.compareTo("whole number")==0)
		{
			roundingToInteger(x,y,z);
		}
		if(answerType.compareTo("nearest tenth")==0)
		{
			roundingToTenths(x,y,z);
		}
		if(answerType.compareTo("nearest hundredth")==0)
		{
			roundingToHundredths(x,y,z);
		}
		if(answerType.compareTo("nearest thousandth")==0)
		{
			roundingToThousandths(x,y,z);
		}
		
		
		
		
	}	
		public static void roundingToInteger(double x, double y, double z)
		{
		// a. Rounding to Integer
			z = x+.5;
			y  = Math.floor(x+.5);
		
		System.out.println("The original answer is " +z);
		System.out.println("The rounded answer is "+y);
		}
		
		public static void roundingToTenths(double x, double y, double z)
		{
		//b. Rounding to Tenths
			z = ( x * 10 + 0.5 ) / 10;
			y = Math.floor(( x * 10 + 0.5 ) / 10);
			
			System.out.println("The original answer is "+z);
			System.out.println("The rounded answer is "+y);
		}
		public static void roundingToHundredths(double x, double y, double z)
		{
			//c. Rounding to Hundredths
			z = ( x * 100 + 0.5) / 100;
			y = Math.floor(( x * 100 + 0.5) / 100);
			
			System.out.println("The original answer is "+z);
			System.out.println("The rounded answer is "+y);
		}
		public static void roundingToThousandths(double x, double y, double z)
		{
			//d. Rounding to Thousandths
			z = ( x * 1000 + 0.5) / 1000;
			y = Math.floor(( x * 100 + 0.5) / 100);
			
			System.out.println("The original answer is "+z);
			System.out.println("The rounded answer is "+y);
		}

}
