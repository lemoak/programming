import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;

public class CallingMethods 
{

	public static void main(String[] args) 
	{
		/*String greeting = "Hello, World!";
		System.out.println(greeting);
		
		int Lauren = 20;
		
		Rectangle box1 = new Rectangle(10,10,500,300);*/
		
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println("Before: " + box.getX());
		box.translate(25, 40);
		System.out.println("After: " + box.getX());
		
		double width = new Rectangle(5,10,15,20).getWidth();
		/*int numberOfCharacters = greeting.length();
		System.out.println(numberOfCharacters);
		numberOfCharacters = greeting.replace("World", "Dave").length();
		System.out.println(numberOfCharacters);
		
		
		
		String river = "Mississippi";
		System.out.println(river);
		int numberofCharacters = river.length();
		System.out.println(numberofCharacters);
		
		river = river.replace("i", "!");
		river = river.replace("s","$");
		System.out.println(river);
		
		String word = "Four Hundred";
		System.out.println(word);
		*/
		
		
		
		
	}

}
