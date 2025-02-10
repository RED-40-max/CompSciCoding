/* Program: Do Loops Problem Turn In 2021
    + modify WhileLoops.java so that 
        + computer plays the game by guessing randomly gen numbers 
        + print guesses and number of times to get the right answer 
    + BONUS: do some intellgence guesses - nope not doing this i am 
 */

 public class Do_Loops {

    public static void main(String[] args){

/* using and initalizing the WhileLoops.java program */

                boolean isGuessRight = false; //initally sets the guess to false so loop can start
                int RealNumber = 1 + (int) (Math.random() * (20)); // sets up the real number to guess, 
                // keep outside or number will keep changing 
                int numGuesses = 0; // keeping track of guess number 
//randomly guessing 
do { //initalizing do guess, the while code inside the do loop so it can run throught it each time, since it needs to. 
    int computerGuess = 1 + (int) (Math.random() * (20)); // generating a new guess each time 
    System.out.println("========== Guess: " + numGuesses + "  =========="); // prints out guess number and subseqent stuff
    System.out.println("Computer's Guess:  " + computerGuess); //print out number of guesses, moved up instead of in cascade or bellow to look better 

                //'loop' / evalv start 
                //got ride of while loop becuse it's already in do loop 
                 //no use for scanner, got rid of it - change UserGuess to ComputerGuess
        
                 //if output cascade - (MODIFYED: to make it more computer geared so the computer can play) 
                    if (computerGuess > RealNumber) { //number guessed is greater then actual 
                        isGuessRight = false; // its still wrong 
                        System.out.println("WRONG - it's too small, try again");  // tells us somthing to do it
                    }
                    else if (computerGuess < RealNumber){// if number is too small
                        isGuessRight = false; //is still wrong 
                        System.out.println("WRONG - it's too big, try again"); 
                    }
                    else if (computerGuess == RealNumber){ // if number is right 
                        isGuessRight = true; // sets to true to break the loop
                        //loop actually ends 
                        System.out.println("RIGHT! good job"); // tells us it was right
                    }

                numGuesses++; //add one each loop 
                } while(isGuessRight != true); // if not true then do all this again 
    }
    
}
// + BONUS: do some intellgence guesses - nope not doing this i am eppy as hell oml, i had do delete so much of my precious code T-T