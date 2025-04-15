/* Program: Interface #1 turn in 

THIS IS THE CLASS DOCUMENT
    + use public interface PhoneBook{}
    + read in list of names and phone number from file
    + look up name and print out phone number or vice versa
 
public interface PhoneBook 
{
    public void ReadInfo();
    public String FindNumber(String name);
    public String FindName(String phonenumber);
}


 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner; 

public class OneFile implements PhoneBook //throw IOException
{
    //an array List to record the Name 
    ArrayList <String> PhoneName = new ArrayList <>(); 

    //another to record the number 
    ArrayList <String> PhoneNumber = new ArrayList <>();

    //this is the method that will read the text file 
    @Override
    public void ReadInfo()
    {
        try { //just so the error dosn't bother me and the IO execption dosn't bther me 
            
            Scanner FileScanner;
            
            FileScanner = new Scanner(new File("RawPhoneBook.txt"));
            //sets the file to read + the path for the file
            
            
            int x = 0; //counter for the array list
            
            while (FileScanner.hasNext()) // a loop to get it all
            {
                String CurrentLine = FileScanner.nextLine(); //reads and stores the current line
                if ( CurrentLine.indexOf("name") != -1) //checks if it contains the key word for name
                {
                    PhoneName.add(CurrentLine.substring(CurrentLine.indexOf(":") + 1).trim());  //then you add the current line's substring to the array
                }
                
                if ( CurrentLine.indexOf("phone") != -1) //checks if it contains the key word for the number
                {
                    PhoneNumber.add(CurrentLine.substring(CurrentLine.indexOf(":") + 1).trim()); //then you add the current line's substring to the array
                    x++; //the way that the document is formatted, - name then phone number, i can have the name run regularly,
                    //but in order for it to be paralell, this line will run and incriment x
                }
                
            }
        } catch (FileNotFoundException ex) {
        }



    }

    //method that finds the number when given the name
    @Override
    public String FindNumber(String Name)
    {
        ReadInfo(); //reads the info 

        //iterates throught the name list to see if there is a match 
        for(int x = 0; x < PhoneName.size(); x++)
        {
            if(PhoneName.get(x).equalsIgnoreCase(Name)) //if there is a match, then
            {
               return PhoneNumber.get(x);
                //return the number of the parallel array 
            }
            

        }
        //otherswise the name has not been found
        return "Name Not Found"; 

    }

    //this method finds the name given the number 
    @Override
    public String FindName(String phonenumber)
    {
        ReadInfo(); //reads the info 

        for(int x = 0; x < PhoneNumber.size(); x++) //loops throught the array of phone numbers to find it
        {
            if(PhoneNumber.get(x).equalsIgnoreCase(phonenumber)) //if there is a match, then
            {
                
                return PhoneName.get(x); 
                //return the number of the parallel array 
            }
           

        }
        //otherwise the number has not been found 
        return "Number Not Found"; 

    }

    
}
