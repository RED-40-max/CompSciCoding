/* Program from Variables & Math Prob 2: 
Write a program that will: 
        - Read a Sphere's Radius (r) 
    then calculate Sphere's:
        - diameter - (2r)
        - circumference - (2*pi*r)
        - surface area - (4*pi*r^2)
        - volume  - ((4/3)*pi*(r^3))
make all numerical values doubles. 
 */

 import java.util.Scanner; // imports a scanner to help read terminal inputs

 public class Sphere { // this class calculates the Sphere Dimentions
     public static void main(String[] args) {
     //reading    
        var GivenRadius = new Scanner(System.in); // creating a scanner Radius
         System.out.println("enter your Radius: "); //create a prompt for user
         double Radius = GivenRadius.nextDouble(); //read the Radius on the next line
     //calculations        
         double pi = 3.14159; //define pi, 3.14159 works better then 22/7
         double Diameter = Radius*2; //find diameter = radius * two
         double Circumfrance = 2*pi*Radius; //the Circumfrance is 2(pi)r so this is what defines this
         double SurfaceArea = 4*pi*(Math.pow(Radius, 2)); //this is the SurfaceArea defined by 4*(pi)*(r^2)
             /*the Math.pow is a method that takes the first input to the power of the seocond input
             for SurfaceArea it is Radius Squared, for volume it is Radius Cubed */
         double Volume = ((4.0/3.0))*pi*(Math.pow(Radius, 3)); //the volume is (4/3)*pi*r^3
            /*has to be 4.0 / 3.0 since it only takes doubles so there must be a decimal or somthing
            idk, i think that's why it has to be like that*/
        
     // Writing - writes out stored / calculated values 
         System.out.println("Radius: "+ Radius); //Writes out the Radius
         System.out.println("Diameter: "+ Diameter); //Writes out Diameter
         System.out.println("Circumfrance: "+ Circumfrance); //Writes out circumfrance
         System.out.println("Surface Area: "+ SurfaceArea); // writes out surface area
         System.out.println("Volume: " + Volume); // writes out volume 
        
        
     }
 }
 