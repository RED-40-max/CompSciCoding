/* Program: Nested Loops #3 Turn In 2021
    + Use nested loops to print out a multiplication table. 
    + Your results should look like this.

---+---------------------------------
| 1 2 3 4 5 6 7 8 9 10 11 12
----+---------------------------------
1 | 1 2 3 4 5 6 7 8 9 10 11 12
2 | 2 4 6 8 10 12 14 16 18 20 22 24
3 | 3 6 9 12 15 18 21 24 27 30 33 36
4 | 4 8 12 16 20 24 28 32 36 40 44 48
5 | 5 10 15 20 25 30 35 40 45 50 55 60
6 | 6 12 18 24 30 36 42 48 54 60 66 72
7 | 7 14 21 28 35 42 49 56 63 70 77 84
8 | 8 16 24 32 40 48 56 64 72 80 88 96
9 | 9 18 27 36 45 54 63 72 81 90 99 108
10 | 10 20 30 40 50 60 70 80 90 100 110 120
11 | 11 22 33 44 55 66 77 88 99 110 121 132
12 | 12 24 36 48 60 72 84 96 108 120 132 144

 */

import java.util.Scanner;

public class NestedLoop3 {
    public static void main(String [] args){
//Set up, prompt, read, and store. 
        Scanner reader = new Scanner(System.in); //Scanner set up 
        System.out.println("How many tables: "); // prompts user
        int MaxNum = reader.nextInt(); // reads and stores users next line

//format loop 
        for (int CollumNum = 1; CollumNum <= MaxNum; CollumNum++) { // for each number between 1 and MaxNum, it prints all the numbers
            System.out.print(CollumNum + " "); // enters the number each time 
        }

        System.out.println(); // enters so the next line can be there for next formating 

        for (int DashPoint = 1; DashPoint <= MaxNum; DashPoint++) { // for each number between 1 and MaxNum, it prints a dash for format
            System.out.print("------"); 
        }

        System.out.println(); // enters so the next line can be there for next formating 

//nested for loops 
        /* 
            outer - sets the row and cycles from 1 to the max number 
                int RowNumber = 1 // to one so that it can 
                RowNumber <= MaxNum // for the numbers up to the max number 
                RowNumber++ // updates it

            inner - 
                int CollumNum = 1 // sets it as one 
                (CollumNum <= MaxNum) // cycles throught until it hits the max number 
                CollumNum++ // updates 
    
                     System.out.print(CollumNum * RowNumber + " ") // products the number and leves a space 

         */

        for (int RowNumber = 1; (RowNumber <= MaxNum); RowNumber++){
            System.out.print(RowNumber + " | "); // Print row number

            for(int CollumNum = 1; (CollumNum <= MaxNum); CollumNum++){
                System.out.print(CollumNum * RowNumber + " "); // makes a product of the collum number and the row number 

            }

            System.out.println(); // enters for formatting 
        }

    }
    
}
