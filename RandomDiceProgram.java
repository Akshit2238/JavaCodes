import java.util.Random;
public class RandomDiceProgram {
	public  static void main(String[] args) {
		Random roll = new Random();
		int x = roll.nextInt(6)+1;
		int y = roll.nextInt(50)+1;
		System.out.println("You rolled a (1-6)): " +x);
		System.out.println("You rolled a (1-50): "+y);
	}

}
