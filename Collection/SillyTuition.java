import java.util.Scanner;

public class SillyTuition {
	public static void main(String[] args) {
		Scanner tuitionCalc = new Scanner(System.in);

		int funClass;
		int unfunClass;
		int subTotal;
		int priceFunClass = 100;
		int priceUnfunClass = 25;

		System.out.println("How many hours of fun classes are you taking?"); 
		funClass = tuitionCalc.nextInt();
		System.out.println("How many hours of un-fun classes are you taking?");
		unfunClass = tuitionCalc.nextInt();

		subTotal = (funClass * priceFunClass) + (unfunClass * priceUnfunClass);
		System.out.println("Your tuition is $" + subTotal);

	}
}