import java.util.Scanner;

public class PriceStats {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Declare variables
		int i = 0;
		double dailyPrice = 0;
		double priceAverage;
		double sum = 0;
		double high = Double.NEGATIVE_INFINITY;
		double low = Double.POSITIVE_INFINITY;
		boolean stock_market = true;
		double priceRange = 0;
		
		while(stock_market) {
			System.out.print("Enter daily stock price (0 to exit):");
			dailyPrice = scnr.nextDouble();
			sum = sum + dailyPrice;
			if ( dailyPrice == 0) {
				i--;
				break;
			}
			else if (dailyPrice < 0) {
				System.out.println("Stock price can't be negative! Care to try again?");
				i--;
			}
			else {
				if (dailyPrice > high) {
					high = dailyPrice;
				}
				if(dailyPrice < low){
					low = dailyPrice;
				}
				i++;
			}
			
		}
		// Loop until daily price == 0
		
		priceAverage = sum / i;
		priceRange = high - low;

		System.out.println("Stats over " + i + " trading day(s):");
		System.out.println("Average: $" + priceAverage);
		System.out.println("High:    $" + high );
		System.out.println("Low:     $" + low);
		System.out.println("Range:   $" + priceRange);



			
		
	}
}
