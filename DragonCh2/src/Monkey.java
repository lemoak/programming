import java.util.Scanner;
public class Monkey {

	public static void main(String[] args) {
		// this program is going to use formatting to display text
		// this program will also be using arithmetic operators
				
				/*Scanner input = new Scanner(System.in);
				
				
				System.out.printf("Hello, User! \nWelcome to my program.\n");
				
				int number1 = 10;
				int number2 = 3;
				
				int answer;
				
				System.out.print("\rEnter first integer:");
				number1 = input.nextInt(); //Getting input from user and putting it into number1
				
				System.out.print("Enter second integer:");
				number2 = input.nextInt(); //Getting second integer from user and putting it into number2
				
				if ( number1 == number2 ) //check to see if the numbers are equal
					System.out.println("These numbers are equal.");
				
				if ( number1 != number2) //check to see if the numbers are not equal
					System.out.println("These numbers are not equal, dummy.");
					
				if ( number1%number2 == 0 ) //check to see if this number is even
					System.out.println("The second number divides into the first evenly.");
				
				if ( number1%2 == 0)
					System.out.println("The first number is even!");
				if (number1%2 != 0)
					System.out.println("The second number is not even.");
				
				if (number2%2 == 0)
					System.out.println("The second number is even.");
				if (number2%2 != 0)
					System.out.println("The second number is not even.");
					
				if ( number1 > number2 )
					System.out.println("The first integer is larger than the second.");
					
				if ( number1 < number2)
					System.out.println("The first integer is smaller than the second.");
				
				answer = number1%number2; 
				System.out.println(answer);*/

		for (int i=1; i<=6; i++)
		{
			for (int k=1; k<=i-1; k++)
				System.out.print("-");
			System.out.print(2*i);
			for (int k=i+1; k<=6; k++)
				System.out.print("-");
			System.out.println();
		}
	}

}
