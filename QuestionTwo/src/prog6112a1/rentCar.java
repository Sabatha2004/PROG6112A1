package prog6112a1;

public class rentCar extends CarRentalService {

	//declaring universal arrays that can be accessed across all methods within the class
	public static int[] carID = new int[1];
	public static int[] rentDays = new int[1]; 
	public static String[] customerName = new String[1];
	
	public void RentCar() {
		
		//for loop that iterates depending on the number of cars added
		for(int i = 0; i < 1; i++) {
			
	    //prompts that request user input	
		System.out.println("Enter customer name>>");
		customerName[i] = kb.next();
		
		/*
		 * try-catch block that detects any exceptions thrown and displays and error
		 * message
		 */
		try {
			
		System.out.println("Enter the car's ID number>>");
		carID[i] = kb.nextInt();
		
		}catch(Exception e) {
			
			System.out.println("Only enter numbers.");
			System.out.println("Re-enter all information.");
			RentCar();
		}//try-catch
		
		/*
		 * try-catch block that detects any exceptions thrown and displays and error
		 * message
		 */
		
		try {
			
		System.out.println("How many days will the car be rented out?>> ");
		rentDays[i] = kb.nextInt();
		
		}catch(Exception e) {
			
			System.out.println("Only enter numbers.");
			System.out.println("Re-enter all information.");
			RentCar();
			
		}//try-catch
		
		}//end for
		
		System.out.println("----------------------------------");
		//calling menuItems() method so the user can return to the menu
		Question2.menuItems();
		
	}//end method
	
	public void displayRevenue() {
		
		//the daily rent price multiplied by the number of rent days equals the total revenue
		double totalRev = super.getDailyprice()[0] * rentDays[0];
		
		System.out.println("Total revenue: R"+totalRev);
		System.out.println("----------------------------------");
		//calling menuItems() method so the user can return to the menu
		Question2.menuItems();
		
	}//end method
	

}//end class
