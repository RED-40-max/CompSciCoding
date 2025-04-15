/* Program: Interface turn in #2

THIS IS THE ABSTRACT CLASS DOCUMENT 

    + #3
        + create a program that uses abstract class to impliment combo lock 
        + start setting combo and locking lock 
        + be able to see if it is lock 
        + can try to unlock using combo 
        + print messege 
 
 */

public abstract class IComboLock 
{
    public boolean locked;
    public int[] lockedUP = new int[3];

    // method will set the combination of a lock
    abstract public void setcombo(int num1, int num2, int num3);

    public boolean isLocked()
    {
    return locked;
    }

    // method will check to see if the combination matches. If yes it will
    // unlock the lock, if no it will leave it locked.

    abstract public void unlock(int num1, int num2, int num3);
    
    public void lock()
    {
    locked=true;
    }
}
    