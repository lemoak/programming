import java.util.Scanner;

public class Turkey {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		for (int counter= 1; counter != 100; counter++)
		{
			System.out.println(counter);
			
			if (counter%3==0)
			{
				System.out.println("Buzz");
			}
			
			if (counter%5==0)
			{
				System.out.println("Fizz");
			}
			
			if (counter %3==0)
				if (counter %5==0)
					System.out.println("FizzBuzz");
		}
		
		int number = 1;
		while(number!=1)
		{
			number++;
			if (number%2==1)
			{
			
			}
		}

	}

}
