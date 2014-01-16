import java.util.Random;

public class LotteryTester {

	public static void main(String[] args) {
		
		// Problem #3
		
		System.out.println("Play this combination--it'll make you rich!");
		Random rnd = new Random();
		int LotteryTester1 = rnd.nextInt(49);
		System.out.println(LotteryTester1);
		int LotteryTester2 = rnd.nextInt(49);
		System.out.println(LotteryTester2);
		int LotteryTester3 = rnd.nextInt(49);
		System.out.println(LotteryTester3);
		int LotteryTester4 = rnd.nextInt(49);
		System.out.println(LotteryTester4);
		int LotteryTester5 = rnd.nextInt(49);
		System.out.println(LotteryTester5);
		int LotteryTester6 = rnd.nextInt(49);
		System.out.println(LotteryTester6);
		
		
		int mystery = 15;
		mystery = 7 - 2 * mystery;
		mystery = mystery +2;
		System.out.println(mystery);
		

	}

}
