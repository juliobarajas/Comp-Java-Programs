import java.util.Scanner;

public class CalendarDates {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int daysOfJan = 31;
		int daysOfFeb = 28;
		int daysOfMar = 31;
		int daysOfApr = 30;
		int daysOfMay = 31;
		int daysOfJun = 30;
		int daysOfJul = 31;
		int daysOfAug = 31;
		int daysOfSep = 30;
		int daysOfOct = 31;
		int daysOfNov = 30;
		int daysOfDec = 31;
		int dayOfWeek;
		int dayOfMay;
		int dayOfDec;

		System.out.println("What day of the week was Jan. 1? Enter 0 for Sunday, 1 for Monday, and so on.");
		dayOfWeek = scnr.nextInt();

		dayOfWeek = (daysOfJan + dayOfWeek) % 7;
		dayOfWeek = (daysOfFeb + dayOfWeek) % 7;
		dayOfWeek = (daysOfMar + dayOfWeek) % 7;
		dayOfMay = (daysOfApr + dayOfWeek) % 7;
		dayOfWeek = (daysOfMay + dayOfMay) % 7;
		dayOfWeek = (daysOfJun + dayOfWeek) % 7;
		dayOfWeek = (daysOfJul + dayOfWeek) % 7;
		dayOfWeek = (daysOfAug + dayOfWeek) % 7;
		dayOfWeek = (daysOfSep + dayOfWeek) % 7;
		dayOfWeek = (daysOfOct + dayOfWeek) % 7;
		dayOfDec = (daysOfNov + dayOfWeek) % 7;

		System.out.println("The day of the week of May 1 is: " + dayOfMay);
		System.out.println("The day of the week of Dec 1 is: " + dayOfDec);

		

		


	}
}