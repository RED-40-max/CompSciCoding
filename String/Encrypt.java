package String;
/* program: Strings #3 turn in 
    + write a program that will encrypt and decrypt a sentence 
    + using a Cipher of 5 
        (each letter is replaced with 5 down from it in the alphebet 

      //"V", "W", "X", "Y", "Z" - special since can't run properly with array   
 */

import java.util.Scanner;

public class Encrypt {
     private static char[] CharAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
    //makes the alphabet in array 

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("input your sentece"); 
        String OGSentences = reader.nextLine(); // reads the next line to gather string 
        OGSentences = OGSentences.toUpperCase(); //makes it upper case so it's easier for the alphaebt array
        EncryptingM(OGSentences);

    }


//to encrypt it 
    public static void EncryptingM(String OpStr)
    {
       
        String StorageStr = ""; //intilize the storage string 
        for(int x = 0; x < OpStr.length(); x++) //iterating throught the entire stiring one charecter at a time 
        {   
            
            char charEvalv = OpStr.charAt(x); //finding the one charecter 
        
        if(charEvalv != ' '){ //if it is a charecter / not whitespace, then do this 
            int IndexNum = 0; //setting a number for index on iter
            char CharAlph = CharAlphabet[0]; //intilize it your 
            //matching the charecter to the one in the array 

            for (int m = 0; m < CharAlphabet.length; m++) { // find the index of the character in the array 
                if (charEvalv == CharAlphabet[m]) {
                    IndexNum = m;
                    break;
                }
            }
    
            StorageStr += CharAlphabet[(IndexNum + 5) % 26];//stores the new value as the 
                //  the index number with the shift and you take the remainder so that it wraps around so i don't have to do special cases
                //special cases since the array would error out 

        
        } else // otherwise it's probably a space or something so just add that 
        {
            StorageStr += " "; 
        } 
    }

        System.out.println("Encrypted: "+ StorageStr); //prints the newly encrypted sentence
        Decrypt(StorageStr); //the decryption call 
        

    } 

    public static void Decrypt(String OpStr) {
        String StorageStr = ""; // make the storage string so it can hold the stuff

        for (int x = 0; x < OpStr.length(); x++) { // iterate through each char
             
            char charEvalv = OpStr.charAt(x); // gets the first char

            if (charEvalv != ' ') { // if it's not a space then it is good 
            int IndexNum = 0; //setting a number for index on iter
            for (int m = 0; m < CharAlphabet.length; m++) { // find the index of the character in the array 
                if (charEvalv == CharAlphabet[m]) {
                    IndexNum = m;
                    break;
                }
            }
            // shifts back the posistion 5 and adds 26 so that it is strong in the way it fuctions and can reverse it well
            StorageStr += CharAlphabet[(IndexNum - 5 + 26) % 26]; 

            } else {
                StorageStr += " "; // otherwise it's probably a space so you add spaces manually
            }
        }
        System.out.println("Decrypted: " + StorageStr); //writing out the decrypted thing 
    }
}