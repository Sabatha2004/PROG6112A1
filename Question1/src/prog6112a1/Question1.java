package prog6112a1;

import java.util.Scanner;
import static prog6112a1.Student.DeleteStudent;
import static prog6112a1.Student.ExitStudentApplication;
import static prog6112a1.Student.SaveStudent;
import static prog6112a1.Student.SearchStudent;
import static prog6112a1.Student.StudentReport;

public class Question1 {

    //universal scanner object that allows user input across all the methods in this class
    public static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        menuScreen();

    }// main

    public static void menuScreen() {

        System.out.println("""
                           STUDENT MANAGEMENT APPLICATION
                           ------------------------------------
                           Enter (1) to launch menu or any other key to exit""");

        int launchKey = kb.nextInt();

        switch (launchKey) {
            case 1 ->
                menuItems();
            default ->
                System.out.println("Thank you for using this program.");
        }//switch

    }//end method

    public static void menuItems() {

        System.out.println("""
                                  Please select one of the following menu items
                                                                      
                                  (1) Capture a new Student
                                  (2) Search for a student
                                  (3) Delete a student
                                  (4) Print student report
                                  (5) Exit Application""");

        int item = kb.nextInt();


            switch (item) {

                case 1 -> {
                    System.out.println("How many students would you like to capture?");
                    SaveStudent(); 
                }
                case 2 ->
                    SearchStudent();
                case 3 ->
                    DeleteStudent();
                case 4 ->
                    StudentReport();
                case 5 ->
                    ExitStudentApplication();

            }//end switch
      
    }//end method

}//class
