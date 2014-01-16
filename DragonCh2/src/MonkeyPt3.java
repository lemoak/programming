import java.util.Scanner;

public class MonkeyPt3 
{


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int radius;
		float circumference;
		float diameter; 
		float area;
		float pi = (float) 3.14159;
		
		System.out.println("Enter a whole number for the radius.");
		radius = input.nextInt(); //the input from the user. Gives the radius
		
		//calculates and prints the radius
		diameter = radius*2;
		System.out.println("The diameter is:");
		System.out.println(diameter);
		
		//calculates and prints the circumference
		circumference = 2*radius*pi;
		System.out.println("\rThe circumference is:");
		System.out.println(circumference);
		
		//calculates and prints the area
		area = pi*radius*radius;
		System.out.println("\rThe area is:");
		System.out.println(area);
		
		
	}

}
