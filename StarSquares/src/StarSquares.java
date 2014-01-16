import java.util.Scanner;

public class StarSquares 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		String response;
		do
		{
		
		
		System.out.println("Enter the box dimensions.");
		int dimension = input.nextInt();
		
		stars(dimension);
		
		
		System.out.println("Again? Enter yes or no."); 
		
		response = input2.nextLine();
		}while(response.compareTo("yes")==0);
		
		if (response.compareTo("no")==0)
			System.out.println("Goodbye.");
		
	}	
		public static void stars(int dimension)
		{
			
		for(int i=dimension; i<=dimension; i++)
			{
				System.out.println();
				for(int j=1; j<=i; j++)
				{
					for(int m=1; m<=i; m++)
					{
						System.out.print("*");
					}
				
				System.out.println();
				}
				
			}
		
		if(dimension<1)
			System.out.println("Error.");
		
		}

}
