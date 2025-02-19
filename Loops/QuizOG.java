/* Program: Quiz.java, page 327, quiz zone 1a 

    Write an application that creates a quiz. 
        + at least 5 questions 
        + MCQ - 4 answer options
        + If correct: congrats 
        + If incorrect: repremend + correct answer 
        + At the end of the quiz: 
            +  the number of correct 
            + Number of incorrect answers, 
            + the percentage of correct answers. 

FUTURE: 
    learn how to loop it, but using ways to store the questions and answers 
    and only one loop for the scan, args, and the decisiton makers, 


 */
import java.util.Scanner; 

 public class QuizOG {
    public static void main(String[] args){ 

        //define varaibles 
        int CorrectQCount = 0;
        int IncorrectQCount = 0;
        int questionNumber = 1;

// 1 Question - set up scanner, prompt user, read input, and record 
while (questionNumber <= 5) { //this is absolutly a stretch to say it is a loop, but it has a loop and works.. so.. 

    switch(questionNumber){ //the main case 
        case 1: 
                Scanner reader1 = new Scanner(System.in); // set up scanner
                System.out.println("=========== 1 ==========");
                System.out.println("What is the only planet in our solar system to rotate clockwise on its axis?");
                System.out.println(" a -  mars");
                System.out.println(" b -  earth");
                System.out.println(" c -  moon");
                System.out.println(" d -  venus");
                System.out.println("Enter answer (a/b/c/d) "); //prompt
                char response1 = reader1.next().charAt(0) ; //read and record
                    /* next() - this method will read what the user types in next 
                        * charAt(0) - this method will take the charecter at the 0th posision, in computers - this means 
                        *      its the charecter that you type first. 
                        */
            
            //Switch cascade 
                switch(response1){ // use '' for charecters so it registers, since this is proper syntax 
                    case 'a': 
                    case 'b': 
                    case 'c': 
                        System.out.print("_______Incorrect____ \n the correct answer is: ");
                        System.out.println(" d -  venus"); 
                        IncorrectQCount++; //adds one incorect question to count 
                        break ; 
                    case 'd': 
                        System.out.println("This is the correct answer!"); 
                        CorrectQCount++; //adds one correct question to count
                } System.out.println("=====================");
                questionNumber++ ; // adds one 
                break; 
 
        case 2: 
            // 2 Question - set up scanner, prompt user, read input, and record 
                Scanner reader2 = new Scanner(System.in); // set up scanner
                System.out.println("============ 2 =========");
                System.out.println("Which freezes faster: hot or cold water?");
                    System.out.println(" a -  hot");
                    System.out.println(" b -  cold");
                    System.out.println(" c -  both");
                    System.out.println(" d -  neither");
                System.out.print("Enter answer (a/b/c/d) "); //prompt
                char response2 =  reader2.next().charAt(0) ; //read and record
                    /* next() - this method will read what the user types in next 
                        * charAt(0) - this method will take the charecter at the 0th posision, in computers - this means 
                        *      its the charecter that you type first. 
                        */

                //Switch cascade 
                    switch(response2){ // use '' for charecters so it registers, since this is proper syntax 
                        case 'b': 
                        case 'c': 
                        case 'd': 
                            System.out.print("_______Incorrect____ \n the correct answer is: ");
                            System.out.println(" a -  hot "); 
                            IncorrectQCount++; //adds one incorect question to count 
                            break ; 
                        case 'a': 
                            System.out.println("This is the correct answer!"); 
                            CorrectQCount++; //adds one correct question to count
                    } System.out.println("=====================");
                    questionNumber++; // adds one to count 
                    break ; 
        case 3: 

                // 3 Question - set up scanner, prompt user, read input, and record 
                    Scanner reader3 = new Scanner(System.in); // set up scanner
                    System.out.println("========= 3 ============");
                    System.out.println("What is James Bond's code name?");
                        System.out.println(" a -  009");
                        System.out.println(" b -  008");
                        System.out.println(" c -  bond");
                        System.out.println(" d -  007");
                    System.out.println("Enter answer (a/b/c/d) "); //prompt
                    char response3 =  reader3.next().charAt(0) ; //read and record
                        /* next() - this method will read what the user types in next 
                            * charAt(0) - this method will take the charecter at the 0th posision, in computers - this means 
                            *      its the charecter that you type first. 
                            */

                    //Switch cascade 
                        switch(response3){ // use '' for charecters so it registers, since this is proper syntax 
                            case 'a': 
                            case 'b': 
                            case 'c': 
                                System.out.print("_______Incorrect____ \n the correct answer is: ");
                                System.out.println("d -  007 "); 
                                IncorrectQCount++; //adds one incorect question to count 
                                break ; 
                            case 'd': 
                                System.out.println("This is the correct answer!"); 
                                CorrectQCount++; //adds one correct question to count
                    }   System.out.println("=====================");
                    questionNumber++; 

                    break; 
        case 4: 
            // 4 Question - set up scanner, prompt user, read input, and record 
                    Scanner reader4 = new Scanner(System.in); // set up scanner
                    System.out.println("=========== 4 ==========");
                    System.out.println("Jim Henson is the creator of what beloved cast of characters?");
                        System.out.println(" a -  the animals");
                        System.out.println(" b -  asternoids");
                        System.out.println(" c -  power rangers");
                        System.out.println(" d -  The Muppets");
                    System.out.println("Enter answer (a/b/c/d) "); //prompt
                    char response4 =  reader4.next().charAt(0) ; //read and record
                        /* next() - this method will read what the user types in next 
                            * charAt(0) - this method will take the charecter at the 0th posision, in computers - this means 
                            *      its the charecter that you type first. 
                            */

                    //Switch cascade 
                        switch(response4){ // use '' for charecters so it registers, since this is proper syntax 
                            case 'a': 
                            case 'b': 
                            case 'c': 
                                System.out.print("_______Incorrect____ \n the correct answer is: ");
                                System.out.println(" d -  The Muppets"); 
                                IncorrectQCount++; //adds one incorect question to count 
                                break ; 
                            case 'd': 
                                System.out.println("This is the correct answer!"); 
                                CorrectQCount++; //adds one correct question to count
                    }      System.out.println("=====================");
                    questionNumber++ ; 

                break ; 
            case 5: 
                // 5 Question - set up scanner, prompt user, read input, and record 
                        Scanner reader5 = new Scanner(System.in); // set up scanner
                        System.out.println("========== 5 ===========");
                        System.out.println("Weighing around eight pounds, this is the human body's largest organ?");
                            System.out.println(" a -  the liver");
                            System.out.println(" b -  the hair");
                            System.out.println(" c -  the heart");
                            System.out.println(" d -  The skin");
                        System.out.print("Enter answer (a/b/c/d) "); //prompt
                        char response5 =  reader5.next().charAt(0) ; //read and record
                            /* next() - this method will read what the user types in next 
                                * charAt(0) - this method will take the charecter at the 0th posision, in computers - this means 
                                *      its the charecter that you type first. 
                                */
                    
                        //Switch cascade 
                            switch(response5){ // use '' for charecters so it registers, since this is proper syntax 
                                case 'a': 
                                case 'b': 
                                case 'c': 
                                    System.out.print("_______Incorrect____ \n the correct answer is: ");
                                    System.out.println("  d -  The skin"); 
                                    IncorrectQCount++; //adds one incorect question to count 
                                    break ; 
                                case 'd': 
                                    System.out.println("This is the correct answer!"); 
                                    CorrectQCount++; //adds one correct question to count
                        }   
                        System.out.println("=====================");
                        questionNumber++; 
                        break; 
    }
}

// Last Feedback bit - correct, incorrect count and percentage 
        System.out.println("=====================");
        System.out.println("Questions Correctly answered: " + CorrectQCount ); //prints correct count 
        System.out.println("Questions Incorrectly answered: " + IncorrectQCount); //prints incorrect count 
        System.out.println("Percentage of correct answers: " + (((double) CorrectQCount / 5) *100) + "%"); //finds percentage 
        //casting so it actually calcualtes 
        System.out.println("=====================");

    }
 }