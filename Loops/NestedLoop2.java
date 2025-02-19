/* Program: Nested Loops #2 Turn In 2021
    + nested loop
    + Program gathers 
        + NumInput -  user enters in any number 
        and your program should print out the pattern 
+++++++++
ex: 
        + user enters 4 
    program output: 
            #
            ?#
            ??#
            ???#
            ??#
            ?#
            #
+++++++++


 */

import java.util.Scanner;

public class NestedLoop2 {
    public static void main(String[] args){
// Number input - Setup, prompt, read, and record 
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter pattern max hight: "); 
        int NumInput = reader.nextInt();

//for loop, nested 

/* Nested for loop
    the outer loop - this controls the collum hight. 
        count = 0 //  initlize  - the count to 0 
        count < ((NumInput * 2) - 1) // twice the inputed number, minus one for the hight
        count++ //updates the variable 
        -- this loop means that the
    if cascade - if the count is over number input (the front bit)
        + for loop 
            int count2 = 0 // inilized the count 
            count2 < count // while the count of the outer one is bigger, 
            count2++ // update it 
    if cascade - otherwise (the back bit)
        + for loop 
            int count2 = 0 //initlized count 
            count2 < (((NumInput * 2 ) - 2) - count) // the count two is under two (for the overlap line), 
                as count increases, the overall equation of the compariosn to two will decrease and heads towards 
                count2 to become higher
            count2++ // updated count
 
 */

 //for loop 
            for (int count = 0; count < ((NumInput * 2) - 1); count++) { // Outer loop, hight 
    
                if (count < NumInput) {
                     // Increasing part
                    for (int count2 = 0; count2 < count; count2++) { // Inner loop
                        System.out.print("?");
                    }
                } else {
                     // Decreasing part
                    for (int count2 = 0; count2 < (NumInput * 2 - 2 - count); count2++) { // Inner loop
                        System.out.print("?");
                    }
                }
    
    
                System.out.println("#"); // Print "#" at the end of each row
            }
        }
}
