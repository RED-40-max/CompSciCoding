package Inheretence;
/* Program: Inheritance #2 Turn In (the programming one)
        + main 
            + enter / read info for 5 students 
            + enter student ID to search 
                + use PrintName() method
            + print out all who are in same grade / same age 
                + use PrintSameStudent() method

 */
import java.util.Scanner; 

public class StudentMain 
{

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in); //reading helper 

        StudentSub[] ObjectArray = new StudentSub[5]; //makes 5 objects into an array 
        //since StudentSub is a class, i use it to make 5 blank spaces for instances and put it in an array 
        //i call the array ObjectArray
        //loop for filling the array so i don't get an error lol 
        for(int x = 0; x < ObjectArray.length; x++) // makes a loop 
        {
            ObjectArray[x] = new StudentSub(); //this creates a new isntance for every x 
            //it also allots it to the array and therby initilizes a object within the array 
        }
        
        //for entering data and reading data for each of the 5 students 
        for(int x = 0; x < ObjectArray.length; x++)
        {
            ObjectArray[x].EnterData(x); //calls the object from the array of the xth position to operate on 
            //then it calls the method to enter data from that specific object
            //this method specifically is called from the Super class behaviors of this instance 

            ObjectArray[x].EnterDataSub(x); //calls the object from the array of the xth position to operate on 
            //method is called from sub class behaviors of this instance. 
           

        }

        int PortalOpen = 1; 

        while(PortalOpen == 1) //loop to help streamline the code
        {
            System.out.println("press 0 to exit the portal or any other number to proceed"); 
            int UsrChoice = reader.nextInt(); // records 
            reader.nextLine(); 

            if(UsrChoice == 0) //if they want to exit 
            {
                PortalOpen = 0; 
                break; 
            }
            System.out.println("press 1 for entering student ID to search or 2 for finding similar students"); 
            int SearchChoice = reader.nextInt(); // records 
            reader.nextLine(); 

            switch(SearchChoice)
            {
                case 1: 
                    ObjectArray[1].PrintName();//takes a random object since all the class variables are linked and prints out 
                    //then finds the ID  
                    break;
                case 2: 
                    ObjectArray[1].PrintSameStudent(); //takes a random object since all the class variables are linked and prints out 
                    // calls the method for the print same student
                    break;

                default: 
                    System.out.println("Error, what have you done?"); 
                    break;
            }




        }

        
       
    }
    
}
