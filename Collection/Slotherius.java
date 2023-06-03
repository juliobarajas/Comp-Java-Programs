import java.util.Scanner;
import java.util.Random;

public class Slotherius {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rng = new Random();

		int attackOne;
		int attackTwo;
		int attackThree;

		System.out.println("Slotherius used Triple Claw Slash!");
		System.out.println("How many seconds would you like to charge?");
		int secCharge = scnr.nextInt();

		int lowerLimit = 20 - 10 * secCharge;
		int upperLimit = 20 + 15 * secCharge;

		attackOne = rng.nextInt(7) + 17;
		System.out.println("Attack 1: " + attackOne);
		attackTwo = rng.nextInt(7) + 17;
		System.out.println("Attack 2: " + attackTwo);
		attackThree = rng.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
		System.out.println("Attack 3: " + attackThree);

	}
}