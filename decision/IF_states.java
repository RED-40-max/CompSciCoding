
 //NOT REQIRED< SUSTAINED 
import java.util.Scanner; //inputs a reading function 

public class IF_states {
     public static void main(String[] args){
  //reads the stuff       
         Scanner reader = new Scanner(System.in); 
         System.out.println("Input a number"); 
         float ValueOfUser = reader.nextFloat();
 //if else cascade 
         if (ValueOfUser > 0){ 
             System.out.println("This is a Positive Number"); 
         } /*  this is to check if it is positive, with (if, else if, else) you need 
         to have in sepreate brackets, {}, and for (if, else if) 
         you need to specifiy a condition*/
         else if (ValueOfUser < 0){ //else if negetive
             System.out.println("This is a Negitive Number");
         } 
         else { //otherwise just return the number 0
             System.out.println("This is the Number 0");
         }
 
         }

     }

