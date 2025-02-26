/* Program: Classes homework turn in
    + create a class 
    + pizza class 
        + attributes 
            + pizza size (1 - small, 2 - medium, 3 - large)
            + how many toppings 
            + how many drinks 
            + drink size (1 - small, 2 - medium, 3 - large)
                - Lets assume if people order more than 
                    1 drink it’s going to be the same 
                    size for simplicity
        + methods / behaviors (usually public)
            + ordering / writing down 
            + calculate total cost 
                + pizza size (1 - $10, 2 - $15, 3 - $20)
                + $ = toppings * 0.75
                + drink size (1 - $1.99, 2 - $2.99, 3 - $3.99)
                    total drink size = drink amount * drink size
    + Main: 
        + conductor of orchestra, 
        + write instance and call methods   

 */

import java.util.Scanner; //imported for ordering methods

public class Pizza {
    private int pizzaSize; //recorded pizza size
    private int toppingAmount;  //recorded amount topings
    private int drinkAmount; //recorded drink amount 
    private int drinkSize; //recorded drink size 

    private double TotalDrink = 0; 
    private double PizzaTotal = 0; //to add to and return for later within this program 
 

    public void CustomerOrder(){ //makes public and void so it returns and scans stuff
        Scanner reader = new Scanner(System.in); //sets up the reader and menu
        System.out.println("""
                ------Menu------
                pizza 
                    1 - Small pizza = $10 
                    2 - Medium pizza = $15 
                    3 - Large pizza = $20 

                drink                
                    1 - Small drink = $1.99
                    2 - Medium drink = $2.99 
                    3 - Large drink = $3.99 

                """);
//variable assignment from reader 
        System.out.println("How big is your pizza? (1/2/3): ");
        pizzaSize = reader.nextInt();

        System.out.println("How many toppings: ");
        toppingAmount = reader.nextInt();

        System.out.println("How many drinks: ");
        drinkAmount = reader.nextInt();

      
        System.out.println("How big is your drink? (1/2/3): ");
        drinkSize = reader.nextInt();

    }

    public double PizzaPrice(){



        switch(pizzaSize){ // adjusting for pizza size
            case 1: //if this is a small, then 
            PizzaTotal += 10; // add $10 to total/ set price to $10 
            break; //break from it 

            case 2: // if it is medium then 
            PizzaTotal += 15;// add $15 to the total price
            break; //break from it

            case 3: //if it is large then
            PizzaTotal += 20; //add $20 to the total price
            break;

        }

        PizzaTotal += (0.75 * toppingAmount); //adds the topping amount to the total 

        return PizzaTotal;
    }

    public double DrinkPrice(){

        double RunningDrinkPrice = 0; //to later multiply and add to total 

        switch(drinkSize){ //adjusting for drink size 
            case 1: //if the drink is a small 
            RunningDrinkPrice += 1.99; //set 1.99 to the drink  
            break; 

            case 2: //if the drink is medium 
            RunningDrinkPrice += 2.99; // set 2.99 per drink
            break; 

            case 3: //if the drinks are large 
            RunningDrinkPrice += 3.99; //set 3.99 per drink
            break;

        }

        TotalDrink +=  (RunningDrinkPrice * drinkAmount); //updates the price to the drink size and the drink amount

        return TotalDrink; //returns total price

    }

    public double LazyPersonCalculator(){ //calculates everything in one function so i don't have to call so many clases
         
        double drinkStorage = DrinkPrice(); //drink price
        double PizzaStorage = PizzaPrice(); //piza price
        double TotalFR = drinkStorage + PizzaStorage; //add em

        return TotalFR; //the total price

    }


    public void GetTotalPrice(){ //making it cute

        double realTotalPrice = LazyPersonCalculator(); //setting value

        System.out.println("----------recipt----------"); //self explaintory 
        System.out.println("Number of Pizza's: 1");
        System.out.println("\t Price per pizza: $"+ pizzaSize);
        System.out.println("Number of Drinks: "+ drinkAmount);
        System.out.println("\t Price per drink $"+ drinkSize);
        System.out.println("____________________________");
        System.out.println("Total: $"+ realTotalPrice );
    }



    
}
