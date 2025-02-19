/* Program: AP Free Response Loops Practice
    + Read two numbers 
        + Value: will print at end of gen
        + numRounds: will dictate number of rounds printed 
    + Loop will iter for numRounds rounds
        + numbers of random integer 0 <= x <= 9 printed untill 5 is printed
        + stoped after numRounds 
 */

import java.util.Scanner ; //imports a scanner tool 

public class RandLoop {
    public static void main(String[] args){

// Set up, Prompt, Read, and Store 
        Scanner reader = new Scanner(System.in); 

//Number of rounds  
        System.out.println("Number of Desired Rounds: "); 
        int numRounds = reader.nextInt(); 

//value of target number
        System.out.println("Value of Desired Number: ");
        int Value = reader.nextInt(); 

/* + as long as the counter 'int i = 0' is less then or equal to the number of specificied rounds, 
it will run this program, then increment i untill it cannot run anymore. */  

int RandNum; //initlize this operating number, the randomized number variable 

        for (int i = 0; (numRounds >= i); i++){        

        do {
            RandNum = 0 + (int) (Math.random() * (10)); //randomly generates numbers between 0 and 9 
            System.out.print(RandNum + ", "); //print it out and sepreate it 

        } while(RandNum != Value); // condition that the value is not reached 
            
        System.out.println(" "); //then just start new line 

            }
}           
    
}
