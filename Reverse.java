/* Program: Recursion #1 turn in Fall 2021
    + Write program using recusion, 
        compute power of a number 
    + enter number then output reverse of number
    =  For example
        if user enters (1234) 
            output 4321 

tips 
    - there is two ways to solve, one is easier then other 
    - no need to reorder / change it, just print out the 
        numbers / do an output

 */

import java.util.Scanner; 


public class Reverse {
    public static void main(String[] args){
//scanning, prompt, read, and record 
    Scanner reader = new Scanner(System.in); 
    System.out.println("Input a Number: "); 
    int OGNumber = reader.nextInt();

    Solver(OGNumber); 

//this is the thing that will be returned after we give a number
       //System.out.println(Solver(OGNumber)); 

        
            } 
        


        public static void Solver(int OpNum){


            if (OpNum < 10 ){ // base case, if there is a single digit inputed aka. a number less then 10 
                System.out.print(OpNum); // you return the number 
            }
            else {
                
                System.out.print(OpNum %10); //prints out the last digit in the number 
                Solver(OpNum/10); // since it is an int, if we divide by 10, we reduce the last number and  
                 

            }
            

         }
}

 /* Recursion
            + Base case: the answer / the thing printed out is 
        
            + the format of the recusion method seems to be like this 
                MethodName{
        
                if (Base Case variable comparison)
                    return somthing; 
                else 
                    return (MethodName(Basecase variable w/ change)); 
                
                }
    == ATTEMPT 1 == 
        + a way to sepreate numbers in a way i already know is by the digits place 
            so what if we sepreate the digits place and then re-order them 
            1's, 10's, 100's, ect. --> 100's, 10's, 1's 
        + Do this by dividing by 10 each recursion and then returning the number 
            so it gose back
        Code: 
             public static int Solver(int OpNum){

            if (OpNum < 10 ){ // base case, if there is a single digit inputted aka. a number less then 10 
                return (OpNum); // you return the number 
            }
            else {
                int var = Solver(OpNum / 10); 
                return var; 

            }
        - Notes after  - 
            - it returned the first digit 
                this is becuse i asked it to divide by 10 until you cannot divide by 10 anymore
            + so maybe i need to find another way 
            and divide it some other way like modeulous  

     == ATTEMPT 2 == 
        + i'm still going to try and sepreate the numbers by the digits place and reorder them 
            but instead i will use modeulous - whitch should take away the last digit one at a time 
                12334 () -> 1233 (4) -> 123 (4)(3) -> 12 (4)(3)(2) -> 1(4)(3)(3)(2)
            then it should return backwards like this 
                4 -> 43 -> 433 -> 4332 -> 43321
        + i'm going to try it
        Code: 
            public static int Solver(int OpNum){

                if (OpNum < 10 ){ // base case, if there is a single digit inputted aka. a number less then 10 
                    return (OpNum); // you return the number 
                }
                else {
                    int var = Solver(OpNum % 10); 
                    return var; 

                }
             }
        - Notes after = 
            - this time it returned the last digit, if i can get it to 
            return the last digit each time that would be great. 

    == ATTEMPT 3 ==
        + i'm gonna try and diagram it more.
            ok so if i turn to void i can print numbers 
        + OVERALL 
            %10 - continually will take the last number
            / 10 - contintually will take the first number 
            if on the format 
                j + sum (j-1) - 
                    j-1 is the forward propegation 
                        so i need to do OpNum%10 forward 
                    j + sum (j-1) is the backward propegation
                        do somthing like OpNum / 10, somewhere 
                + can i return the last number each time and divide it by 10 then repeat
                + start the thingy 
                    %10 continusly thorught the entire funtion so 
                        if(OpNum <10) - will print it out 
                    at the end, divide by 10 and repeate
                + Call it twice? 
                    once for %10 
                    second time - after decition thing for /10?? 
                + so do a thing where it's like 
                    (num3 *10) + num2
                looking like 
                    ->1234
                to 
                    123(4)->12(3)(4)->1(2)(3)(4)
                then going 
                    (4*10) + 3 -> (43*10) + 2 -> (432 *10) +1 -> 4321
                + with fib / factorial logic i'd be somthing like 
                    (num3 *10) + num2 -> (OpNum %10) + OpNum
     == ATTEMPT 4 ==   
            + so i was wrong, %10 prints the last digit and only has to be done once 
            + switching to void so i can print and not have to return anything just yet 
            + also should probablly print the numbers as it gose instead of try and get one number
                maybe like this
                print('skibdi rizzing')

                        
                    
                    }
                
                }
        code: 
            public static void Solver(int OpNum){


            if (OpNum < 10 ){ // base case, if there is a single digit inputed aka. a number less then 10 
                System.out.print(OpNum); // you return the number 
            }
            else {
                
                System.out.print(OpNum %10) + Solver(OpNum/10); //prints out the last digit in the number 
                 // since it is an int, if we divide by 10, we reduce the last number and  

            }
        -- errors out for some reason

         }
}
            
         */