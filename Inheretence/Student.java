package Inheretence;
/* Program: Inheritance #2 Turn In (the programming one)
        + base class: studentBase
            + class var: student name --> array?
            + class var: ID --> array? 
            + EnterData(): input name and ID 
            + PrintName(): takes ID as input and finds name --> use paralell arrays
        + subclass: studentSub from studentBase
            + class var: age
            + class var: grade 
            + EnterDataSub(): allows user to input student age and grade
                + same ID and name from studentBase
            + PrintSameStudent(): takes age or grade as input and finds similar student
        + main 
            + enter / read info for 5 students 
            + enter student ID to search 
                + use PrintName() method
            + print out all who are in same grade / same age 
                + use PrintSameStudent() method

 */
import java.util.Scanner; 

public class Student {
    //class variables 
    public static String[] Student_name = new String[5]; //initlizes a class variables so all student names are acessable to the instnaces
    public static int[] Student_ID = new int[5]; // initlizes a class variable of integers so all student ID are acessiable to the instances for the method

    //imports a scanner once as a class variable so i don't have to keep initlizing it to use it 
    public static Scanner reader = new Scanner(System.in); 

    //class for inputting ID and finding name
    public void EnterData(int Student_Index) //makes it send an index so that i can have the loop in main be the same and just send it over to simplify the index issue
    {
        System.out.println("Enter the Student's name"); //prompts
        Student_name [Student_Index] = reader.next(); //reads in the student's name 

        System.out.println("Enter the Student's ID"); //prompts 
        Student_ID[Student_Index] = reader.nextInt(); //reads in the student's ID 
        reader.nextLine(); 
        

    }

    //printing name based on the data 
    public void PrintName() 
    {
        //prompts user
        System.out.println("Enter Student ID: "); 
        int StudentIDSearch = reader.nextInt(); 
        reader.nextLine(); 

        int FoundIndex = -1; //makes the variable to work with 

        //loop to find the index of the student's ID from input 
        for(int x = 0; x < Student_ID.length; x++ )
        {
            if(StudentIDSearch ==  Student_ID[x] ) //if the ID given matches the 
            {
                FoundIndex = x; //record the int for handling purposes
                System.out.println("Name from ID #" + StudentIDSearch + " is " + Student_name[x]); // print out ID and name associated with it
                break; //break out of the loop 
            }
        }

        //if it's gone thorught the loop and not found a match, the int will not change
        if(FoundIndex == -1)
        {
            System.out.println("ID #" + StudentIDSearch + " not found within system. try again"); 
            PrintName(); //allows them to try again
        }
        

    }

    
}
