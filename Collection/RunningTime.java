import java.util.Scanner;

public class RunningTime {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int startHour;
		int startMinutes;
		int startSeconds;
		int milesRan;
		int paceMinutes;
		int paceSeconds;
		int endMinutes;
		int endHour;
		int endSeconds;
		int remainderMinutes;
		int remainderSeconds;
		int finalMinutes;
		int finalSeconds;
		int finalHour;

		System.out.println("What time did you start your run?");
		System.out.println("Hour (0-23) - "); 
		startHour = scnr.nextInt();
		System.out.println("Minute (0-59) - ");
		startMinutes = scnr.nextInt();
		System.out.println("Second (0-59) - ");
		startSeconds = scnr.nextInt();
		System.out.println("How many miles did you run?");
		milesRan = scnr.nextInt();
		System.out.println("What was your per-mile pace?");
		System.out.println("Minute (0-59) - ");
		paceMinutes = scnr.nextInt();
		System.out.println("Second (0-59) - ");
		paceSeconds = scnr.nextInt();

		endMinutes = paceMinutes * milesRan; //24 min
		endSeconds = paceSeconds * milesRan; 
		remainderMinutes = endSeconds / 60; //2 min
		remainderSeconds = endSeconds % 60; // 15 sec
		endMinutes = remainderMinutes + endMinutes; // 26 min

		remainderMinutes = endMinutes + startMinutes; //71 min
		endHour = remainderMinutes / 60;
		finalHour = endHour + startHour;
		finalMinutes = remainderMinutes % 60;
		

		System.out.print("Your ending time is " + finalHour);
		System.out.print(":" + finalMinutes);
		System.out.println(":" + remainderSeconds);
		
	}
}