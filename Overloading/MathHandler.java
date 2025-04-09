package Overloading;
/* Program: Overloading #1 Turn in 
    + can add, subtract, multiply or divide 2 numbers 
    + all method overloaded to handle int, float, or doubles

 */

import java.util.Scanner; // to scan 

public class MathHandler {

    public static void main(String[] args)
    {
        //scanner 
        Scanner reader = new Scanner(System.in); 
        System.out.println("do you want \n 1 - (int) \n 2 - (double) \n 3 - (float) \n Enter type:"); 
        int ChoiceNum = reader.nextInt(); //reads in the choice 
        
        switch(ChoiceNum) //intilizes the variable type based on the type of math they want to do
        {
            case 1: //if the user wants to do integer math 
                System.out.println("what type of math \n 1 - (add) \n 2 - (subtract) \n 3 - (multipy) \n 4 - (divide) \n Enter type:"); 
                //to me it makes more sense to ask what kind of math then the numbers in the euqation
                int ChoiceMath = reader.nextInt(); //this thing 
                System.out.println("enter your first number in the equation:"); //prompts user
                int Num1 = reader.nextInt(); //initlize interger var 
                System.out.println("enter second number in equation: "); //prompts user
                int Num2 = reader.nextInt(); 
                //decides what method to use - add, subtraact, multiply or divide
                    switch(ChoiceMath)
                    {
                        case 1: 
                            AddNum(Num1,Num2); //calls the add method and uses int variable
                            break; 
                        case 2: 
                            SubNum(Num1,Num2); //calls the subtract method and uses int variable
                            break;
                        case 3:
                            MultNum(Num1,Num2); //calls the multiple method and uses int variable
                            break;
                        case 4: 
                            DiviNum(Num1,Num2); //calls the divide method and uses int variable
                            break; 
                        default: 
                            System.out.println("error"); //ends in an error 
                            break;

                    }
                
                break; 
            case 2:  //doubles, similar to case 1, but uses doubles instead
                System.out.println("what type of math \n 1 - (add) \n 2 - (subtract) \n 3 - (multipy) \n 4 - (divide) \n Enter type:"); 
                     ChoiceMath = reader.nextInt(); //this thing 
                System.out.println("enter your first number in the equation:"); 
                double DNum1 = reader.nextDouble(); //initlize interger var 
                System.out.println("enter second number in equation: "); 
                double DNum2 = reader.nextDouble(); 
                    switch(ChoiceMath)
                    {
                        case 1: 
                            AddNum(DNum1,DNum2); //calls the add method and uses double variable
                            break; 
                        case 2: 
                            SubNum(DNum1,DNum2); //ect.
                            break;
                        case 3:
                            MultNum(DNum1,DNum2); 
                            break;
                        case 4: 
                            DiviNum(DNum1,DNum2); 
                            break; 
                        default: 
                            System.out.println("error"); 
                            break;

                    }
                break;
            case 3: //floats, same as case 1 and 2, but uses floats instead 
                System.out.println("what type of math \n 1 - (add) \n 2 - (subtract) \n 3 - (multipy) \n 4 - (divide) \n Enter type:"); 
                ChoiceMath = reader.nextInt(); //this thing 
                System.out.println("enter your first number in the equation:"); 
                float FNum1 = reader.nextFloat(); //initlize interger var 
                System.out.println("enter second number in equation: "); 
                float FNum2 = reader.nextFloat(); 
                    switch(ChoiceMath)
                    {
                        case 1: 
                            AddNum(FNum1,FNum2); //calls the add method and uses double variable
                            break; 
                        case 2: 
                            SubNum(FNum1,FNum2); //ect. 
                            break;
                        case 3:
                            MultNum(FNum1,FNum2); 
                            break;
                        case 4: 
                            DiviNum(FNum1,FNum2); 
                            break; 
                        default: 
                            System.out.println("error"); 
                            break;
        }
       

    }
}



//additions 

    //integer addition 
    public static void AddNum(int a, int b)
    {
        System.out.print(" " + a + "+" + b + " = ");
        System.out.println( a + b); 
    }

    //double addition 
    public static void  AddNum(double a, double b)
    {
        System.out.print(" " + a + "+" + b + " = ");
        System.out.println( a + b); 
    }
    //float addition 
    public  static void  AddNum(float a, float b)
    {
        System.out.print(" " + a + "+" + b + " = ");
        System.out.println( a + b); 
    }
//subtraction 
    //we assume that a is the first number in the equation and b is the second number 
    //integer subtraction 
    public static void SubNum(int a, int b)
    {
        System.out.print(" " + a + "-" + b + " = ");
        System.out.println(a - b); 
    }
    //double subtraction 
    public static void SubNum(double a, double b)
    {
        System.out.print(" " + a + "-" + b + " = ");
        System.out.println(a - b); 
    }
    //float subtraction 
    public static void SubNum(float a, float b)
    {
        System.out.print(" " + a + "-" + b + " = ");
        System.out.println(a - b);
    }
//multplication 
    //integer multiplication
    public static void MultNum(int a, int b)
    {
        System.out.print(" " + a + "*" + b + " = ");
        System.out.println(a * b); 
    }
    //double multiplication 
    public static void MultNum(double a, double b)
    {
        System.out.print(" " + a + "*" + b + " = ");
        System.out.println(a * b); 
    }
    //float mulitplication 
    public static void MultNum(float a, float b)
    {
        System.out.print(" " + a + "*" + b + " = ");
        System.out.println(a * b); 
    }
//division 
    //we assume that a is the first number in the equation and b is the second number 
    // (a / b) 
    //integer division 
    public static void DiviNum(int a, int b)
    {
        System.out.print(" " + a + "/" + b + " = ");
        System.out.println(a / b); 
    }
    //double division 
    public static void DiviNum(double a, double b)
    {
        System.out.print(" " + a + "/" + b + " = ");
        System.out.println(a / b); 
    }
    //float division 
    public static void DiviNum(float a, float b)
    {
        System.out.print(" " + a + "/" + b + " = ");
        System.out.println(a / b); 
    }
    
}

