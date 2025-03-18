package String;
/* Program: Strings #1 TurnIn 
    + Read in a sentence 
    + remove all of the vowels from the sentence.
    + deal with capital letters too.
 
 */
import java.util.Scanner; //for scanning

public record Vow() {

    private static final String OGInput = "";
    
        public static void main(String[] args){
    
    //Scanner 
            Scanner reader = new Scanner(System.in); //setting up the scanner
            System.out.println("Input your sentence");
            String OGInput = reader.nextLine(); //making sure that the string is set to a variable
            String string1 = OGInput.toLowerCase(); //sets all charecters to lower case to make it easier to deal with 


    
   
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'}; //arrays with the vowels within it 
            String StorageString = ""; //makes a blank string
            String OperString = string1; //makes the operating string set to the original one 

     /* the loop and functions 
            + first the loop intlizes a blank string - storage string 
            + the string is then set to the operating string, where we will be doing operations on 
            + the storage string then takes on the edited values of the operating string 
            + the stroage returns the edit values to the operating string and then repeates with the Storage string 
                being turned to blank
            + stopes after it has gone throught the entire vowel array
            */


           for (int x = 0; x < vowels.length; x++){ // loop repeates
            StorageString = ""; //a blank storage string 
            StorageString = OperString.replace(vowels[x], ' '); // replace the set vowel with a blank charecter then give it to the storage string
            OperString = StorageString;  //the operating string takes the new values of the storage string            

           }

           System.out.println(OperString); //after the loop, it print out the final strings 
            
     
        }
    }



    /*hardcoded removing a,e,i,o,u and then printing the entire thing. 
            og string -> remove a -> store in string 0 
            string 0 -> remove e -> store in string 1
            ...
            ...
            
            ect. 
    
    
            String string0 = OGInput.replace('a', ' ');
            String string1 = string0.replace('e', ' ');
            String string2 = string1.replace('i', ' ');
            String string3 = string2.replace('o', ' ');
            String string4 = string3.replace('u', ' ');
            String string5 = string4.replace('y', ' ');
    
            System.out.println(string5); 
            
    */ 

            //String string1 = OGInput.toLowerCase();
            //removeVowels(string1, 0); 
   
        

/* this version bc strings are annoying and 
        + import the string and the index 0 
        + if the index is not finshed / not fully thorught the array 
            + then remove the string's array 
            + send the new string, update the index, and send the new index 
        + send the updated string and updated index to the class again
        + do this until you finish the array


            public static void removeVowels(String string, int index) { //

                char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'}; //arrays with the stuff

                if (index < vowels.length) { //if you havn't gone throught the array 

                    string = string.replace(vowels[index], ' '); // replace the set vowel with a blank charecter
                    removeVowels(string, index + 1); //carry over the updated, and index 

                } else {
                    System.out.println(string); //print out the final strings 
            }
        }
        */
