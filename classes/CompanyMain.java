
/* Program: Classes programming assignment turn in




 */
import java.util.Scanner ; //imports the scanner for the loop 

public class CompanyMain {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in); //scanner inillization for fun / to control the loop 

    Company timmy = new Company(); //creates a new employee object
    timmy.NewEmployee(); //asks for employee inputs

    int choice = 1; 

    while (choice == 1){ //if the choice is one
        timmy.Update(); //makes it so you can update and do stuff 
        System.out.println("do you want to quit? (1 - no/ 0 - yes)"); 
        choice = reader.nextInt(); 

    }

    }


    
}
