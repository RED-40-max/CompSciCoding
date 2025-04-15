/* Program: Interface turn in #2

THIS IS THE REGULAR CLASS DOCUMENT

    + #2 create an interface 
        + Implement a password (methods) 
            + setpassword
            + checkpassword
            + resetpassword
            + lockdoc
            + unlockdoc
        + create one infrance for this
    + #3
        + create a program that uses abstract class to impliment combo lock 
        + start setting combo and locking lock 
        + be able to see if it is lock 
        + can try to unlock using combo 
        + print messege 
 @override 
to check the super class has the same issue and it helps not flag it over and over again 
 */
import java.util.Scanner;
public class TheLock extends IComboLock 
{


    static Scanner reader = new Scanner(System.in); 

    public void AskUsersetcombo()
    {
        System.out.println("enter 3 numbers to set your combo to: "); 

        System.out.println("1st number: "); //prompt
        int Num1 = reader.nextInt(); //record

        System.out.println("2nd number: "); //prompt
        int Num2 = reader.nextInt(); //record

        System.out.println("3rd number: "); //prompt
        int Num3 = reader.nextInt(); //record

        setcombo(Num1, Num2, Num3 ); //calls to set the combo 

        
    }
    public void CheckGuess()
    {
        //prompts for user to guesss the combo 
        System.out.println("enter first number guess: "); 
        int Num1Guess = reader.nextInt(); 

        System.out.println("enter second number guess: "); 
        int Num2Guess = reader.nextInt();

        System.out.println("enter Third number guess: "); 
        int Num3Guess = reader.nextInt();

        if((lockedUP[0] == Num1Guess && lockedUP[1] == Num2Guess) && lockedUP[2] == Num3Guess) //if all the numbers are correct 
        {

            unlock( Num1Guess,  Num2Guess,  Num3Guess); //call the unlock function by importng the thing

        } else 
        {
            System.out.println("error, try again!"); 
            CheckGuess(); //recusive call 
        }
    }

@Override //so it dosn't annoy me
 public void setcombo(int num1, int num2, int num3)
    {
        lockedUP[0] = num1; //sets the 1st number to the class variable 1st of the array 
        lockedUP[1] = num2; 
        lockedUP[2] = num3; 
        System.out.println("sucessfully set combo"); 
        lock(); //calls the funciton to lock it 
    }

 @Override //so it dosn't annoy me 
    public void unlock(int num1, int num2, int num3) 
    {


        System.out.println("the docuent has now been unlocked"); 
        locked = false; //sets lock to flase
        
    }

    
}
