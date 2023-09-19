package prog6112a1;

import java.util.Scanner;

public class CarRentalService {

	//declaring universal "Scanner" object that enables user input across all sub classes
	public static Scanner kb = new Scanner(System.in);
	//declaring universal "carID" variable that can be used across all methods within the class
	public static int carID;
	//declaring universal arrays that can be accessed across all methods within the class
	public static String[] make = new String[1];
	public static String[] model = new String[1];
	public static int[] year = new int[1];
	private static double[]dailyPrice = new double[1];
	
	public static void addNewCar() {
		
		//for loop that iterates depending on the number of cars added
		for(int i = 0; i < 1; i++) {
			
		//prompts that request user input		
		System.out.println("What is the car make?>>");
		make[i] = kb.next();
		System.out.println("What is the car model?>>");
		model[i] = kb.next();
		
		/*
		 * try-catch block that detects any exceptions thrown and displays and error
		 * message
		 */
		
		try {
			
		System.out.println("What year was it manufactured?>>");
		year[i] = kb.nextInt();
		
		}catch(Exception e) {
			
			System.out.println("Only enter numbers.");
			System.out.println("Re-enter all information.");
			addNewCar();
		}//try-catch
		
		/*
		 * try-catch block that detects any exceptions thrown and displays and error
		 * message
		 */
		try {
		System.out.println("What is the daily rental price?");
		getDailyprice()[i] = kb.nextInt();
		
		}catch(Exception e) {
			System.out.println("Only enter numbers.");
			System.out.println("Re-enter all information.");
			addNewCar();
			
		}//try-catch
		
		//Math.randon() method generates random numbers that will be used as IDs for each car
		carID = i + 1;
		
		}//end for
	
		//displaying Car ID so the user can type it in when registering to rent a car
		System.out.println("Car ID: "+carID);
		System.out.println("----------------------------------");
		//calling menuItems() method so the user can return to the menu
		Question2.menuItems();
		
	}//end method
	
	public static void displayCarDetails() {
		
		//declarations that allow the use of the aforementioned universal arrays
		String[] makeDisplay = make;
		String[] modelDisplay = model;
		int[] yearDisplay = year;
		double[] priceDisplay = getDailyprice();
		
		//for loop that iterates depending on the number of cars added
		for(int i = 0; i < 1; i++) {
			
		System.out.println("CAR #" + carID + "\n\n"
                + "MAKE: " + makeDisplay[i] + "\n"
                + "MODEL: " + modelDisplay[i] + "\n"
                + "YEAR: " + yearDisplay[i] + "\n"
                + "DAILY RENT: " + priceDisplay[i]);
		}//end for
		
		System.out.println("----------------------------------");
		//calling menuItems() method so the user can return to the menu
		Question2.menuItems();
		
	}//end method
	
	public static void exitApplication () {
		
		System.out.println("Thank you for using this program.");
		
	}//end method

	//getter that allows access to the "carID" variable across all sub classes
	public static int getCarID() {
		return carID;
	}
	//getter that allows access to the "dailyPrice" variable across all sub classes
	public static double[] getDailyprice() {
		return dailyPrice;
	}
	
}//end class
