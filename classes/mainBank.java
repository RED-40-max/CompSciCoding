package classes;
public class mainBank {

    public static void main(String[] args){
        Bank WellsFargo = new Bank(); 
        double value = WellsFargo.deposit(30.00); 
        System.out.println(" You deposit: $30.00"); 
        System.out.println(" Your amount is: "+ value); 

    }
    
}
