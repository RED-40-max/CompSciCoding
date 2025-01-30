//programs that converts f to c - tempreature 

import java.util.Scanner; //reading the

public class F_to_C {
    
    public static void main(String[] args){
//reading and assigning f
        Scanner reader = new Scanner(System.in); //intilizing reader
        System.out.println("enter a temp in f"); //prompts user
        double fer_temp = reader.nextDouble(); // reads next line 

//calculations (32°F − 32) × 5/9 = 0°C
        double cel_temp = (fer_temp - 32)* (5/9); 
//prints out the result in cel
        System.out.println( cel_temp );
    }
}
