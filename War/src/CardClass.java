
public class CardClass 

{
	int n1;
	int WarSimulator;
	String cardSuit; 
	String cardNumb;
	
	//gives the card a suit
	
	public String CardSuit(int cardType)
	{
		if (n1 < 14)
		{
			cardSuit = "Hearts";
			return cardSuit;
		}		
		
		if (n1>14)
		{
			if (n1<27)
				cardSuit = "Spades";
				return cardSuit;
		}
		if (n1>27)
		{
			if (n1<39)
				cardSuit = "Clubs";
				return cardSuit;
		}
		
		if (n1>39)
		{
			if (n1<51)
				cardSuit = "Diamonds";
				return cardSuit;
		}
		if (WarSimulator < 14)
		{
			cardSuit = "Hearts";
			return cardSuit;
		}		
		
		if (WarSimulator>14)
		{
			if (n1<27)
				cardSuit = "Spades";
				return cardSuit;
		}
		if (WarSimulator>27)
		{
			if (n1<39)
				cardSuit = "Clubs";
				return cardSuit;
		}
		
		if (WarSimulator>39)
		{
			if (n1<51)
				cardSuit = "Diamonds";
				return cardSuit;
		}
		
		return "Error";
	}
	
	//gives the number in the suit
	
	
	  public String CardNumber(int cardNumber)
	{
		if (n1==0)
		{
			cardNumb = "Ace";
			return cardNumb;
		}
		if (n1==11)
		{
			cardNumb = "Jack";
			return cardNumb;
		}
		if (n1==12)
		{
			cardNumb = "Queen";
			return cardNumb;
		}
		if (n1==13)
		{
			cardNumb = "King";
			return cardNumb;
		}
		if (WarSimulator==0)
		{
			cardNumb = "Ace";
			return cardNumb;
		}
		if (WarSimulator==11)
		{
			cardNumb = "Jack";
			return cardNumb;
		}
		if (WarSimulator==12)
		{
			cardNumb = "Queen";
			return cardNumb;
		}
		if (WarSimulator==13)
		{
			cardNumb = "King";
			return cardNumb;
		}
		return "Error";
	}


}
