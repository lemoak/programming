
public class GradeBook 
{
	
	private String courseName;
	private String instructorName;
	
	public void setCourseName(String name)
	{
		courseName = name;
		
	}
	
	
	public String getCourseName()
	{
		return courseName;

	}
	public void setInstructorName(String instructor)
	{
		instructorName = instructor;
	}
	
	public String getInstructor()
	{
		return instructorName;
	}
	public void displayMessage(String message)
	{
		System.out.println(message);
		System.out.println("wut");
		System.out.println("This is the displayMessage method!");
	}
	
}
