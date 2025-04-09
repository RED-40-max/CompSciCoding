package Arrays;
/* program: Assignment 2D array 
    + load array with 10 bombs
    + let user guess a spot 
        + if spot is not bomb
            + print out updated array 
            + let user pick another spot
        + if spot is bomb 
            + print out you loose 
    + if user win 
        + print congrats 

        given - 
        bomb is (0)
        no bomb is (1)    
 to-do 
    + make CoolerMineGenerator() for specifiing an amount of mines an adding it 
    + making number wise - actual minesweaper 
    +  adding ability to flag 

    SPECIAL CONTENT 
        + makes the option to pick your own dimentions (x and y)
        + shows how many bombs are within the matrix 

 */

import java.util.Scanner; //imports scanning tool

public class MineDupe {
    public static int XDim = 10;  //for testing and varifying the congrats function works and changing dimention
    public static int YDim = 10; //for testing and varifying the congrats function works 

    public static int[][] MineFeild = new int[YDim][XDim]; //make a 10 by 10 array 
    public static int NumberOfMines = 0; //int a checker that says how many total mines there are 
    public static String[][] MineGuess = new String[YDim][XDim]; // blank feild for updating graphic
    public static int AttemptNumber = 0; //number of attempts for final congrats
    public static boolean canStillPlay = true; //sets up a boolean for controlling the game loop

    
  
    public static Scanner reader = new Scanner(System.in); //scanning 

    public static void main(String[] args)
    {
        //adds custom board feature 
        System.out.println("Enter the desired board Width"); 
        XDim = reader.nextInt(); 

        System.out.println("Enter the desired board Length"); 
        YDim = reader.nextInt(); 
       
        MineGeneration(); //initlized and filled in the array with bombs / no bombs 

        while(canStillPlay)
        {
            
        UpdateGraphic(); //inital show 
        System.out.println(" ");
        System.out.println("enter your x coordinate guess (horrizontal)"); 
        int XGuess = reader.nextInt(); //stores the guess of the x coordinate

        System.out.println("enter your y coordinate guess (vertical)"); 
        int YGuess= reader.nextInt(); //stores the guess of the y coordiante

        
        GuessCheck(YGuess, XGuess); //runs
        }
        /* on the impossiable chance that you somehow manage to click every number and not fall into a bomb, you would
        finish playing the game*/ 
        
    }

    //displays and updates the display 
    public static void UpdateGraphic() 
    {       
        System.out.println("Number of mines total: " + NumberOfMines); 
        System.out.println(" ");
        for(int ArrColum = 0; ArrColum < YDim; ArrColum++)
        { 
        /* makes the array collum and compares it to the length of the array's collum, in this case it is 10 
        and adds after looping */

            System.out.print(ArrColum + "| "); //prints out the row number 

            for (int ArrRow = 0; ArrRow < XDim; ArrRow++) 
            {
            /* makes the array row and compares it to the length of the array's row, in this case it is 10 
            and adds after looping */    

                System.out.print(MineGuess[ArrColum][ArrRow] + " ");//prints out the matrix (+ MineFeild[ArrColum][ArrRow] + " " ) to test congrats final function
            }
            System.out.println(" "); //return after each row for formatting
        }

    //bottom numbers
        System.out.print("   "); //formatting 
        //prints out dashes to sepreate number co-ordinates and other thing
        for (int Counter = 0; Counter < YDim; Counter++)
        {

            System.out.print("--"); //prints out collum number 
        }
        System.out.println(" "); //formatting
        System.out.print("   "); //formatting 
        //prints out numbers for co-ordinates
        for (int Counter = 0; Counter < YDim; Counter++)
        {

            System.out.print( Counter + " "); //prints out collum number 
        }
    }

    //checks the guess and handles it
    public static void GuessCheck(int Yval, int Xval) 
    { 
            if (MineFeild[Yval][Xval] == 0)
            {
                MineGuess[Yval][Xval] = "X" ; 
                System.out.println("----YOU DIED. this is a bomb----"); 
                canStillPlay = false; //setting it to false
                
            } else 
            { 
                AttemptNumber++; //adding one to the number of attempts
                

                    if (((YDim* XDim) - AttemptNumber) == NumberOfMines) {
                        /* on the impossiable chance that you somehow manage to click every number and not fall into a bomb, you would
                    finish playing the game*/ 
                        canStillPlay = false; //setting it to false, since you won
                        System.out.println(" ---YOU WINNNNNNNNNNN--------"); 
                    }
                    else 
                    {
                        MineGuess[Yval][Xval] = "O" ; 
                        System.out.println("----YOU SURVIVED. choose another----"); 
                    }

            }



    }



    //class that generates the inital matrix with bombs and also sets up the graphic 
    public static void MineGeneration() 
    {
    //sets up the inital matrix
        for(int ArrHight = 0; ArrHight< YDim; ArrHight++)
        /* makes the array hight and compares it to the length of the array's hight, in this case it is 10 
        and adds after looping */
        {
            for(int ArrWidth = 0; ArrWidth < XDim; ArrWidth++)
            /* makes the array length and compares it to the length of the array's width, in this case it is 10 
            and adds after looping */
            {
                int RandNum = (int)(Math.random() * (2)); 
                /* Randomization thing, 
                int randomNum = min + (int)(Math.random() * ((max – min) + 1));
                min = 0 
                max = 1
                becuse of bomb or non-bomb 
                0 - is bomb, 
                1 - is no bomb 
                */ 
                if (RandNum == 0) //if there is a mine added
                {
                    NumberOfMines++; //adds to the number of total mines count 
                } 

                MineFeild[ArrHight][ArrWidth] = RandNum; 
                //as it iterates, it sets a bomb or dosen't randomly               
            }
        }

    //gets a specified amount of mines and puts it in randomly, makes rest not mines 

    //sets up the graphic 
        for(int ArrColum = 0; ArrColum < YDim; ArrColum++ )
        { 
        /* makes the array collum and compares it to the length of the array's collum, in this case it is 10 
        and adds after looping */
            for (int ArrRow = 0; ArrRow < XDim; ArrRow++) 
            {
            /* makes the array row and compares it to the length of the array's row, in this case it is 10 
            and adds after looping */    

                MineGuess[ArrColum][ArrRow] = "#"; //as it iterates, it assigns this charecter to every array
            }
        }
    }   

}
