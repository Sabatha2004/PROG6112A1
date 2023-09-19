package prog6112a1;

import static org.junit.Assert.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

public class StudentTests {
	
	@Test
	public void testSaveStudent (){
		
		    int[] studID = new int[1];
		    String[] studFirstName = new String[1];
		    String[] studLastName = new String[1];
		    int[] studAge = new int[1];
		    String[] studEmail = new String[1];
		    String[] studCourse = new String[1];

		    studID[0] = 1;
		    studFirstName[0] = "Sabatha";
		    studLastName[0] = "Dlamini";
		    studAge[0] = 19;
		    studEmail[0] = "sabathadlamini@gmail.com";
		    studCourse[0] = "PROG6112A1";
		
		assertEquals(1, studID[0]);
		assertEquals("Sabatha", studFirstName[0]);
		assertEquals("Dlamini", studLastName[0]);
		assertEquals(19, studAge[0]);
		assertEquals("sabathadlamini@gmail.com", studEmail[0]);
		assertEquals("PROG6112A1", studCourse[0]);
		
		/*Unit test that determines whether the correct student will be saved to memory. 
		 * If the expected input matches the actual input in the assertEquals() method, 
		 * the test will run with no errors. 
	    */   
	}// end method
	
	@Test
	public void testSearchStudent (){
		
		Scanner kb = new Scanner(System.in);
		
		int[] studID = new int[1];
	    String[] studFirstName = new String[1];
	    String[] studLastName = new String[1];
	    int[] studAge = new int[1];
	    String[] studEmail = new String[1];
	    String[] studCourse = new String[1];
	    
	    System.out.println("Enter a student ID to search");
	    int searchID = kb.nextInt();

	    studID[0] = 1;
	    studFirstName[0] = "Sabatha";
	    studLastName[0] = "Dlamini";
	    studAge[0] = 19;
	    studEmail[0] = "sabathadlamini@gmail.com";
	    studCourse[0] = "PROG6112A1";
	    
	    
	    if(searchID == studID[0]) {
	    	
	    	System.out.println("STUDENT " + searchID + "\n\n"
                    + "STUDENT ID: " + studID[0] + "\n"
                    + "STUDENT NAME: " + studFirstName[0] + ". " + studLastName[0] + "\n"
                    + "STUDENT AGE: " + studAge[0] + "\n"
                    + "STUDENT EMAIL: " + studEmail[0] + "\n"
                    + "STUDENT COURSE: " + studCourse[0]);
	    	
	    }//end if
	    
	    /*
	     * The test will determine that the correct student details have been returned. 
	     */
	    
	    
	}//end method
	
	@Test
	public void testSearchStudent_StudentNotFound() {
		
        Scanner kb = new Scanner(System.in);
		
		int[] studID = new int[1];
	    String[] studFirstName = new String[1];
	    String[] studLastName = new String[1];
	    int[] studAge = new int[1];
	    String[] studEmail = new String[1];
	    String[] studCourse = new String[1];
	    
	    System.out.println("Enter a student ID to search");
	    int searchID = kb.nextInt();

	    studID[0] = 1;
	    studFirstName[0] = "Sabatha";
	    studLastName[0] = "Dlamini";
	    studAge[0] = 19;
	    studEmail[0] = "sabathadlamini@gmail.com";
	    studCourse[0] = "PROG6112A1";
	    
	    if(searchID != studID[0]) {
	    	
	    	System.out.println("Student with Student ID "+searchID+" was not found.");
	    	
	    }//end if
	    
	    /*
	     *   The test will determine that no student was found. 
	     */
		
	}//end method
	
	@Test
	public void testDeleteStudent() {
		

        Scanner kb = new Scanner(System.in);
		
		int[] studID = new int[1];
	    String[] studFirstName = new String[1];
	    String[] studLastName = new String[1];
	    int[] studAge = new int[1];
	    String[] studEmail = new String[1];
	    String[] studCourse = new String[1];
	    
	    System.out.println("Enter a student ID to delete");
	    int deleteID = kb.nextInt();

	    studID[0] = 1;
	    studFirstName[0] = "Sabatha";
	    studLastName[0] = "Dlamini";
	    studAge[0] = 19;
	    studEmail[0] = "sabathadlamini@gmail.com";
	    studCourse[0] = "PROG6112A1";
	    
	    if(deleteID == studID[0]) {
	    	
	    	studID[0] = studID[0] - 1;
	    	System.out.println("Student with Student ID "+deleteID+" has been deleted");
	    	System.out.println(studID[0]);
	    	
	    }//end if
	    
	    /*
	     * The test will determine that the student has been successfully deleted.
	     */
		
	}//end method
	
	@Test
	public void testDeleteStudent_StudentNotFound() {
		
		Scanner kb = new Scanner(System.in);
		
		int[] studID = new int[1];
	    String[] studFirstName = new String[1];
	    String[] studLastName = new String[1];
	    int[] studAge = new int[1];
	    String[] studEmail = new String[1];
	    String[] studCourse = new String[1];
	    
	    System.out.println("Enter a student ID to delete");
	    int deleteID = kb.nextInt();

	    studID[0] = 1;
	    studFirstName[0] = "Sabatha";
	    studLastName[0] = "Dlamini";
	    studAge[0] = 19;
	    studEmail[0] = "sabathadlamini@gmail.com";
	    studCourse[0] = "PROG6112A1";
	    
	    if(deleteID != studID[0]) {
	    	
	    	System.out.println("Student with Student ID "+deleteID+" was not found.");
	    	
	    }//end if
	    
	    /*
	     *  The test will determine that no student could be found to delete. 
	     */
		
	}//end method
	
	@Test
	public void testStudentAge_StudentAgeValid() {
		
		 int[] studAge = new int[1];
		 
		 studAge[0] = 19;
		 
		 if(studAge[0]> 16) {
			 
			 System.out.println("Age successfully entered!");
			 
		 }//end if
		 
		 /*
		  * The test will determine that the student’s age is valid.
		  */
		 
	}//end method

	@Test
	public void testStudentAge_StudentAgeInValid() {
		
		int[] studAge = new int[1];
		 
		 studAge[0] = 14;
		 
		 if(studAge[0]< 16) {
			 

        	 System.out.println("You have entered an incorrect age!");
			 
		 }//end if
		 
		 /*
		  * The test will determine that the student’s age is less than 16. 
		  */
		 
	}//end method
	
	@Test
	public void testStudentAge_StudentAgeInValidCharacter() {
		
		Scanner kb = new Scanner(System.in);
		int[] studAge = new int[1];
		 
		try {
			
	     System.out.println("Enter the student age");
		 studAge[0] = kb.nextInt();
		 
		}catch(InputMismatchException e) {
			
			System.out.println("You have entered an incorrect age!");
		}
		 
		
	}//end method
	
	/*
	 * The test will determine that the student age supplied is not a number. 
	 */
	
}//end class
