package classes;
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

//for the reading functions

public class MainPizza {

    public static void main(String[] args){
        Pizza pizzaorder = new Pizza(); 

        pizzaorder.CustomerOrder(); //calls the ordering method 
        pizzaorder.GetTotalPrice();// calls the returning / recipt method


//hi


    }
    


    
}
