/* Program: Switch Statements #1 
    + Write a program that will read: 
        - in a month 
        - a year
    + print out: 
        - the number of days in that month.  
 */

import java.util.Scanner; //importing the scanner tool 

public class Date {
    public static void main(String[] args){
//Month number - Set up, prompt, read, and store 
    Scanner readerMonth = new Scanner(System.in); // seting up scanner 
    System.out.println("What number is the Month?"); // prompt user
    int MonthNumber = readerMonth.nextInt(); //store the next integer 

//Year Number - Set up, prompt, read, and store 
        Scanner readerYear = new Scanner(System.in); //setting up the scanner
        System.out.println("What is the Year?");  // prompting the user 
        int YearNumber = readerYear.nextInt(); //Storing the next integer

//Testing for Leap year 
        boolean isLeapYear = (YearNumber%4 == 0);

  /* Sort months based on days for less writing 
                31 days: january, march, may, july, august, october, decemeber 
                30 days: april, june, september, novemebr 
                28 days: febuary  
                    if leap year then is 29 days
                    else is 28.   */       

//switch case cascade 
        switch(MonthNumber){

//months with 31 days             
            case 1: //january 
            case 3: //march 
            case 5: //may 
            case 7: //july 
            case 8: //august 
            case 10: //october 
            case 12: //december 
                System.out.println("This Month has 31 days");
                break; 

// months with 30 days 
       
            case 4: //april
            case 6: //june 
            case 9: //september 
            case 11: //november  
                System.out.println("This Month has 30 days"); 
                break; 

//other months (febuary), also if leap year is 29 days. otherwise is 28 days
            case 2: 
                if (isLeapYear){
                    System.out.println("During leap years, Febuary has 29 days");
                   
                }
                else {
                    System.out.println("Febuary has 28 days");
                }
                break;
        }






    }
    
}
