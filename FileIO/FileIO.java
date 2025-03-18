package FileIO;
//for strings 
import java.io.*; //scanner 
import java.util.Scanner; 


public class FileIO {

    /*throws execption givs you an error telling you can't find a file 
    during runtime, fix by doing htis after main 
    throws IOException  
    */
    public static void main(String[] args) throws IOException{
        String[] words = new String[2];

        try {
            Scanner FileScan = new Scanner(new File("Test.txt"));

        int x = 0; 
        while(FileScan.hasNext())
        {
            words[x] = FileScan.nextLine(); 
            x++ ; 

        }
        PrintWriter writer = new PrintWriter(new File ("Test2.text"));

        for(int y = 0; y<x; y++ )
        {
            System.out.println(words[y]);
            writer.println(words[y]);

        }
        writer.close(); 

    } catch (FileNotFoundException e) {

        System.err.println("Error: File 'Test.txt' not found."); // Handle the error

        return; // Exit the program if file not found

    }
 

    }
    
    
}
