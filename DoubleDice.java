/* Program: Parallel Arrays Turn in
    + using 1-d arrays 
    + use Random number generator 
        to randomly generate a number 
                int randomNum = min + (int) (Math.random() * (max - min + 1))
            in this case max would be 6 and the min would be 1, therfore 
                int randomNum = 1 + (int) (Math.random() * (6));
    + roll a pair of dice a select amount of times 
    + calculate / report how many of each combonation was rolled 
        1x1, 1x2, ect. 
    so the arrays will be like this
    int DiceOne[] = {1,4,3,2}
    int DiceTwo[] = {4,3,2,1}
    combos: 
        1x1 = 0 
        1x2 = 1
        1x3 = 0
        ...
 
 
 */

import java.util.Scanner; //for reading things in

public class DoubleDice {

    private static int[] DiceOne; //for the first dice rolls 
    private static int[] DiceTwo; //for the second dice rolls 

    public static void main(String[] args){
//Scans 
        Scanner reader = new Scanner(System.in); //intitlization 
        System.out.println("how many times the dice to rolls: "); //prompting
        int RollTimes = reader.nextInt(); //reads in how many times the dice rolls

        DiceOne = new int[RollTimes]; //fills the first array with the intended number of times it should roll
        DiceTwo = new int[RollTimes]; //fills the second array with the intended number of times it should roll

        NumGen(); //the number generator and printer 
        NumCalcs(); //number calculator 


    }

//fill in the array and prints it out
    public static void NumGen(){
    //fills arrays     
    System.out.print("Dice One: ");//prints out that this is for Dice One 
        for(int counter = 0; counter < DiceOne.length; counter++){ //filling array for first dice 
            int randomNum = 1 + (int) (Math.random() * (6)); //randomly generates a number between 1 and 6 
            DiceOne[counter] = randomNum; //to set number of a given roll to the random one
            /* since it is a for-each loop, the loop will iterate thorught the entire array and fill 
            each of the numbers that are pre-set as 0 to the randomly generated number 
            ie. 
            DiceOne[] = {0,0,0,0} 
                -> 1st iter
                DiceOne[0] = 2
                -> DiceOne[] = {2,0,0,0}
            DiceOne[] = {2,3,1,4}
            don't use t for the thing, since it is a temp variable and will not store well. 
            */
            System.out.print(randomNum + ","); //prints out that number
        }
    System.out.println("");//formatting
    System.out.print("Dice Two: "); //prints out that this is for Dice two 
        for(int counter = 0; counter < DiceOne.length; counter++){ //filling array for second dice
            int randomNum = 1 + (int) (Math.random() * (6)); //randomly generates a number between 1 and 6 
            DiceTwo[counter] = randomNum; //sets that number to the new number 
            System.out.print( randomNum + ","); //prints out that number
        }
   
    }
//to do the calc on the number combos 
/* to find the number of each combonation 
    + must be a loop 
    + must refrence the location of both dice 
    + print(var1 + 'x'+ var2 + ":" + NumberOfVar)
        something that refrences the two variables (counters probably)
        so it can list the thing
    + first find 1x1, then 1x2, ect. 
    + nested loops where the outer is the first number (1) 
        and the inner is the second variables (1,2)
    + the test conditnion must be var <= 6 since there is only six sides to a dice 
    + find a way to avoid repeates like: 1x6 and 6x1 being in the same thing 
        must be like
        6: 1-2-3-4-5-6
        5: 1-2-3-4-5
        4: 1-2-3-4
        3: 1-2-3
        2: 1-2
        1: 1
        since increasing would be much harder, first number can be the first one, second number can be the -
            would also have to add a decreasing modifyer of the second number in the first loop 
scratch that 
    + i need to track 4 variables: the first number, the second number, the count of that combo, and the location
    within both arrays
    + there needs to be for / for-each loops, and if statments 
        with print statements
    + if (firstArray[0] = FirstNumber AND secondArray[0] = Secondnumber ) OR 
        (firstArray[0] = Secondnumber AND secondArray[0] = FirstNumber )
        -> then add one to the combo count 

 */

    public static void NumCalcs(){
        System.out.println(""); 
        System.out.println("------_Number Combinations----------");

       
        int ComboCount = 0; 
        for (int Counter1 = 6;  Counter1 > 0 ; Counter1--){ //first number loop 
           

            for( int Counter2 = Counter1; Counter2 > 0 ; Counter2--){  //second number loop
                ComboCount = 0; //combo needs to be set to 0 each time `
                /*second number loop, equals the first counter so that it will make sense for the decreasing2
                
                triangle number thing
                 it's above to 0 so that it terminates once it reaches 0 
                 counter2 decreases each iter so that it eventually reaches 0 
                 */

                for(int Location = 0; Location < DiceOne.length ; Location++){ //go throught both array loop 
                /*to go throught the first dice array -- see end of doc for logic  */
                    if((DiceOne[Location] == Counter1) && (DiceTwo[Location] == Counter2)) {
                        ComboCount++ ; //adds to the combo counter each time the array encounters
                    } else if((DiceOne[Location] == Counter2) && (DiceTwo[Location] == Counter1)){
                        ComboCount++ ; //adds to the combo counter each time the array encounters
                    }
                    
                
                }

                //after each finishing of the array circulation
                System.out.println(Counter1 + "x"+ Counter2 + ": "+ ComboCount); //prints out the combo and the count
              
                
            }
            
            
        }

    }
    
}
/*to go throught the first dice array 
                          if (firstArray[0] = FirstNumber AND secondArray[0] = Secondnumber ) OR 
                            (firstArray[0] = Secondnumber AND secondArray[0] = FirstNumber )
                        ie. 
                            FirstArray[] = {2,1}
                            SecondArray[] = {1,2}
                        -> loops Counter1 = 1
                            + Loops Counter2 = 1 
                                + Array search 
                                ->looking for any combonations of 1x1 or 1x1
                                                            
                                -> none found but we then return and update
                        
                        -> loops Counter1 = 1 
                            -> Loops Counter2 = 2
                                -> looking for any combonations of 1x2 or 2x1 
                                FirstArray[0]  = 2
                                SecondArray[0] = 1 
                                    therfore we add one to the counter 
                                        -> ComboCount = 1
                                -> FirstArray[1] = 1
                                -> SecondArrau [1] = 2
                                    therfore we add one the the counter 
                                        ->ComboCount =2
                                + go thorught rest of the entire array 
                                + since there was a combo, we output the number
                        ->  loops Counter1 = 1 and Loops Counter2 = 2
                            -> 


                         */

