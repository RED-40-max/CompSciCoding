/* (NOT FINISHED, NOT REQIRED - SUSTAINED) Program: question 2, If statements assignment 
    + prompt user to enter 3 numbers 
    + print out numbers in order of smallest to largest 
    + Avarage the numbers 
Test with: 
    + any 3 numbers
    + 2 numbers that are the same
    + 3 numbers that are the same
 */

import java.util.Scanner;

public class If_state3 {
    public static void main(String[] args){
//Reading and storing values         
    //First Value reading, prompting, recording 
        Scanner FirstReader = new Scanner(System.in); //Reader initlized
        System.out.println("enter the first value: "); //prompt user
        float FirstValue = FirstReader.nextFloat(); //store the first value from the input of next line 

    //Seond Value reading, prompting, recording 
        Scanner SecondReader = new Scanner(System.in);
        System.out.println("enter the first value: ");
        float SecondValue = SecondReader.nextFloat();    

    //Third Value reading, prompting, recording 
        Scanner ThirdReader = new Scanner(System.in);
        System.out.println("enter the first value: ");
        float ThirdValue = ThirdReader.nextFloat();   
    
    }
}
