package Inheretence;
/* Program: Inheritance #2 Turn In (the programming one)
        + subclass: studentSub from studentBase
            + class var: age -> array
            + class var: grade --> array 
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

public class StudentSub extends Student //extends from main class
{
    //sub-class variable 
    public static int[] Student_age = new int[5]; // makes the subclass variable age a array of variables to track easier 
    public static int[] Student_Grade = new int[5]; //makes the subclass variable age array of variables to track easier

    //to add the age and grade data
    public void EnterDataSub(int Student_Index)
    {
        System.out.println("enter Student age: "); 
        Student_age[Student_Index] = reader.nextInt(); //takes the OG student index so all arrays are paralell and inputs the age as that 
        reader.nextLine(); 

        System.out.println("enter student Grade: ");
        Student_Grade[Student_Index] = reader.nextInt(); //takes the OG student index so all arrays are paralell and inputs the grade as user input 
        reader.nextLine(); 
    }

    //to find all similar age or grade inputs and prints all out 

    public void PrintSameStudent()
    {
        //prompts choice 
        System.out.println("would you like to find same (1) Age or (2) Grade?"); 
        int Choice = reader.nextInt(); 
        reader.nextLine(); 

        int[] OperatingArray = new int[5]; //helps be flexiable with the array 
        String FindSameWord = ""; //helps be flexiable with prompting

        switch (Choice) {
        //if they want to find the same age
            case 1:
                FindSameWord = " Age ";
                OperatingArray = Student_age; //set the operating array to the age array 
                break;
        //if they want to find the same grades
            case 2:
                FindSameWord = " Grade ";
                OperatingArray = Student_Grade; //set the operating array to the 
                break;
        //otherwise they entered wrong
            default:
                System.out.println("error try again"); //ask to try again
                PrintSameStudent(); //recursive 
                break;
        }

        System.out.println(" Enter " + FindSameWord + "to filter students" ); //prompts user 
        int OperatingVar = reader.nextInt(); //reads the grade / ID or whatever we are looking for
        reader.nextLine(); 

        int FoundIndex = -1; //makes the variable to work with 

        //loop to find the index of the student's ID from input 

        System.out.println("Student's " + FindSameWord + OperatingVar); //prints out students __ age /grade
        System.out.println("----------------------------------------------"); //formatting 
        for(int x = 0; x < OperatingArray.length; x++ )
        {
            if(OperatingVar ==  OperatingArray[x] ) //if the ID given matches the 
            {
                FoundIndex = x; //record the int for handling purposes
                System.out.println(Student_name[x]); // print out ID and name associated with it 
            }
        }

        if(FoundIndex == -1)
        {
            System.out.println("no students" + FindSameWord + OperatingVar + " found" ); 
        }
    }

    
}
