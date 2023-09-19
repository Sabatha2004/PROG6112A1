package prog6112a1;

import java.util.Scanner;

public class Question2 {

	// declaring "Scanner" object that enables user input
	public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		menuScreen();

	}// main

	public static void menuScreen() {

		int launchKey = 0;

		/*
		 * try-catch block that detects any exceptions thrown and displays and error
		 * message
		 */

		try {

			System.out.println("""
					CAR RENTAL SERVICE
					------------------------------------
					Enter (1) to launch menu or (2) to exit
					(if not the program will close)>> """);

			launchKey = kb.nextInt();

		} catch (Exception e) {

			System.out.println("Program closed.");

		} // end try-catch

		// switch case that allows user to access an option (a method) of their
		// choosing.
		switch (launchKey) {
		case 1 -> menuItems();
		case 2 -> System.out.println("Thank you for using this program.");
		
		}// switch

	}// end method

	public static void menuItems() {

		// declaring "rentCar" object that enables the use of all methods in the rentCar
		// method
		rentCar rc = new rentCar();
		// declaring "returnCar" object that enables the use of all methods in the
		// "returnCar"method
		returnCar rtrn = new returnCar();

		int item = 0;

		/*
		 * try-catch block that detects any exceptions thrown and displays and error
		 * message
		 */
		try {

			System.out.println("""
					Please select one of the following menu items
					(if not the program will close)
					
					(1) Add New Car
					(2) Rent A Car
					(3) Return A Car
					(4) View Car Details
					(5) View Total Revenue Generated
					(6) Exit Application""");

			item = kb.nextInt();

		} catch (Exception e) {

			System.out.println("Program closed.");

		}
		// switch case that allows user to access an option (a method) of their
		// choosing.

		switch (item) {

		case 1 ->

			CarRentalService.addNewCar();

		case 2 -> rc.RentCar();
		case 3 -> rtrn.ReturnCar();

		case 4 -> CarRentalService.displayCarDetails();

		case 5 -> rc.displayRevenue();

		case 6 -> CarRentalService.exitApplication();

		}// end switch

	}// end method

}// end class
