import java.util.Random;
public class DieSimulator {

	public static void main(String[] args) {
		Random rnd = new Random();
		int DieSimulator = rnd.nextInt(6);
		System.out.println(DieSimulator);

	}

}
