/* 

program: IN CLASS DEMO OF METHODS 

 
import java.util.Scanner; //scanner tool 

public class MethodDemo {
    public static void main(String[] args){
       
        
        // initlizing 
        int num1, num2, sum; 
        //reading
        Scanner reader = new Scanner(System.in); 
        System.out.println("Enter 3 numbers"); 
        num1 = reader.nextInt(); 
        num2 = reader.nextInt(); 

 //regular version
 System.out.println("Regular vesions"); 
        //find sum 
        sum = num1 + num2; 

        //print it 
        System.out.println("your sum is" + sum); 

//method version 
System.out.println("this is the method version: "); 

        //the method version 
        int sum1 ; 
        sum1 = SumNumbers(num1, num2); //sums the number
        PrintSum(sum); //prints from method
        

    }


    public static void PrintSum(int sum){ //method for printing
        //alt printing into method
        System.out.println(" Sum is: " + sum);
    }
    
    public static int SumNumbers(int n1, int n2){ //method for summing the numbers, 
        //uses static to avoid using class

    int s; 
    s = n1 + n2 ; 
    return(s);
    }
    
}
*/