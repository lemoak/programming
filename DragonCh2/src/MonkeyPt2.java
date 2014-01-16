import java.util.Scanner;

public class MonkeyPt2 {

	public static void main(String[] args) {
		// this program is a continuation of arithmetic operations
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi, there! Welcome to my program."); 
		
		double n1 = 43.89;
		double n2 = 5000;
		double n3 = 4538.89;
		double result;
		
		System.out.print("\rEnter first integer:");
		n1 = input.nextInt(); //Getting input from user and putting it into n1
		
		System.out.print("Enter second integer:");
		n2 = input.nextInt(); //Getting second integer from user and putting it into n2
		
		System.out.print("Enter third integer:");
		n3 = input.nextInt(); //Getting third integer from user and putting it into n3
		
		result = (n1+n2+n3); //The sum of n1, n2, and n3
		System.out.printf("\nThe sum is:");
		System.out.print(result);
		
		double average = result/3; //find the average of the three numbers
		System.out.printf("\nThe average of your three numbers is:");
		System.out.println(average);
		
		if (n1 > n2) //is n1 larger than n2?
			if (n1 > n3) //is n1 larger than n3
				System.out.println("The first number is the largest number.");
		if (n2 > n1) //is n1 smaller than n2?
			if (n2 > n3)
				System.out.println("The second number is the largest number.");
		if (n3 > n1) //is n3 larger than n1?
			if (n3 > n2) //is n3 larger than n2?
				System.out.println("The third number is the largest number.");
		if (n1==n2) //are they the same number?
			System.out.println("Number 1 and Number 2 are the same.");
		if (n1==n3) //are they the same number?
			System.out.println("Number 1 and Number 3 are the same.");
		if (n2==n3) //are they the same number?
			System.out.println("Number 2 and Number 3 are the same.");
		if (n1==n2)
			if (n2==n3)
				System.out.println("All three numbers are the same!");
				
		
		//Problem2
		
		System.out.println("\rLet's try something else!");
		
		double number1 = 43289;
		double number2 = 432;
		double number3 = 30;
		double number4 = 32890;
		double number5 = 382;
		
		System.out.print("\rEnter first integer:");
		number1 = input.nextInt(); //Getting input from user and putting it into number1
		
		System.out.print("Enter second integer:");
		number2 = input.nextInt(); //Getting second integer from user and putting it into number2
		
		System.out.print("Enter third integer:");
		number3 = input.nextInt(); //Getting third integer from user and putting it into number3
		
		System.out.print("Enter fourth integer:");
		number4 = input.nextInt();//get fourth integer from user and put it into number4
		
		System.out.print("Enter fifth integer:");
		number5 = input.nextInt(); //get fifth integer from user and put it into number5
		
		//check to see if number1 is the largest 
		if (number1 > number2) 
			if (number1 > number3)
				if (number1 > number4)
					if (number1 > number5)
						System.out.println("The first number is the largest.");
		//check to see if number2 is the largest
		if (number2 > number1)
			if (number2 > number3)
				if (number2 > number4)
					if (number2 > number5)
						System.out.println("The second number is the largest.");
		//check to see if number3 is the largest
		if (number3 > number1)
			if (number3 > number2)
				if (number3>number4)
					if (number3>number5)
						System.out.println("The third number is the largest.");
		//check to see if number4 is the largest
		if (number4>number1)
			if (number4>number2)
				if (number4>number3)
					if (number4>number5)
						System.out.println("The fourth number is the largest.");
		//check to see if number5 is the largest
		if (number5>number1)
			if (number5>number2)
				if (number5>number3)
					if (number5>number4)
						System.out.println("The fifth number is the largest.");
		
		//check to see if number1 is the smallest
				if (number1 < number2) 
					if (number1 < number3)
						if (number1 < number4)
							if (number1 < number5)
								System.out.println("The first number is the smallest.");
				//check to see if number2 is the smallest
				if (number2 < number1)
					if (number2 < number3)
						if (number2 < number4)
							if (number2 < number5)
								System.out.println("The second number is the smallest.");
				//check to see if number3 is the smallest
				if (number3 < number1)
					if (number3 < number2)
						if (number3<number4)
							if (number3<number5)
								System.out.println("The third number is the smallest.");
				//check to see if number4 is the smallest
				if (number4<number1)
					if (number4<number2)
						if (number4<number3)
							if (number4<number5)
								System.out.println("The fourth number is the smallest.");
				//check to see if number5 is the smallest
				if (number5<number1)
					if (number5<number2)
						if (number5<number3)
							if (number5<number4)
								System.out.println("The fifth number is the smallest.");
		
		
			

	}

}
