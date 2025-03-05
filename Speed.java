/* Program: Arrays #1 Turn In
    + report on speending - limit = 55
    + data from 10 - diffrent people 
        + Genarated method
            + let (assume that) the numbers be randomly generated 
            + let the rand gen numbers be 55 or above
        + Input method
    + output 
        + highest speed 
        + avrage Speed 
        + number of people who where 
            + 0-10 miles over 
            + 10 - 20 miles over 
            + 20 miles over 
 
 */

 import java.util.Scanner; //import here for flexability 


 public class Speed {
    private static Scanner reader = new Scanner(System.in); // initlizes scanning tool publically for flexability
    private static int[] SpeedData = new int[10]; //declaring a array publically for flexability, setting to 10 spots

    public static void main(String[] args){
        //reads stuff in
            System.out.println(" (1) Read in data or (2)Randomly generate it?");
            int Choice = reader.nextInt(); 
        Starter(Choice); //method to start it all, selection, ect.
        Calc(); //method to print out all the calculations  
       

    }

//method to start and print everything 
    public static void Starter(int Choice){   
        //method choice 
        if (Choice == 1){ //manually read in data
            InputMethod(); //the input method is called
        } else if (Choice == 2){ //randomly generate data
            RandomMethod(); //calls the randomly gen method

        }

        //printing data after methods run.
        System.out.println(" "); //sepreation
        System.out.print("Speeding data: ["); // the start of data 
        // do a for-each loop where for each thing in the speed data array, you print it our to start
        for(int t: SpeedData){ //start by printing data
            System.out.print(t + ",");
        }
        System.out.println("]"); //the end of the data

    }

//method for Inputing numbers manually 
    public static void InputMethod(){
        /* if counter = 0, 
                    -> input speeder # 1 -> user inputs 56
                    -> counter[] = {56,0,0,0,0,0,0,0,0,0,0}
                counter updates to 2 
                    -> input speed for speeder #2 -> user inputs 88
                    -> counter[] = {56, 88,0,0,0,0,0,0,0,0}
                ect. 
             */
        for(int counter = 0; counter < SpeedData.length ; counter++){ //for loop to gether 10 people
            System.out.println("Input speed for speeder #: " + (counter + 1) ); //prompting
                // also since arrays start at 0, make sure that it's + 1 the array location
            SpeedData[counter] = reader.nextInt(); //reads in the specfiyed and puts it as the counter of that location

        }
    }
//method for randomlly generating numbers 
    public static void RandomMethod(){ 
        for(int counter = 0; counter < SpeedData.length ; counter++){ //for loop to gather 10 people
            int RandNum = 56 + (int) (Math.random() * (45)); //creates a random number that is over 55 each time
                /* to randomly generate a number 
                    int randomNum = min + (int) (Math.random * (max - min + 1))
                in this case a reasonable max would be 100 and a min will be 56 since that is concidered speeding 
                therfore it would be 
                     int RandNum = 56 + (int) (Math.random() * (45));
                */
            SpeedData[counter] = RandNum; //gets the random number and puts it as the counter of that location
    }
        
    }
//method to call calculations and print them
    public static void Calc(){
        System.out.println("------------Stats-------------");//formatting
        int highestSpeed = HighSpeedFinder(); //using the method for the highest speed 
        System.out.println("highest speed is: "+ highestSpeed); //the highest speed will be found and printed
        
        int AvgSpeed =  AvgSpeedFinder(); //using the method for avg finding
        System.out.println("Avrage Speed is: "+ AvgSpeed); //avg speed 
        
        //numbers of each speeder, since it is multiple variables, print them out inside 
        SpeederNumbers();

    }

//method to find the highest speed
    public static int HighSpeedFinder(){
         /* finding the highest speed by 
            + going throught the array 
            + comparing the stored value / previous value with the current value, 
                + if it is bigger, set the highest value to the new value, 
                + otherwise keep the previous value 
            * must start at one to be able to compare this one to previous one
            * must set test value to counter < SpeedData.Length so 
                it can also compare 10th value to 9th value without erroring since 
                the values start at 0 
         */
        int highestSpeed = SpeedData[0]; //initalize it for 0th value

        for (int counter = 1; counter < SpeedData.length ; counter++){ //for loop data thing
            if (highestSpeed < SpeedData[counter]){ //if current value is higer then previous value, 
                highestSpeed = SpeedData[counter]; //set the new high to the current value 
            }
            //otherwise just do nothing / let the higest speed remain from previous iters
        }
        return highestSpeed; 
    }
//method to find the avrage speed 
    public static int AvgSpeedFinder(){
        /* finding the avrage speed by 
            + summing the numbers in a array with a running sum 
                + use a 'for each'
            + dividing the sum by the length of the array 
         */
        int RunningSum = 0; //initlize 
        for (int t: SpeedData){ //for each value in the array
            RunningSum += t; //add it to the running sum of the arrays 
        }
        int AvgSpeed = (RunningSum / SpeedData.length); //allows for flexability and also finds avrage
        return AvgSpeed; //returns the value
    }

//method to find the number of speeders 
    public static void SpeederNumbers(){
        /* Finding the number of speeders by 
            + initlizeing 3 variables 
            + going thorught the array 
                + for each variable deciding what box it fits: under 10, between 10 and 20, over 20 
                + adding one for each variable that fits the box 
                + printing them out since it's multiple variables
         */
        //initlizing each variable
        int Under10 = 0; 
        int between10n20 = 0; 
        int Over20 = 0; 
        

         for(int t: SpeedData){ //for each value in the array 
            int MilesOverLimit = 0; //finding how the value is over or under the limits
            MilesOverLimit = t - 56; //finding how many miles over the limit it was, being on the limit is 55, would be -1 and not register

            if (MilesOverLimit < 10){ //if the miles is over
                Under10++; //adding one to the storing number
                
            } else if((MilesOverLimit >= 10) && (MilesOverLimit <= 20)){ //if it is between 10 and 20
                between10n20++; //add one to the storing number

            } else { //otherwise it must be 20 over the limit
                Over20++; //so add one in 

            }
            
            
         }
         //at the end, printing them out
          System.out.println(Under10 + " people where 0-10 miles over the limit");
          System.out.println(between10n20 + " people where 10-20 miles over the limit");
          System.out.println(Over20 + " people where over 20 miles over the limit");
    }
  
 }

 /* debug notes
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 61 out of bounds for length 10
                    at Speed.AvgSpeedFinder(Speed.java:132)
                    at Speed.Calc(Speed.java:93)
                    at Speed.main(Speed.java:30)
    +  i tried to use 10 instead of 9, so go back and edit to length -1  only in the for loops, for each is chill
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 62 out of bounds for length 10
                at Speed.AvgSpeedFinder(Speed.java:132)
                at Speed.Calc(Speed.java:93)
                at Speed.main(Speed.java:30)
    + the :# - is the line i messed up on         
    + messed up on the for-each loop 
        the for(int t) - the t in this context is just the value of the loop 
        so if the array was 
            int ExArray[] = {33,44,55,56}
        then this is how for(int t: ExArray){ print(t)} would work 
        -> the for-each loop takes the first int of the array, where t = 33
            -> prints 33 out
        -> for-each loop takes second int of the array, where t =44 
            -> prints 44 out 
        if you do something like 
            for(int t: ExArray){ print (ExArray[t])}, it would be like this: 
        -> for-each loop takes first int of the array, where t = 33
            -> then it tries to find the ExArray[33] - or the 33rd location, where the length is only 4
            -> throws an ArrayIndexOutOfBoundsException
logical error : 

                0 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                1 people where 20 miles over the limit
                1 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                1 people where 20 miles over the limit
                1 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                2 people where 20 miles over the limit
                2 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                2 people where 20 miles over the limit
                3 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                2 people where 20 miles over the limit
                4 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                2 people where 20 miles over the limit
                4 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                3 people where 20 miles over the limit
                5 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                3 people where 20 miles over the limit
                5 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                4 people where 20 miles over the limit
                6 people where 0-10 miles over the limit
                0 people where 10-20 miles over the limit
                4 people where 20 miles over the limit
    + take it out of the for loop ig. 

                    1
                    Input speed for speeder #: 1
                    56
                    Input speed for speeder #: 2
                    56
                    Input speed for speeder #: 3
                    56
                    Input speed for speeder #: 4
                    56
                    Input speed for speeder #: 5
                    57
                    Input speed for speeder #: 6
                    57
                    Input speed for speeder #: 7
                    57
                    Input speed for speeder #: 8
                    58
                    Input speed for speeder #: 9
                    58
                    Input speed for speeder #: 10
                    59
                    
                    Speeding data: [56,56,56,56,57,57,57,58,58,59,]
                    ------------Stats-------------
                    highest speed is: 59
                    Avrage Speed is: 57
                    0 people where 0-10 miles over the limit
                    0 people where 10-20 miles over the limit
                    10 people where over 20 miles over the limit
        + maybe it has something to do with the calling of methods
        + used wrong variable for the comparison metric in the calculating the people who where speeding and whatnot 
    

  */