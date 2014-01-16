import java.util.Scanner;
import java.awt. TrayIcon;

public class GradeBookTester {

	public static void main(String[] args) 
	{
		
		//A scanner object. Takes input from user
		Scanner input = new Scanner(System.in);
		
		//takes input from user to give the course a name
		String courseName;
		System.out.println("Please enter the name of the course.");
		courseName = input.nextLine(); //takes next line of input from user to give the course a name.
		
		GradeBook gb1 = new GradeBook();
		gb1.setCourseName(courseName);
		
		System.out.println(gb1.getCourseName());
		
		String instructorName;
		System.out.println("Please enter the name of the instructor.");
		gb1.setInstructorName(input.nextLine()); //takes next line of input from user to give the instructor a name.
		
		System.out.println("What would you like the message to be?");
		String message = input.nextLine();
		gb1.displayMessage(message);
		
		

	}

}
