

public class BooleanAlgebra 
{

	public static void main(String[] args) 
	{
		int day;
		String gift1 = " a partridge in a pear tree.";
		String gift2 = " two turtle doves, and ";
		String gift3 = " three French hens,";
		String gift4 = " four calling birds";
		String gift5 = " five golden rings,";
		String gift6 = " six geese a'layin',";
		String gift7 = " seven swans a'swimmin',";
		String gift8 = " eight maids a'milkin',";
		String gift9 = " nine ladies dancing,";
		String gift10 = " ten lords a'leaping,";
		String gift11 = " eleven pipers piping,";
		String gift12 = " twelve drummers drumming,";
		
		for(int i=1; i<=12; i++)
		{
			System.out.printf("On the");
			switch(i)
			{
			case 1:
			{
				System.out.printf(" first ");
				break;
			}
			case 2:
				System.out.printf(" second ");
				break;
			case 3:
				System.out.printf(" third ");
				break;
			case 4:
				System.out.printf(" fourth ");
				break;
			case 5:
				System.out.printf(" fifth ");
				break;
			case 6:
				System.out.printf(" sixth ");
				break;
			case 7:
				System.out.printf(" seventh ");
				break;
			case 8:
				System.out.printf(" eighth ");
				break;
			case 9:
				System.out.printf(" ninth ");
				break;
			case 10:
				System.out.printf(" tenth ");
				break;
			case 11:
				System.out.printf(" eleventh ");
				break;
			case 12:
				System.out.printf(" twelfth ");
				break;
			}
			System.out.printf("day of Christmas, my true love gave to me:\r");
			
			switch(i)
			{
			case 1:
				System.out.printf(gift1);
				break;
			case 2:
				System.out.printf(gift2+gift1);
				break;
			case 3:
				System.out.printf(gift3+gift2+gift1);
				break;
			case 4:
				System.out.printf(gift4+gift3+gift2+gift1);
				break;
			case 5:
				System.out.printf(gift5+gift4+gift3+gift2+gift1);
				break;
			case 6:
				System.out.printf(gift6+gift5+gift4+gift3+gift2+gift1);
				break;
			case 7:
				System.out.printf(gift7+gift6+gift5+gift4+gift3+gift2+gift1);
				break;
			case 8:
				System.out.printf(gift8+gift7+gift6+gift5+gift4+gift3+gift2+gift1);
				break;
			case 9:
				System.out.printf(gift9+gift8+gift7+gift6+gift5+gift4+gift3+gift2+gift1);
				break;
			case 10:
				System.out.printf(gift10+gift9+gift8+gift7+gift6+gift5+gift4+gift3+gift2+gift1);
				break;
			case 11:
				System.out.printf(gift11+gift10+gift9+gift8+gift7+gift6+gift5+gift4+gift3+gift2+gift1);
				break;
			case 12:
				System.out.printf(gift12+gift11+gift10+gift9+gift8+gift7+gift6+gift5+gift4+gift3+gift2+gift1);
			}
		}

	}

}
