import java.util.Scanner;
import java.util.Random;

public class WarSimulator {

	public static void main(String[] args) {
		
		// this is a program to simulate the card game war
		
		Random rnd = new Random(); //random number generator
		CardClass deck = new CardClass();
		Scanner input = new Scanner(System.in); //allows input from the user.
		String userName;
		String card = "Ace";
		String card2 = "Jack";
		String card3 = "Queen";
		String card4 = "King";
		String cardSuit;
		String cardNumb;
		
		
		System.out.println("Hey you! Let's play a game. What's your name?");
		userName = input.nextLine();
		System.out.println("Alright," + userName +", let's play WAR!");
		
		String response = "yes";
		
		do
		{
			System.out.println("Draw a card!");
			int n1 = rnd.nextInt(13);
			cardSuit = deck.CardSuit(n1);
			cardNumb = deck.CardSuit(n1);
			if (n1==0)
			{
				System.out.println("Your card was:"+ cardNumb + "of" +cardSuit);
			}
			else
			{
				System.out.println("Your card was:\t" + n1 + "of" +cardSuit);
			}
			if (n1==11)
			{
				System.out.println("Your card was:"+ cardNumb + "of" +cardSuit);
			}
			else
			{
				System.out.println("Your card was:"+n1 + "of" +cardSuit);
			}
			if(n1==12)
			{
				System.out.println("Your card was:" + cardNumb + "of" + cardSuit);
			}
			if(n1==13)
			{
				System.out.println("Your card was:" + cardNumb + "of" +cardSuit);
			}
			
			int WarSimulator = rnd.nextInt(13);
			cardNumb = deck.CardSuit(WarSimulator);
			cardSuit = deck.CardSuit(WarSimulator);
			if (WarSimulator==0)
			{
				System.out.println("My card was:"+ cardNumb + "of" +cardSuit);
			}
			else
			{
				System.out.println("My card was:\t" + WarSimulator + "of" +cardSuit);
			}
			if (WarSimulator==11)
			{
				System.out.println("My card was:"+ cardNumb + "of" +cardSuit);
			}
			else
			{
				System.out.println("My card was:"+WarSimulator + "of" +cardSuit);
			}
			if(WarSimulator==12)
			{
				System.out.println("My card was:" + cardNumb + "of" + cardSuit);
			}
			if(WarSimulator==13)
			{
				System.out.println("Your card was:" + cardNumb + "of" +cardSuit);
			}
			else
			{
				System.out.println("My card was:\t" + WarSimulator + "of" +cardSuit);
			}
			//compares the two numbers
			if (n1 < WarSimulator)
				System.out.println("You lost, sorry\t" +userName);
			if (n1 > WarSimulator)
				System.out.println("You won, good job\t" +userName + "!");
			if (n1 == WarSimulator)
			{
				System.out.println("WAR! Draw another card.");
				n1 = rnd.nextInt(12);
				System.out.println("Your card was:\t" +n1 +"of" +cardSuit);
				WarSimulator = rnd.nextInt(13);
				System.out.println("My card was:\t" +WarSimulator +"of" +cardSuit);
				if (n1 < WarSimulator)
					System.out.println("I won!");
				if (n1 > WarSimulator)
					System.out.println("You won! Great job" +userName + "!");
				
				
			
			}
			
			System.out.println("Would you like to play again?"); 
			response = input.nextLine();
		}while(response.compareTo("yes")==0);	
		
		if (response.compareTo("no")==0)
			System.out.println("Thanks for playing! Goodbye,\t" + userName + ".");

	}
}
