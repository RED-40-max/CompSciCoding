/* Program: Interface #1 turn in 

THIS IS THE MAIN STRING DOCUMENT
    + use public interface PhoneBook{}
    + read in list of names and phone number from file
    + look up name and print out phone number or vice versa
    + file I/O 
    + 5 things in the file 
    + Numbers need to be strings
 
public interface PhoneBook 
{
    public void ReadInfo();
    public String FindNumber(String name);
    public String FindName(String phonenumber);
}

 */

import java.util.Scanner; 

public class WhoseCalling
{

    public static void main(String[] args)
    {
        //makes the instance 
        OneFile ThisInstance = new OneFile(); 
        ThisInstance.ReadInfo();

        Scanner reader = new Scanner(System.in); // sets up the reader 
        boolean ProgramOpean = true; 

        while(ProgramOpean)
        {
            System.out.println("what would you like to look up (1 - Name) or (2 - Number) or 0 to exit"); //prompts user
            int choice = reader.nextInt(); //reads in the choice 
            reader.nextLine(); //make sure no input error

            if(choice == 1) //if user wants to find the name of a number 
            {
                System.out.print("enter the name "); //prompts user to enter the data name / number 
                String InputData = reader.nextLine(); //records the input data to operate on 
                 //impliments the FindNumber method by sending in the data
                String number =  ThisInstance.FindNumber(InputData.trim()); 
                 System.out.println("Number: " + number); //writes out the number 

            } else if (choice == 2) //if user wants to find Number of a name 
            {
                System.out.print("enter the number: "); //prompts user to enter the data name / number 
                String InputData = reader.nextLine(); //records the input data to operate on 
                 //impliments the FindName method by sending in the data
                 String Name = ThisInstance.FindName(InputData.trim()); 
                 System.out.println("Name: " + Name); 

            } else if (choice == 0 ) //if user wants to leave
            {
                 ProgramOpean = false; //makes the thing to false 
                 break; //breaks out of it 

            } else 
            {
                System.out.println("Error wrong input"); 
            }
        }
        reader.close(); 
    }


    
}
 