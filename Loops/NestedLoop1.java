/* Program: Nested Loops #1 Turn In 2021
    + nested loop
    + Program gathers 
        + NumInput -  user enters in any number 
        and your program should print out the pattern 
+++++++++
ex: 
        + user enters 8 
    program output: 
        *######*
        *######*
        *######*
        *######*
        *######*
        *######*
        *######*    
        *######*  
+++++++++

 */

import java.util.Scanner; 

public class NestedLoop1 {
    public static void main(String[] args){
// Number input - Setup, prompt, read, and record 
        Scanner reader = new Scanner(System.in); 
        System.out.println(" Enter a number for the pattern: "); 
        int NumInput = reader.nextInt(); 
//for loop 

/* Nested for loop
    the outer loop - this controls the collum hight. 
        count = 0 //  initlize  - the count to 0 
        count < NumInput // this is comparing the count to the number inputed 
        count++ //updates the variable 
        -- this loop stops when the count is equal to the number input
        meaning that the hight of the collum will be the input number 
    the inner loop - controls the width 
        count2 = 0 // initlized the count to 0, each time - so when 
            the inner loop terminates, it will go to the outer loop and 
            re-initalize the inner loop. 
        count2 < 4 // prints out 4 of the charecter for the widh
        count2++ -- updates count 
 
        

             ****** for( int count = 0; count < NumInput; count++ )*****
            *                                                           *
            *       System.out.print("*");                              * 
            *                                                           * 
            *   ***for( int count2 = 0 ; count2 < 4 ; count2++)***      *                                                   * 
            *   *                                                *      * 
            *   *  System.out.print("#")                         *      * 
            *   *                                                *      * 
            *   **************************************************      * 
            *    System.out.println("*");                               * 
            *                                                           * 
            *************************************************************

            for( int count2 = 0 ; count2 < 4 ; count2++){ //the inner loop controls the width of each row 
                System.out.print("#"); // countintually prints the charecter for the width

            }
            System.out.println("*"); //ends with the new charecter and sets so next input is on new line
        }



 
 */
        for( int count = 0; count < NumInput; count++ ){ //the outer loop controls down / hight / collum 

            System.out.print("*"); // prints out the first charecter

            for( int count2 = 0 ; count2 < 5 ; count2++){ //the inner loop controls the width of each row 
                System.out.print("#"); // countintually prints the charecter for the width

            }
            System.out.println("*"); //ends with the new charecter and sets so next input is on new line
        }


    }
    
}
