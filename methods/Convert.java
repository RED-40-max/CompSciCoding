/* Program:  Methods #1 Turn In Fall 2021    + Menu to pick unit conversion 
    + User choose from 
        1) feet to inches
            1ft = 12 in
        2) centimeters to inches
            1 cm = 0.393701 in
        3) miles to meters
            1 mi = 1609.34 m 
        4) miles to feet
            1 mi = 5280 ft
        5) pounds to ounces
            1lb = 16 oz
        6) kilowatts to horsepower
            1 kW = 1.34102 HP
    + Read in value and display converted value 
    
conversions needed: 
    1 mile = 5280 ft
    1 lb = 16 oz
    1 km = 0.62137119 mile
    1 in = 2.54 cm
    1kW = 1.341003 hp

 
 */
import java.util.Scanner; //scanner tool 

public class Convert {

    private static final int MenuSelection = 0;
        public static void main(String[] args){
    
            //scanner set up 
            Scanner reader = new Scanner(System.in);
            int MenuSelection = 7 ; //just to m
            
            while(MenuSelection != 0){ // to make it easier, instead of running it each time

        //Menu - Prompt, read, and store 
        System.out.println("""  
                             choose from: 
                                   1) feet to inches
                                   2) centimeters to inches
                                   3) miles to meters
                                   4) miles to feet
                                   5) pounds to ounces
                                   6) kilowatts to horsepower 
                                   0) to exit 
                                   """ ); 
        /* a textblock (""" """); 
            this is a text block - in newer versions of java, it is a 
            mutti-line string literal in the X3 quotes.
                it makes copying and printing a mutli-line menu SOOO MUCH EASIER OMG 
                THANK VS CODE FOR THIS GODSEND.
            so by creating this 'multi-line string literal' i can print out the menue as it is 
            formatted within this block / as we see it in code. 

            *-----* I solemnly swear that I implimented this solution with the intent to learn 
            through my own efforts, googled it, and understand what it is and 
            what it dose for this perticular instance within this program. *-----*
        */     

        System.out.println("Enter Conversion type (1/2/3/4/5/6): ");
         MenuSelection = reader.nextInt(); //setting up the menu selection for this instance

//change up maybe 
        System.out.println("Write the number: "); 
        double InputNum = reader.nextInt(); //reading the conversion number 

    //switch for the methods and whatnot 
        switch(MenuSelection){ 
            case 1: 
                Ft_In(InputNum); //calls in feet to inches with the number and returns becuse of the method and breaks, same for the rest 
                break;

            case 2: 
                Cm_In(InputNum); 
                break; 

            case 3: 
                Mi_M(InputNum);
                break; 

            case 4: 
                Mi_Ft(InputNum);
                break; 

            case 5:
                Lb_Oz(InputNum);
                break; 

            case 6: 
                kW_HP(InputNum);
                break;

            default: 
                System.out.print("something went wrong, try again") ;
        }
        System.out.println(" Exiting ");
           
        }

    }
       /* basic format for a method 
                 public static ClassName (param1, param2){
                 local var 
                 statements 
                 return //if not void 
                 }
        */ 
 //feet to inches - 1ft = 12 in       
    public static void Ft_In(double feet){
        double Inches = feet*12 ; 
        System.out.println(feet + " Feet is " + Inches + " Inches"); 
    }    
//centimeters to inches - 1 cm = 0.393701 in

    public static void Cm_In(double centimeters){
        double Inches = centimeters *  0.393701 ; 
        System.out.println(centimeters + " Feet is " + Inches + " Inches"); 
    }   
//  miles to meters - 1 mi = 1609.34 m 
    public static void Mi_M(double Miles){
        double Meters = Miles * 1609.34 ; 
        System.out.println(Miles + " Miles is " + Meters + " Meters"); 
    }   
// miles to feet - 1 mi = 5280 ft
    public static void Mi_Ft(double Miles){
        double Feet = Miles * 5280 ; 
        System.out.println(Miles + " Miles is " + Feet + " Feet"); 
    }  
// pounds to ounces - 1lb = 16 oz
    public static void Lb_Oz(double Pounds){
        double Ounces = Pounds * 16; 
        System.out.println(Pounds + " pounds is " + Ounces + " oz"); 
    }
// kilowatts to horsepower - 1 kW = 1.34102 HP
    public static void kW_HP(double killowatts){
        double HorsePower = killowatts * 16; 
        System.out.println(killowatts + " killowatts is " + HorsePower + " HorsePower"); 
    }

}

