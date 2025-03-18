/* program: String #2 turn in 
    + read in a list of 10 words from a file 
    + make all caps 
    + half them to make two new words
    + write out to a new file 

    for vs code
        + filepaths: 
             String filePath = "input.txt";
             + for organization "folder/file" - the 'reletive path'

 */

import java.io.*; //to read stuff in
import java.util.Scanner; //to do i/o operations 

public class UpSlice {
    
    public static void main(String[] args) throws IOException{

        String readingFile = "ReadFile"; 

       
//read in file
        String[] words = new String[10]; //since there are ten words, make the array 10
        Scanner FileScan; //intalizes the variables 
        FileScan = new Scanner(new File("String/UpSlice-f/" + readingFile + ".txt")); 
        //this scanner variable will hold the ability to scan from the specificied file 

        int counter = 0; //initlize a counting variable 
        while (FileScan.hasNext()) //while there is a line
        {
            words[counter] = FileScan.nextLine(); //read the line and store it in the approprate location within the array 
            words[counter] = words[counter].toUpperCase(); //makes it upper case here so i don't have to make another loop for it
            counter++ ; //shift to the next location in the array 
        }

//writes to the file 
        PrintWriter write = new PrintWriter(new File("String/UpSlice-f/WriteFile.txt")); //sets up the writer and where the file is going to. 
        String HolderVar; //makes the new array twice the size of the last one to store the halved words
     
        for (int OgArrCounter = 0; OgArrCounter < words.length; OgArrCounter++) //iterates throiught the og array / file word count 
        { 
            int length = words[OgArrCounter].length(); //find the length of the word in OG array 
            int midpoint = (length / 2) ; //finds the midpoint of the og array word, by taking the length by half

            HolderVar = words[OgArrCounter].substring(0, midpoint ); //since the substring takes the start and position 1 more then last charecter, leave the midpoint as is 
            write.println(HolderVar); //prints the first half of the word - since is println, it will auto make it next line 

            HolderVar = words[OgArrCounter].substring( midpoint , length ); //substring starts where the other word left off, since the substring +1 ending mechanic and takes the rest of the word 
            write.println(HolderVar); //prints the second half ot the word 
        }

        write.close(); //closes the writer 



    }
    
}
   /* for loop - multiple variables - intilize them outsde then 
            use them within the loop - since the two locations of the OG array and the new array are diffrent 
            then i need to use two diffrent variables. 
            way one: 
                int var 1 ; 
                int var 2 ; 
                for (var 1 = 0, var 2 = 3; test; update var 1, update var2 )
            way two: 
                for (int var 1 = 0, var 2 = 3; test; update var 1, update var2 )
            the updates don't have to be in any perticular order 
         */
