/* Program: Interface #1 turn in 

THIS IS THE INTERFACE DOCUMENT 

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

public interface PhoneBook {
    public void ReadInfo();
    public String FindNumber(String name);
    public String FindName(String phonenumber);
    }
