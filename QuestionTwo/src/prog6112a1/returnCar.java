package prog6112a1;

public class returnCar extends CarRentalService {
	
	//declaring universal array that can be accessed across all methods within the class
	public static int[] returnID = new int[1];
	
	public void ReturnCar() {
		
		/*
		 * try-catch block that detects any exceptions thrown and displays and error
		 * message
		 */
		
		try {
			
		System.out.println("Enter car you wish to return>>");
		returnID[0] = kb.nextInt();
		
		}catch(Exception e) {
			
			System.out.println("Only enter numbers.");
			System.out.println("Re-enter all information.");
			ReturnCar();
			
		}//try-catch
		
		
		//for loop that iterates depending on the number of cars added
		for(int i = 0; i < 1; i++) {
			
			//if the ID entered doesn't match any ID stored, the program will display an error message
			if(returnID[i] != getCarID()) {
				
				System.out.println("ID not found.");
				break;
			}//end if
		
		System.out.println("CAR # "+returnID[0]+ " has been returned successfully!");
		
		}//end for
		System.out.println("----------------------------------");
		//calling menuItems() method so the user can return to the menu
		Question2.menuItems();
	}//end method

	
	
}//end class
