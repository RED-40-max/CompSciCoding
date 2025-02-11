/* Program: For Loops Problem Turn In 2021
    + prompt user for 2 numbers 
    + adds all numbers between thoses two numbers 
    + prints out the sum

 ex Example: if the user puts in a 3 and a 7 
 the sum will be calculated like: 3+4+5+6+7 
 so the answer would be 25. 

 */

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

    // First Number - set up scanner, prompt user, read, and record
        Scanner reader1 = new Scanner(System.in); // set up scanner
        System.out.println("Enter the lower number: "); // prompt user
        int IntialNum1 = reader1.nextInt(); //read next line and record 

    // Second Number - set up scanner, prompt user, read, and record the numbers         
        Scanner reader2 = new Scanner(System.in); // set up scanner
        System.out.println("Enter the higher number: "); // prompt user
        int Num2 = reader2.nextInt(); //read next line and record 

// for (Initlize var here ; test; update) 
 int RunningTotal = 0;       //initilized outside

 System.out.println("==========="); // Seperator - inputs and outputs

 /*for loop
        + Initlizes: makes the previously stored variable as the number in action 
        + Test: compares the number in action to the second, higher number to maybe terminate
                >=, Dosn't work since the lower number cannot be higher then the higher number 
                ==, Dosn't work since the For loop coniditon will not execute unless the two are equal to eachother 
                <=, works since the for loop works when it is neither equal nor lower, will terminate once they reach an equal number
                    this means that the sum will include the higher number in the running total 
                    (USE THIS): since it alines most with the example, 
                <, work since the loop will work when it is not lower, will terminate once they reach a higer number and 
                    will not include the higher number in the running total. 
            --Intrestingly, it always includes the 1st number in the Running Total
                0- this is becuse the for loop's first iter will be with the initilized value and the test loop 
                after that the loop uses incrimentations  
        + Update: the number increments to update the use number, both adding it to the running total and as a loop limiter 
*/
        for (int UseNum1 = IntialNum1 ; UseNum1 <= Num2; UseNum1++) {
            System.out.println(UseNum1); //prints out the number in action for this iter
            RunningTotal = RunningTotal + UseNum1; 
            // Running total is update to have previous running total plus the current number in action 
        }
        //after the loop runs, print this out 
        System.out.println("==========="); // Seperator
        System.out.println("The sum of numbers between " + IntialNum1 + " and " + Num2 ); //prints out statement
        System.out.println( RunningTotal); //prints out running total 
    }    

}
