package FileIO;
//numbers 


import java.io.*;
import java.util.Scanner;

public class FileIO2 {
public static void main(String[] args) throws IOException {
int[] numbers = new int[2];
Scanner FileScan;
FileScan = new Scanner(new File("Test.txt"));
int x = 0;
while (FileScan.hasNext())
{
numbers[x] = FileScan.nextInt();
x++;
}
PrintWriter writer = new PrintWriter(new File("Test2.txt"));
for (int y = 0; y < x; y++)
{
System.out.println(numbers[y]);
writer.println(numbers[y]);
}
writer.close();
FileScan.close(); 
}
}

  /* the loop and functions 
            + first it reads in a string / the next line from the user 
            + blank string - this blank string will soon become a full / final result 
            + the array of Charecters makes it so that you can set a certain amount of vowels that 
            the loop can circle throught 
    
            + for( int x = 0; x < Vowels.length ; x++ ){
                string1 = OGInput.replace(Vowels[x], ' ');
    
            }
                -> the first charecter, 'a' is set as the one to be replaced 
                    -> the string1 runs thorught the entire input string and removes
    
            System.out.println(string1); 
            
     */
    
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

