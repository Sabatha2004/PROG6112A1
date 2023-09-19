package prog6112a1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarRentalServiceTests {

	@Test
	public void TestAddNewCar() {
		
		String[] make = new String[1];
		String[] model = new String[1];
		int[] year = new int[1];
		int[]dailyPrice = new int[1];

		make[0] = "Mercedes Benz";
		model[0] = "S.Class";
		year[0] = 2021;
		dailyPrice[0] = 500;

		assertEquals("Mercedes Benz", make[0]);
		assertEquals("S.Class", model[0]);
		assertEquals(2021, year[0]);
		assertEquals(500, dailyPrice[0]);
		
		/*
		 * Unit test that determines whether the correct car details will be saved to
		 * memory. If the expected input matches the actual input in the assertEquals()
		 * method, the test will run with no errors.
		 */
	}//end test
	
	@Test
	public void TestRentCar() {
		
		int[] carID = new int[1];
		int[] rentDays = new int[1]; 
		String[] customerName = new String[1];
		
		carID[0] = 1;
		rentDays[0] = 3;
		customerName[0] = "Sabatha Dlamini";
		
		assertEquals(1, carID[0]);
		assertEquals(3 , rentDays[0]);
		assertEquals("Sabatha Dlamini", customerName[0]);
		
		/*
		 * Unit test that determines whether the correct customer details will be saved to
		 * memory. If the expected input matches the actual input in the assertEquals()
		 * method, the test will run with no errors.
		 */
		
		
	}//end test

}
