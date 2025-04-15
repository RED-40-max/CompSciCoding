

import java.util.Scanner;

public class LockedMain 
{
    public static void main(String[] args)
    {
        TheLock ThisInstance = new TheLock(); //makes a new instance of the class

        Scanner reader = new Scanner(System.in); // sets up the reader 
        boolean ProgramOpean = true; 

        while(ProgramOpean)
        {
            System.out.println("Enter 0 to leave or anything else to proceed"); 
            int Input = reader.nextInt(); 

            if (Input == 0 ) //if user wants to leave
            {
                 ProgramOpean = false; //makes the thing to false 
                 break; //breaks out of it 

            } 

            ThisInstance.AskUsersetcombo(); //asks user to set the combo 
            ThisInstance.CheckGuess(); //asks user to check guess        



        }
        
    }

    
}
