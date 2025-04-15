package Abstract_Interface;



public interface LockInterf {
    public void SetPassword(String Password); 
        //recives the password
        //impliments it / takes the password to the variable 
        //then says that setting password is complete 
        //call lock doc 
    public void CheckPassword(); 
        //loop 
            //asks user to guess password 
            //checks password 
            //if true --> password correct --> call UnlockDoc and exit from class loop 
            //if false --> password incorrect --> prints to keep going untill password is correct

    public boolean LockDoc(); 
        //locks document after set password automatically 
        //prints messege only 

    public boolean UnlockDoc(String passwordGuess); 
        //prints messege only 

    
}
