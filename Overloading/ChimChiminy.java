
/* program: Overlaoding #2 Turn in 
    + test to see if parameters sent are equal 
    + allow user to enter in 1 or two integers 
        + use array lists? for flexability 
    + call appropriate method based on how many numbers inputed
    + loop 
 
 */

import java.util.Scanner; //keep


public class ChimChiminy 
{
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in); 
        boolean CanRun = true; //for the loop 

        while(CanRun) //the loop for the overall program 
        {
            System.out.println("enter how many to compare (2/3) or 0 to exit"); 
            int UsrChoice = reader.nextInt(); 

            if(UsrChoice == 0 ) //if the user wishes to exit 
            {
                CanRun = false;
                break ; //they exit out of the loop 

            }

            switch(UsrChoice) //if the user's choice is 2 / 3
            {

                case 2: //if it is two numbers
                //prompt, read, and store first number 
                    System.out.println("enter First Number: "); 
                    int TwNum1 = reader.nextInt();
                //same for second
                    System.out.println("enter second Number: "); 
                    int TwNum2 = reader.nextInt(); 
                //send both into the num checker
                    NumChecker(TwNum1, TwNum2); 

                    break; 
                case 3: 
                //same prompt, read, and store 
                    System.out.println("enter First Number: "); 
                    int ThNum1 = reader.nextInt();
                //same for second
                    System.out.println("enter second Number: "); 
                    int ThNum2 = reader.nextInt(); 
                //same for third 
                    System.out.println("enter third Number: "); 
                    int ThNum3 = reader.nextInt(); 
                //send all three to num checker 
                    NumChecker(ThNum1, ThNum2, ThNum3); 
                    break; 
                //the defualt is that it errors out
                default: 
                    System.out.println("Error, invalid number entered"); 
                    break; 
               
            }

            

        }
    }
    //two parameter equal checker 
    public static void NumChecker(int num1, int num2)
    {
        //class that takes two numbers, num1 and num2
        System.out.println("you have entered " + num1 + " and " + num2); 
        //prints out inital phrase for the comparison 

        if (num1 == num2) //if they are equal 
        {
            System.out.println("these two numbers are equal "); //then say so 
        } 
        else //otherwise they are not equal
        {
            System.out.println("these two numbers are not equal"); //and say that 
        }
    }
    //three parameter equal checker 
    public static void NumChecker(int num1, int num2, int num3)
    {
        //class that takes two numbers, num1 and num2
        System.out.println("you have entered " + num1 + ", " + num2 + ", "+ " and " + num3); 
        //prints out inital phrase for the comparison 

        if (num1 == num2 && num1 == num3) //if they are equal 
        {
            System.out.println("these three numbers are equal "); //then say so 
        } 
        else //otherwise they are not equal
        {
            System.out.println("these three numbers are not equal, at least one is diffrent"); //and say that 
        }
    }

}