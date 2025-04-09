/* Program: Array Lists 
    + enter numbers 

    + print out list 
    + print out list size 

    + remove all 2's 

    + print new list 
    + print size of new list 


 */

import java.util.ArrayList; //for array lists
import java.util.Iterator;
import java.util.Scanner; 


public class TwoHater {

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in); //imports readers

        int ProgramCanRun = 0; //to make the overall program loop and run


        ArrayList <Integer> TheNumberList = new ArrayList();   //make a number list  - intally, also sets it blank
        ArrayList <Integer> TwoHaterList = new ArrayList(); //makes a duplicate that will be later used for other things 

        while(ProgramCanRun != 1)
        { //to make overall program loop 
           TheNumberList = new ArrayList();   //make a number list - sets it up each time, so it blank
           TwoHaterList = new ArrayList(); // same here, blank it up
        
            System.out.println("Input a number to continue or 1 to exit");  //prompts user

             ProgramCanRun = reader.nextInt(); //reads users input

            if (ProgramCanRun == 1) //if it is one, then exit the program 
            {
                ProgramCanRun = 1;
                System.out.print("exiting program "); 
                break; 
            }

        int EnterNum = 0; //for entering numbers 

        while(EnterNum != 1) //for control over actions
        {
            System.out.println("Input a number to continue or 1 to calculate"); 
            //controls 
            EnterNum = reader.nextInt(); //record the input number 
            if (EnterNum == 1)
            {
                EnterNum = 1;
                System.out.print("exiting program "); 
                break; 
            }

            //enter number
            System.out.println("enter a number to add to the list"); //prompts 
            int OpNum = reader.nextInt(); //records the number 

            TheNumberList.add(OpNum); // adds the number to the List 
        }

        //print out list and list size
        System.out.println("-------------------------------------------------"); 
        System.out.println("List of Numbers: "); 
            //cycles throught and prints them out with a loop iterator thing from the list array method
            Iterator<Integer> ListLooper = TheNumberList.iterator();
            //this sets up the iterator so that i can print as many as there are int the list

            while(ListLooper.hasNext())  //while there is still some stuff in the list, 
            {
                System.out.print( ListLooper.next() + ", "); //print otu the number 
                //.next kind of like file I/O and takes the next value to print it out 
            }

        System.out.println(" "); 
        System.out.println("Size of List: " + TheNumberList.size()); //calls the method that finds the size and prints it out
        System.out.println(" "); 
        System.out.println("---------------WE HATE 2's, REMOVE THEM!---------------------------"); 
        //with the TwoHaterList 
            TwoHaterList = TheNumberList; //sets the two hater as a new list so that we can operate on this one 
            //without distirbing the OG list 

        Iterator<Integer> RemoveLooper = TwoHaterList.iterator(); //makes a new one becuse the old one is exhausted

        //removes two 
        while(RemoveLooper.hasNext())  //while there is still some stuff in the list, 

            if(RemoveLooper.next() == 2) // if the number is two 
            {
                RemoveLooper.remove(); //then removes it with the iterator
            }
       

        //prints updated list - same code since we changed the array 
        System.out.println("List of Numbers: "); 
        Iterator<Integer> PrintAfter = TwoHaterList.iterator(); //makes a new one becuse 

        while(PrintAfter.hasNext())  //while there is still some stuff in the list, 
        {
            System.out.print( PrintAfter.next() + ", "); //print otu the number 
            //.next kind of like file I/O and takes the next value to print it out 
        }
        System.out.println(" "); 
        System.out.println("Size of List: " + TwoHaterList.size()); //size of the one with twos removed 

        //resets list 
        System.out.println(" "); 
        System.out.println("---------------Resetting List---------------------------"); 
        
        }

        } 


    }
