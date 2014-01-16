import java.util.Scanner;

public class MonkeyPt4 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// this program calculates body mass index based on the user input of weight and height
		double weightInPounds;
		double heightInInches;
		
		System.out.println("Enter your weight in pounds, please.");
		weightInPounds = input.nextInt(); //user input of weight
		System.out.println("Enter your height in inches, please.");
		heightInInches = input.nextInt(); //user input of height
		
		double numerator = weightInPounds*703;
		double denominator = heightInInches*heightInInches;
		double bMI = numerator/denominator;
		System.out.println("Your body mass index is");
		System.out.println(bMI);
		
		if (bMI < 18.5)
			System.out.println("You are underweight.");
		if (18.5 < bMI)
			if (bMI < 24.9)
				System.out.println("Your weight is normal.");
		if (25 < bMI)
			if (bMI < 29.9)
				System.out.println("You are overweight.");
		if (30 < bMI)
			System.out.println("You are obese.");
		
		

	}

}
