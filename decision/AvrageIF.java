
/* program: question 2, If statements assignment 
    + prompt user to enter 3 numbers 
    + print out numbers in order of smallest to largest 
    + Average the numbers 
Test with: 
    + any 3 numbers
    + 2 numbers that are the same
    + 3 numbers that are the same
 */

import java.util.Scanner;

public class AvrageIF {
    public static void main(String[] args){
//Reading and storing values         
    //First Value reading, prompting, recording 
        Scanner FirstReader = new Scanner(System.in); //Reader initlized
        System.out.println("enter the first value: "); //prompt user
        float FirstValue = FirstReader.nextFloat(); //store the first value from the input of next line 

    //Seond Value reading, prompting, recording 
        Scanner SecondReader = new Scanner(System.in);
        System.out.println("enter the second value: ");
        float SecondValue = SecondReader.nextFloat();    

    //Third Value reading, prompting, recording 
        Scanner ThirdReader = new Scanner(System.in);
        System.out.println("enter the third value: ");
        float ThirdValue = ThirdReader.nextFloat();   

//doing the math 
        float AverageVal = (FirstValue + SecondValue + ThirdValue) / 3; // finding the average of 3 numbers 

/* If cascade - 9 FREAKING PERMUTATIONS. there is probably a more efficent way to do this, but 
this is an practice in IF statements so whatever 
A) 1 > 2 > 3 
B) 1 > 3 > 2
C) 2 > 1 > 3 
D) 2 > 3 > 1 
E) 3 > 2 > 1
F) 3 > 1 > 2

++ add >= instead of > for handeling things that are equal number 
*/

//initalize largest and smallest variables so that it dosn't error out in the system print later
        float LargestNum = 1; 
        float SmallestNum = 0; 
       
// 1 is biggest 
        if ((FirstValue >= SecondValue) && (SecondValue >= ThirdValue)) { // if A) 1 > 2 > 3 
            LargestNum = FirstValue; // 1 is biggest
            SmallestNum = ThirdValue; // 3 is smallest

        } else if ((FirstValue >= ThirdValue) && (ThirdValue >= SecondValue)) { // if B) 1 > 3 > 2
            LargestNum = FirstValue; // 1 is biggest
            SmallestNum = SecondValue; // 2 is smallest 

// 2 is biggest 
        } else if ((SecondValue >= FirstValue) && (FirstValue >= ThirdValue)) { // if C) 2 > 1 > 3 
            LargestNum = SecondValue; // 2 is bigest 
            SmallestNum = ThirdValue;// 3 is smallest

        } else if ((SecondValue >= ThirdValue) && (ThirdValue >= FirstValue)) { // if D) 2 > 3 > 1 
            LargestNum = SecondValue; // 2 is bigest
            SmallestNum = FirstValue; // 1 ist smallest

//3 is biggest 
        } else if ((ThirdValue >= FirstValue) && (FirstValue >= SecondValue)) { // if E) 3 > 2 > 1
            LargestNum = ThirdValue; // 3 is biggest
            SmallestNum = SecondValue; // 2 is smallest 

        } else { // if F) 3 > 1 > 2 
            LargestNum = ThirdValue; // 3 is biggest
            SmallestNum = FirstValue; // 2 is smallest 
        }

//Printing it out 

     System.out.println("Largest Number: " + LargestNum); // Prints Largest Number 
     System.out.println("Smallest Number: " + SmallestNum); //Prints smallest Number 
     System.out.println("Average of numbers: " + AverageVal);

    }
}

//The alternative ways to sort it out

/* 
//    + using '.Math' a 'max()' and 'min()' only returns out of two numbers 
float largest = Math.max(FirstValue, Math.max(SecondValue, ThirdValue)); // would sort like this 1 ?> (2 >? 3)
float smallest = Math.min(FirstValue, Math.max(SecondValue, ThirdValue); // same here but assigns a min instead 1 ?> (2 >? 3)
*/
 
/* 
//   +storing it into a list / array then sorting it and returning 1st and last value 
    [FIND OUT LATER HOW TO DO THIS, IM LAZY, but it seems like a good way]

*/
 