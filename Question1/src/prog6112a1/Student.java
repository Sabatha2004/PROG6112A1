package prog6112a1;

import java.util.Scanner;

public class Student {

    //universal scanner object that allows user input across all the methods in this class
    public static final Scanner kb = new Scanner(System.in);
    // prompts user for the number of students they'd like to captured
    final static int NUM_OF_STUDENTS = kb.nextInt();
    // declaration of array named "studentID" that stores student IDs
    public static int[] studID = new int[NUM_OF_STUDENTS];
    // declaration of array named "studFirstName" that stores first names
    public static String[] studFirstName = new String[NUM_OF_STUDENTS];
    // declaration of array named "studLastName" that stores last names
    public static String[] studLastName = new String[NUM_OF_STUDENTS];
    // declaration of array named "studentAge" that stores student ages
    public static int[] studAge = new int[NUM_OF_STUDENTS];
    // declaration of array named "studentEmail" that stores student emails
    public static String[] studEmail = new String[NUM_OF_STUDENTS];
    // declaration of array named "studentCourse" that stores student courses
    public static String[] studCourse = new String[NUM_OF_STUDENTS];

    public static void SaveStudent() {

        // for loop's iterations depend on the number of students the user enters
        for (int i = 0; i < NUM_OF_STUDENTS; i++) {
               	
            	// prompt that allows user to store student IDs
                System.out.println("Enter the student's ID>>");
                studID[i] = kb.nextInt();
            	
          
            System.out.println("ID successfully captured!");

            // prompt that allows user to store students' first names
            System.out.println("Enter the student's first name>>");
            studFirstName[i] = kb.next();

            while (!Character.isUpperCase(studFirstName[i].charAt(0))) {

                System.out.println("""
                                          Please make sure your last name begins with a capital letter
                                                                         
                                          Re-enter the student's first name>>""");

                studFirstName[i] = kb.next();
            }
            
            System.out.println("First Name successfully captured!");

            // prompt that allows user to store students' last names
            System.out.println("Enter the student's last name>>");
            studLastName[i] = kb.next();

            while (!Character.isUpperCase(studLastName[i].charAt(0))) {

                System.out.println("""
                                             Please make sure your last name begins with a capital letter
                                                                         
                                             Re-enter the student's last name>>""");

                studLastName[i] = kb.next();
            }
            
            System.out.println("Last Name successfully captured!");

            /*
            charAt() method gets the first character of the firstName/lastName and passes it to the isUpperCase() method
            of the "Character" class.
            If the first character is upper case, the isUpperCase() method returns true, and the user can proceed to enter
            the last name. Or a message indicating that the firstName/lastName does not start with a capital letter
            
             */
            
            // prompt that allows user to store students' age
            System.out.println("Enter the student's age>>");
            studAge[i] = kb.nextInt();
            
            /*
             * while the user enters an age under 16, the user will be reprompted
             */
            while(studAge[i] < 16) {
            	
            	 System.out.println("You have entered an incorrect age!");
            	 System.out.println("Re-enter the student's age>>");
                 studAge[i] = kb.nextInt();
                 
            }
            
            System.out.println("Age successfully entered!");

            // prompt that allows user to store students' email
            System.out.println("Enter the student's email>>");
            studEmail[i] = kb.next();

            //while the student email does not meet the following conditions, the user will be reprompted until they are met
            while (!studEmail[i].matches(".*[@].*") || studEmail[i].matches(".*[A-Z].*")) {

                System.out.println("""
                                      Make sure email contains the '@' character, as well as no capital letters
                                                                      
                                      Re-enter the student's email>>""");
                studEmail[i] = kb.next();
            }

            System.out.println("Email successfully captured!");

            // prompt that allows user to store students' courses
            System.out.println("Enter the student's course>>");
            studCourse[i] = kb.next();
            
            System.out.println("Course successfully captured!");

        }

      //calling menuItems() method so the user gets redirected back to the menu
        Question1.menuItems();

    }

    public static void SearchStudent() {

        //declarations
        int storedStudents = NUM_OF_STUDENTS;
        int[] storedID = studID;
        String[] storedFirstName = studFirstName;
        String[] storedLastName = studLastName;
        int[] storedAge = studAge;
        String[] storedEmail = studEmail;
        String[] storedCourse = studCourse;
        
        System.out.println("Enter the student ID to search>>");
        int searchID = kb.nextInt();
       
        //for loop's iterations depend on the number of students the user enters
        for (int i = 0; i < storedStudents; i++) {
        	
        	 
        	/*
        	 * try-catch block that redirects user to main menu if the task they are search for is not found
        	 */
            try {
            	
            	System.out.println("Student with Student ID "+searchID+" was not found.");
      
            }catch(NullPointerException e) {
            	
            	
            	break;
            	
            }
        	

            /*if the ID typed in by the user matches any ID stored in the "studID" array, 
            the program will display the appropriate student report
             */
            if (searchID == storedID[i]) {

                //charAt() method extracts the first letter of the first name
                char firstLetter = storedFirstName[i].charAt(0);

                //message displaying student report
                System.out.println("STUDENT " + (i + 1) + "\n\n"
                        + "STUDENT ID: " + storedID[i] + "\n"
                        + "STUDENT NAME: " + firstLetter + ". " + storedLastName[i] + "\n"
                        + "STUDENT AGE: " + storedAge[i] + "\n"
                        + "STUDENT EMAIL: " + storedEmail[i] + "\n"
                        + "STUDENT COURSE: " + storedCourse[i]);

            }//end if
        }//end for
        
      //calling menuItems() method so the user gets redirected back to the menu
        Question1.menuItems();

    }//end method

    public static void DeleteStudent() {

        //declarations
        int storedStudents = NUM_OF_STUDENTS;
 
        System.out.println("Enter the student ID to delete>>");
        int deleteID = kb.nextInt();
       
        //for loop's iterations depend on the number of students the user enters
        for (int i = 0; i < storedStudents; i++) {
        	
        	/*
        	 * try-catch block that redirects user to main menu if the task they want deleted is not found
        	 */
            try {
            	
            	System.out.println("Student with Student ID "+deleteID+" was not found.");
            	
      
            }catch(NullPointerException e) {
            	
            	
            	break;
            	
            }

            /*if the ID typed in by the user matches any ID stored in the "studID" array, 
            the program will prompt the user one more time for assurance.
             */
            
           if(deleteID == studID[i]) {
        	   
        	   System.out.println("Are you sure you want to delete student "+deleteID+ " from the system?");
               System.out.println("(Y) to delete, (N) to go back to main menu>>");
               String option = kb.next();

        	   
            if(option.equals("N")) {
            	
            	break;
        	   
            }//end if 
            
            if  (option.equals("Y")) {

            	studID[i] = studID[i] - 1;
                System.out.println("Student with Student ID: " + deleteID + " has been deleted.");

             }//end if
            
           }//end if 
           
        }//end for
        
      //calling menuItems() method so the user gets redirected back to the menu
        Question1.menuItems();


    }

    public static void StudentReport() {

        //declarations
        int storedStudents = NUM_OF_STUDENTS;
        int[] storedID = studID;
        String[] storedFirstName = studFirstName;
        String[] storedLastName = studLastName;
        int[] storedAge = studAge;
        String[] storedEmail = studEmail;
        String[] storedCourse = studCourse;
        

        //for loop's iterations depend on the number of students the user enters
        for (int i = 0; i < storedStudents; i++) {
        	
        	  
            
            //charAt() method extracts the first letter of the first name
            char firstLetter = storedFirstName[i].charAt(0);

            //message displaying student report
            System.out.println("STUDENT " + (i + 1) + "\n\n"
                    + "STUDENT ID: " + storedID[i] + "\n"
                    + "STUDENT NAME: " + firstLetter + ". " + storedLastName[i] + "\n"
                    + "STUDENT AGE: " + storedAge[i] + "\n"
                    + "STUDENT EMAIL: " + storedEmail[i] + "\n"
                    + "STUDENT COURSE: " + storedCourse[i]);

        }//end for
        
        //calling menuItems() method so the user gets redirected back to the menu
        Question1.menuItems();

    }//end method

    public static void ExitStudentApplication() {

        System.out.println("Thank you for using this program.");
    }

}
