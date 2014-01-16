import java.util.Scanner;

import java.util.Random;

public class ForLoops2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random rand=new Random();
		int number = 0;
		String response = "yes";
		
		
		//String question = input.nextLine();
		System.out.println("I AM THE MAGIC 8 BALL! Ask me a question.");
		
		do
		{
			String question = input.nextLine();
			
			switch (rand.nextInt(9))
			{
				case 0:
					System.out.println("Yes");
					break;
				case 1:
					System.out.println("No");
					break;
				case 2:
					System.out.println("Never in a million years");
					break;
				case 3:
					System.out.println("Maybe");
					break;
				case 4:
					System.out.println("You're ugly. Go home.");
					break;
				case 5:
					System.out.println("I don't know anything");
					break;
				case 6:
					System.out.println("That's a stupid question");
					break;
				case 7:
					System.out.println("Get on my level");	
					break;
				case 8:
					System.out.println("How about I get back to you on that later?");
					break;
				case 9:
					System.out.println("That's nice, dear.");
					break;
			} //end of the switch
			
			System.out.println("Would you like to ask another question?");
			response = input.nextLine();
			if (response.compareTo("yes")==0)
			{
				System.out.println("Ask me anything.");
				//String question2 = input.nextLine();
			}
		}while(response.compareTo("yes")==0);
		
		if (response.compareTo("no")==0)
			System.out.println("Goodbye.");
	}

}
