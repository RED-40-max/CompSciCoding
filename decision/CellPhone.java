
// /* Program: Page 227, Question 4

// Write a program for cell phone service
//     Prompt for: 
//         + maximum monthly values for talk minutes used
//         + text messages sent
//         + gigabytes of data used
//         + then recommend the best plan for the 
//         customer’s needs

//     Logic: 
//         + Plan A ($49/mo): <500 minutes of talk, no data, no text  gyatt sigma
//         + Plan B ($55/mo): <500 minutes of talk, no any text 
//         + Plan C ($61/mo): >= 500 minutes of talk, no data
//             up to 100 text msg
//         + Plan D ($70/mo): >= 500 minutes of talk, no data
//             100 text messeges or more     
//         + Plan E ($79/mo): any data 
//             up to 3 GB
//         + Plan F ($87/mo): any data 
//             3 GB or more (<=)
// */
// import java.util.Scanner ;

// public class CellPhone {
//     public static void main(String[] args){
// //Storing values 
//     //Talk minutes used reading, prompting, recording 
//         Scanner TalkMinReader = new Scanner(System.in); // Setting up the reader  
//         System.out.println("Enter Monthly Talk Minutes: "); // prompting the user 
//         int TalkMinValue = TalkMinReader.nextInt(); // read next int and record the MSG

//     //Text messages used reading, prompting, recording 
//         Scanner TextReader = new Scanner(System.in); // Setting up the reader 
//         System.out.println("Enter Monthly Text Messege: "); // prompting the user 
//         int TextMsgValue = TextReader.nextInt(); // read next int and record the MSG
    
//     //Gigabytes of data used reading, prompt, recording 
//         Scanner GB_dataReader = new Scanner(System.in); // Setting up the reader  
//         System.out.println("Enter Monthly GB of data used: "); // prompting the user 
//         double GB_data = GB_dataReader.nextDouble();
// //inital base print response 
//         System.out.println(" Thank you for Selecting Horizon Phones. \nyour ideal Plan based on you're monthly plan is:");

// // If cascade
//     //500 min or less AND no data 
//     if ((TalkMinValue < 500) && (GB_data == 0)) { 
//         if (TextMsgValue == 0) { //if no messeges = plan A
//             System.out.print("Plan A ($49/mo)");
//         } 
//         else { //otherwise plan B 
//             System.out.print("Plan B ($55/mo)");
//         }
//     }

//     // 500 or more minutes AND No data
//     else if ((TalkMinValue >= 500) && (GB_data == 0)) { 
//         if (TextMsgValue < 100) { //if less then 100 msg then plan c 
//             System.out.print("Plan C ($61/mo)");
//         } else { //otherwise plan B
//             System.out.print("Plan D ($70/mo)");
//         }
//     } 

//     // Any data usage at all 
//     else if (GB_data > 0) { 
//         if (GB_data < 3) { //less then 3GB is plan E 
//             System.out.print("Plan E ($79/mo)");
//         } 
//         else { // otherwise is equal to 3GB
//             System.out.print("Plan F ($87/mo)");
//             }
//         }

//     }

// }
// //ITS OVER!!! the cascade was ...
// // a process. 
// // but i got it eventually!