/* Program: array Lists 2014
    + app that reads a set of value 
    + range of 1 to 100 
        + error check 
    + print chart that arr[x]
        + 1-10  -> arr[0]
        + 11-20  -> arr[1]
        + 21-30  -> arr[2]
        + 31-40  -> arr[3]
        + 41-50  -> arr[4]
        + 51-60  -> arr[5]
        + 61-70  -> arr[6]
        + 71-80  -> arr[7]
        + 81-90  -> arr[8]
        + 91-100  -> arr[9]

    + one astrick for each value entered 
    + loop it for the methods 
    + update graphic 


    for some reason i need to compile this manually in the terminal when it comes to VS CODE so that the array can run without the error
*/

import java.util.ArrayList; // so i can use array lists
import java.util.Iterator;  // for looping thorught the list 
import java.util.Scanner;   // scanning things in

public class HistoArray {

    public static void main(String[] args) {
        // initialize scanner, array for counts, and number array
        Scanner reader = new Scanner(System.in); // for the scanner 
        int[] ListCount = new int[10]; // an array for the counts 
        ArrayList<Integer> NumberArray = new ArrayList<>(); // makes a new ArrayList

        int input = 0; // initlize variable and set it so while loop can run 

        while(input != 1) { // find a better way to do this - when user enters 1, it exits completely, otherwise it proceeds
            System.out.println("Enter 1 to exit program, or anything else to proceed"); 
            input = reader.nextInt();  

            // checks if it is one
            if(input == 1) { // exits out of the system after you have entered one 
                System.out.println("you have now exited");  
                break; 
            }
                
            // allows you to input one number at a time 
            System.out.println("Enter an integer between 1-100 (inclusive): ");
            int nextNumber = reader.nextInt();
            
            // error check for range of 1 to 100
            if(nextNumber < 1 || nextNumber > 100) { 
                System.out.println("Error, you have entered a number beyond the parameters (1-100 inclusive). Try again.");
                continue; // skip processing this number if invalid
            }
            
            NumberArray.add(nextNumber); // puts number in the array
            
            // calculates the numbers in the array 
            // first clear the array (reset counts)
            for(int x = 0; x < ListCount.length; x++) {
                ListCount[x] = 0;
            }

            // sets up the iterator loop to process all numbers entered so far
            Iterator<Integer> Looper = NumberArray.iterator();
            while(Looper.hasNext()) { // looping thorught the list 
                int OperNum = Looper.next(); 
                // 1-10
                if((OperNum >= 1) && (OperNum <= 10)) { // checks if number is between 1-10
                    ListCount[0]++; // adds one to the 1-10 range number count 
                }
                // 11-20
                else if((OperNum > 10) && (OperNum <= 20)) { // checks if number is between 11-20
                    ListCount[1]++; // adds one to the 11-20 range number count 
                }
                // 21-30
                else if((OperNum > 20) && (OperNum <= 30)) { // checks if number is between 21-30
                    ListCount[2]++; // adds one to the 21-30 range number count 
                }
                // 31-40
                else if((OperNum > 30) && (OperNum <= 40)) { // checks if number is between 31-40
                    ListCount[3]++; // adds one to the 31-40 range number count 
                }
                // 41-50
                else if((OperNum > 40) && (OperNum <= 50)) { // checks if number is between 41-50
                    ListCount[4]++; // adds one to the 41-50 range number count 
                }
                // 51-60
                else if((OperNum > 50) && (OperNum <= 60)) { // checks if number is between 51-60
                    ListCount[5]++; // adds one to the 51-60 range number count 
                }
                // 61-70
                else if((OperNum > 60) && (OperNum <= 70)) { // checks if number is between 61-70
                    ListCount[6]++; // adds one to the 61-70 range number count 
                }
                // 71-80
                else if((OperNum > 70) && (OperNum <= 80)) { // checks if number is between 71-80
                    ListCount[7]++; // adds one to the 71-80 range number count 
                }
                // 81-90
                else if((OperNum > 80) && (OperNum <= 90)) { // checks if number is between 81-90
                    ListCount[8]++; // adds one to the 81-90 range number count 
                }
                // 91-100
                else if((OperNum > 90) && (OperNum <= 100)) { // checks if number is between 91-100
                    ListCount[9]++; // adds one to the 91-100 range number count 
                }
            }
            // after you find the counts, update the graphic

            for(int ArrNum = 0; ArrNum < ListCount.length; ArrNum++) { // iterates thorught the array 
                System.out.print(((10 * ArrNum) + 1) + "-" + ((ArrNum + 1) * 10) + "|"); 
                // prints the row number by calculating the first digit of the first number 
                // (adding 10 after each iter) + ArrNum + 1 
                //so it will print 1 on the first iter, 
                //11 on the iter 2,
                // 21 on iter 3 and so on; the second number - (array + 1) *100, 
                    //iter 1 -> 10, 
                    //iter 2 -> 20 etc. 
                for(int x = 0; x < ListCount[ArrNum]; x++) { // for the number in the array 
                    System.out.print("*"); // print the number 
                }
                System.out.println(""); //for formatting 
            }
        }
    }
}
