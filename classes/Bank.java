package classes;
//see main bank for details 

import java.util.Scanner; //for the recording method 

//general rule, variables are private and methods are public 

public class Bank { 
//class variables
    private double balence; 
    private double amount; 

//constructor, initlize variables 
public Bank(){
    balence = 0; 

}

    public double deposit(double amount){ //creation of a method
        balence = balence + amount ; 
        return balence ; 
    }
    


}
