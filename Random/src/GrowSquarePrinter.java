import java.awt.Rectangle;

public class GrowSquarePrinter {

	public static void main(String[] args) {
		// Problem #1
		Rectangle box = new Rectangle(100,100,50,50);
		System.out.println(box);
		box.translate(25,25);
		box.grow(25,25);
		System.out.println(box);
		
		//Problem #2
		Rectangle box1 = new Rectangle(100,100,20,20);
		Rectangle box2 = new Rectangle(75,75,30,30);
		Rectangle box3 = box1.intersection(box2);
		System.out.println(box3);
		


	}

}
