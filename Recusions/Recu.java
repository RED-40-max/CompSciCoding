
/* Program: Recursion #2 turn in Fall 2021
    + Enter a number then the power 
    + program will print the answer

 For example 
 if the user enters in a 2 
    followed by a 3 
 the answer would be 8. (2^3)
    + assuming for only positive integers are inputed 

 
import java.util.Scanner; //imports the functions

public class Recu {
    public static void main(String[] args){
//decleration of scanner 
        Scanner reader = new Scanner(System.in);

//Inital Number - scan, prompt, read, and record 
        System.out.println("Enter the Number: "); 
        int OGNum = reader.nextInt(); //set as the base of the exponant

//Power Number - Scan, prompt, read and record 
        System.out.println("Enter the Power: "); 
        int PowerNum = reader.nextInt(); //set as the power / exponant

        int InitalVariable = 1; //sets up the base case for recusion

        Powerizer(OGNum,PowerNum,InitalVariable); //using the method by sending the base and the power

    }

/* Recusion method: Powerizer 
    + for this method, i will be using a for loop approch 
    where i set an iterative counter and then use that counter 
    to do the right amount of times i multiply the OGNum 
        + base cases: 
            => if the power is 0, the number is 1
            => if the power is 1 the number is itself 
        + Recusive case: update the sum to be the sum times the OGNum / first 
            inputted number - in this case use the power as the counter 
            using the 
                Sum *= OGNum 
            to edit it 

    ==Attempt 1== 
        code: 

        public static void Powerizer(int Num, int Power){

        int RunningSum = 1; //set up for the rest of the cases for 1
                            // becuse if the power is 0, the result is 1 always

            if (1 == Power){ //base case, if the power is one, then the result is inputed
                System.out.println("The result of your exponant is: "+ RunningSum); //

            } else { //recusive case: will multiply the sum 

                RunningSum *= Num; //multiplying the 1 * Num initally, then it's the Num * Num, ect. 
                Power--; //subtracting one from the power as the base increases and takes on the power
                Powerizer(Num, Power); //returns the Number and the reduced power for another iternation
                    //since the Running Sum needs to be carried into the next recursion,

            }
        --notes- 
            this time i'm going to take running sum and take into the next recusion


 

    public static void Powerizer(int Num, int Power, int RunningSum){ //the base, power, and inital value 1 for the running sum is sent

        if (0 == Power){ //base case, if the power is zero, then the result is inputed
            System.out.println("The result of your exponant is: "+ RunningSum); //

        } else { //recusive case: will multiply the sum 

            RunningSum *= Num; //multiplying the 1 * Num initally, then it's the Num * Num, ect. 
            Power--; //subtracting one from the power as the base increases and takes on the power
            Powerizer(Num, Power, RunningSum); //returns the Number and the reduced power for another iternation
                /*since the Running Sum needs to be carried into the next recursion, make it it's own variable and 
                send it to the next recusion 
             

        }


    }


    
}
*/
