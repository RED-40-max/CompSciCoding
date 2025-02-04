/* Proagram: If statements #3 
    + Prompt the user to enter in a score for a test.
    + your program should print out the grade the student got on that test
        + A (100-90)
        + B (89-80)
        + C (79-70)
        + D (69-60)
        + F (anything lower then 60)
    + Test 
        + A number on the boarder 
        + a really low number 
 */

 import java.util.Scanner; 

public class Grader {
    public static void main(String[] args){
// set up scanner, prompt user, read, and record the grade number         
        Scanner reader = new Scanner(System.in); // set up scanner
        System.out.println("Enter the score number: "); // prompt user
        int ScoreNum = reader.nextInt(); //read next line and record 
  
 //initalize score value, so it dosn't bother me later when doing cascade 
    char GradeLetter = 'E'; 

//if cascade 
        if ( (100 >= ScoreNum) && (ScoreNum >= 90) ){ // set up the A (100-90) 
            GradeLetter = 'A';
        }
        else if ( (89 >= ScoreNum) && (ScoreNum >= 80) ){ // set up B (89-80)
            GradeLetter = 'B';
        }
        else if ( (79 >= ScoreNum) && (ScoreNum >= 70) ){ // set up C (79-70)
            GradeLetter = 'C';
        }
        else if ( (69 >= ScoreNum) && (ScoreNum >= 60) ){ // set up D (69-60)
            GradeLetter = 'D';
        }
        else if ( (60 > ScoreNum)){ // set up  F (anything lower then 60)
            GradeLetter = 'F';
        }
        

//printing the grade 
        System.out.println( "Based on the score, your Grade is: " + GradeLetter);
        
    }
}
