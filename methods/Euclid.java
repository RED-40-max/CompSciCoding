/* program: Methods #2 Turn In Fall 2021
    + The Euclidean algorithm
        + GCF of 2 numbers

    + Begin Loop 
        * Find the integer quotient 
            q of x and y (q = x / y)
        * Find the remainder of dividing 
            x by y (r = x mod y)
        * If the remainder is 0 the algorithm is finished.  
            They greatest common factor is y
        * If the remainder is not 0, 
            set x to y and y to the remainder and repeat the loop
 */
import java.util.Scanner;

public class Euclid {
    public static void main(String[] args){
//Scanner set up 
    Scanner reader = new Scanner(System.in);
    //1st number - prompt, read and store     
        System.out.print("Bigger number as a integer: ");
        int num1x = reader.nextInt(); //the first number

    //2nd number - prompt, read, and store     
        System.out.print("\nSmaller number as a integer: ");
        int num2y = reader.nextInt(); //the second thing

int remainder; //initlaizing var for later use

// loop 
/*the blank is at the begining bc i can and also i don't know what i would put there 
i need for it to iternate throught the loop with the regular numbers once and then go thorought it after the update  */
        for( ;IsRemainder(num1x, num2y); num1x = num2y, num2y = remainder){ 
            
            remainder = remainderVal(num1x, num2y);

            System.out.println( num1x + "/" + num2y + "\n is: " + Quotient_val(num1x, num2y)); //formatting, shows the steps
            System.out.println("the remainder is: " + remainder); 


        }
        
        System.out.println("The Greatest Common Factor is: "+ num2y);

 
    }
    
//method of finding quotient 
public static int Quotient_val(int n1, int n2){
    int Quotient = n1 / n2; // finding the integer Quotient

    return Quotient; 

    }
    public static int remainderVal(int n1, int n2){
        int rem = n1 % n2; // finding the integer Quotient
    
        return rem; 
    }
 //method of finding remainder 


//method of finding the Remainder boolean
/* so the function explained 
    + public - this is the portion that says the method can be 
        accessed anywhere 
    + static - this is used when it is not part of a class 
        or dosn't need objects to be created to run / be used. 
    + boolean - this in front of the method name 
        means that the value the method will be returning is a boolean 
        true or false. 
    + Remainder_val - this is the name of the method
    + (int n1, int n2){ - this sets n1 and n2, the 
        parameters as integers so it can be used in the equations 

    + int remainder = n1 % n2; //finding the remainder
    
    + if the remainder is not 0, then it dosn't fufill the conditions, it returns false
        otherwise it fufills the condition and returns a true 

            if (remainder != 0){
                return false; 
            } else {
                return true ; 
            }

            }  

*-----* I solemnly swear that I implimented this solution with the intent to learn 
through my own efforts. i stumbled upon it, Googled it, and understand what it is and 
what it dose for this particular instance within my program. *-----*
 */

public static boolean IsRemainder(int n1, int n2){ 
    int remainder = n1 % n2; //finding the remainder
    if (remainder != 0){ 
        return true; //if remainder is not 0, then returns true for the loop
    } else {
        return false ; //if remainder is 0, returns false
    }

    }  
    
}
