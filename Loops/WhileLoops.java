

/* Program While Loops Problem Turn In: 
    While loop where: 
        + usser guesses a number between 1 and 20 
        + contains a number 
    + prompt user to guess that number 
        if user guesses number 
            game ends 
        otherwise 
            program contintues and says if too high or too low

 */ 
import java.util.Scanner; // import reader tool 

public class WhileLoops {
    public static void main(String[] args){

        boolean isGuessRight = false; //initally sets the guess to false so loop can start
        int RealNumber = 1 + (int) (Math.random() * (20)); // sets up the real number to guess, 
        // keep outside or number will keep changing 
                /* 
                Randomization thing, 
                   int randomNum = min + (int)(Math.random() * ((max – min) + 1));
                the minimum is set as 1 and max is set one less then the diffrence 
                in this cas it is 20. and we use the math.random method and cast it as int. 
                then we set it to a RealNumber variable to make comparisons 
                 */ 

        //loop start 
        while (isGuessRight != true){ //while the guess is not right, run the loop 
            
            
            
//Set up, prompt, read, and store. 
        Scanner reader = new Scanner(System.in); //Scanner set up 
        System.out.println("Guess a # between 1 and 20: "); // prompts user
        int UserGuess = reader.nextInt(); // reads and stores users next line
 
//if output cascade
            if (UserGuess > RealNumber) { //number guessed is greater then actual 
                isGuessRight = false; // its still wrong
                System.out.println("=============================="); //look nice
                System.out.println("WRONG - it's too big, try again"); // tells them its too big
                System.out.println("==============================");//look nice

            }
            else if (UserGuess < RealNumber){// if number is too small
                isGuessRight = false; //is still wrong
                System.out.println("==============================");
                System.out.println("WRONG - it's too small, try again"); // it tells them it's wrong
                System.out.println("==============================");
            }
            else if (UserGuess == RealNumber){ // if number is right 
                isGuessRight = true; // sets to true to break the loop
                System.out.println("=============================="); 
                System.out.println("RIGHT! good job"); // tells them they are right 
                System.out.println("==============================");
                //loop actually ends 

            }
        } //loop ends in code

    }
    
}
