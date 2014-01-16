import java.util.Random;

public class Craps {

	public static void main(String[] args) {
		
		
		
		rollDice();
	}
	public static int rollDice()
	{
		Random rnd = new Random();
		
		int die1 = 1 + rnd.nextInt(6);
		int die2 = 1 + rnd.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = &d\%n");
		return sum;
	}

}
