package Arrays;
/* program: Arrays #2 Turn In
    + create a list of 100 rand gen numbers betwen (1-100)
    + print out 
        + list in order 
        + list in reverse order
        + how many of each number was generated 


 */


public class RandHell {
    private static int[] OGList = new int[100]; // intilize the list  
    private static int[] NewArray = new int[100]; //making new arrray with 100 values, for flexability so both methods can access it
    public static void main(String[] args){
    
        RandomGenerator(); //puts in the number
        HowManyOfEach(); //finds each number
        InOrder(); //finds the order
        InReverse(); //finds the reversed order

    }

//method for randomlly generating numbers 
    public static void RandomGenerator(){ 
        for(int counter = 0; counter < OGList.length ; counter++){ //for loop to generate 100 numbers
            int RandNum = 1 + (int) (Math.random() * (100)); //creates a random number that is between 1-100 each time
                /* to randomly generate a number 
                    int randomNum = min + (int) (Math.random * (max - min + 1))
                in this case max would be 100 and a min will be 1 
                    therfore 
                    int RandNum = 1 + (int) (Math.random() * (100));
                */
                OGList[counter] = RandNum; //gets the random number and puts it as the counter of that location
        }
        System.out.println("List has been generated"); //lets us know that it worked
    }
//method for finding each of the numbers 
    public static void HowManyOfEach(){
        /* Finding the number of each number by 
            + initlizeing the variable
            + going thorught the array 
                + for each variable deciding if it is that number 
                + adding one for each variable that fits 
                + printing them out 
                + repeat
            * use nested loops 
                - outer loop gose throught numbers 1-100 
                - inner loop checks for that certain number of the outer loop 
         */

        //initlizing each variable
        int Innertotal = 0; //the variable to count the number of 1-100
        System.out.println(" ");
        System.out.println("------------------Numbers--------------------");

        //outer total that gose throught 1-100
        for (int outercounter = 1; outercounter <= 100; outercounter++){
            Innertotal = 0; //resets variable

            //inner total that checks for certain number 
            for(int t: OGList){
                if (t == outercounter){ //if a certain variable is equal to the variable we are looking for - 100
                    Innertotal++; //adds 1 to the total
                }
            }
            //at the end, printing them out then loop
            System.out.println(Innertotal + " number of " + outercounter+ "'s in the array");
         
        }
        System.out.println(" ");
    }
//method for putting numbers in order
    public static void InOrder(){
        /* printing in order 
            + make a new array
            + loop thorught the OG array from numbers 1-100 
                + first start by finding all the 1's
                    + add the 1's to the new array 
                    + for each one added, move the counter therfore the location 
                    adding to over by one 
                + then find the 2's and repeate to all 100 numbers 
            + print out the new array 
            + use nested loops 
                + 1st loop gose throught 1-100, 
                    + 2nd loop finds one number that matches the outerloop counter 
                    then it adds it to the location of the loop, and if it adds it then it 
                    shifts the location of the outer loop so it can be in order 
   example at end of code
         */

       
        int innercounter =0; //the counter for the location in the new array
        //loop for ordering
            for (int outercounter = 1; outercounter <= 100; outercounter++){ //for int in the loop
                for(int t: OGList){ //inner loop that gose throught 

                    if (t == outercounter){ //if the number and the outercounter number match
                        NewArray[innercounter] = t; //takes the array and assigns it to t
                        innercounter++; //moves the inner counter over by one 
                    }

                }


            }

        //loop for printing 
        System.out.println(" ");
        System.out.println("------------------IN ORDER--------------------");
            for (int t: NewArray){
                System.out.print(t + ","); 
            }
            System.out.println(" ");
    }

//for printing in reverse 
    public static void InReverse(){
        System.out.println(" ");
        System.out.println("------------------IN Reverse--------------------");
        /* to print the reverse, we take the new array that was initlized in the previous method and 
        we count backwards from the location, byt taking length -1 becuse location starts at 0, and include 
        0 in the test condition so it can be included in the counter

         */

        for(int counter = NewArray.length - 1; counter >= 0; counter-- ){ //conditions
            System.out.print( NewArray[counter]+ ","); //printing out the array 

        }


    }

    }


    /*
     *  ex. 
        int[] NewArray = new int[4]; -> newArray[] = {0,0,0,0}
        int[] OGArray = {2,3,2,1}
        int innercounter =0; //the counter for the location in the new array

        for (int outercounter = 1; outercounter <= 4; outercounter++){
            for(int t: OGList){

                if (t == outercounter){
                    NewArray[innercounter] = t; 
                    innercounter++;  
                }

            }


        }
    -> the outer counter starts at 1 
        -> inner loop gose to 0th location, whitch is 2
        -> since it dosn't meet conditinos, it just returns 
        -> eventually the inner loop will encounter the 3rd location, which is 1 
            -> since t (1), is same as outer counter (1), it will add 1 to the 0th location of 
            the new array 

            ->NewArray[Innercounter] = 1
            -> New Array [0] = 1 
            -> NewArray[] = {1,0,0,0}

            -> Innercounter(0) + 1 = 1
            -> and move the location to input over by 1

    -> now the outer loop will move the outer counter to 2
        -> the inner counter looks throught the list for where t = 2 
            -> the inner loop encounters teh 0th locataion, whitch is 2
                -> since t(2) = counter (2) it will add it 

                    ->NewArray[Innercounter] = 2
                    -> NewArray [1] = 2 
                    -> NewArray[] = {1,2,0,0}
                    ->-> Innercounter(1) + 1 = 2

            -> encounters the 3rd location, where t= 2
                -> since t(2) = counter (2) it will add it 
                    -> NewArray[Innercounter] = 2
                    ->  NewArray [2] = 2 
                     -> NewArray[] = {1,2,2,0}

     */
