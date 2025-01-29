/* Program for Variables & Math Prob 1, 
Question 11, Page 107: 
    Medowdale Dairy Farm sells organic brown eggs to customers 
        - 3.25 for Dozen 
        - 0.45 for for Individual Eggs
    + Write a read and gather the customers order        
    + Return:
        - number of eggs in the order 
        - display amount owed with full explination 
 */
import java.util.Scanner; // this is to import something that will help read the terminal contents 
public class Eggs {
   public static void main(String[] args){
//Prints out Things user can order  
    System.out.println("Store contents: \nDozen og eggs......$3.25 \nSingle Egg......$0.45"); // sepreate lines for dozen and single egg

//Dozen order - prompts, reads, and stores the order of dozen of eggs 
    Scanner DozenInput = new Scanner(System.in); // sets up the dozen value to be read and stored
    System.out.print("Number of Dozens: "); // prompts user
    double DozenOrder = DozenInput.nextDouble(); //Reads the next line and records order 

//Single egg order - prompts, reads, and stores the order. (same steps)     
    Scanner SingleInput = new Scanner(System.in);  // sets up value   
    System.out.print("Number of Single Eggs: "); //prompt
    double SingleOrder = SingleInput.nextDouble(); //reads and records 

// Calculates Values 
    double DozenTotal = DozenOrder * 3.25; //dozen money total based on amont bought 
    double SingleTotal = SingleOrder*0.45; // single money total 
    double OrderTotal = SingleTotal+DozenTotal; //order total 

 //Returns order with explination     
    System.out.println("\nYou ordered " + DozenOrder + " Dozen eggs and " + SingleOrder + " Single Eggs."); //lists dozen and single order
    System.out.println("-------------------------------------"); //  line to make it look good  
    System.out.println("# Dozen eggs are $3.25 each \n \t Dozen total: $" + DozenTotal); //Lists dozen total amont 
    System.out.println("\n# Single Eggs are $0.45 each \n \t Single Egg total: $" + SingleTotal ); //Lists single total amont 
    System.out.println("-------------------------------------"); //  line to make it look good  
    System.out.println("\nOrder total is: $"+ OrderTotal + "\n \n \tpay now or perish"); //Lists order total, threatens 


   }
}
