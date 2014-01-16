import java.util.Scanner;
public class Example 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter box size:");
		int size= input.nextInt();
		System.out.println("Enter character:");
		String character=input1.nextLine();
		squareMaker(size, character);
	}//end main
	public static void squareMaker(int size, String character)	
	{
		int i;
		int j;
		int k;
		
		for (i=size;i<=size;i++)
		{
			for (j=1;j<=i;j++)
			{
				for (k=1;k<=i;k++)
					System.out.print(character);
					System.out.println();
			}
			System.out.println();
		}
		
	}
}
 