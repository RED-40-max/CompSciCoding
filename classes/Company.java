
/* Program: Classes programming assignment turn in
    + Create a 'employee' class 
        + var: 
            + Employee ID number
            + Salary
            + Years at the company
        + Methods 
            + NewEmployee - reads ID, salary, and years of experience 
            + Aniversiry - updates year by 1 
            + Raise - reads in percentage raise and calculates new salery 
            + Bonus - yearly bonus based on service (one time / salery change)
                + 5% - if been there for 0-10 
                + 10% - if been there for 10 years
            + Reading - method that reads info and allows user to select method
    + Main method 
        + instance of Employee class 
        + call method that reads in info 
        + Loop the main / selection process 
 */

import java.util.Scanner; //this scans in and reads the users input

public class Company {

    private static int employeeID ; //assuming the ID is already known by user
    private double salary; //assuming this is yearly 
    private int YearsAtCompany; //assuming this is experience / years of service within the indestry 

    Scanner reader = new Scanner(System.in);  //setting up outside so anything that needs to read can be accessed

    //an inital reader for reading in an ID, salary, and years of service 
    public void NewEmployee(){ 
        //Scanner set up
            //prompt, read, and record 
                //ID 
                System.out.println("Enter new employee's ID: "); 
                employeeID = reader.nextInt();
                //Salary 
                System.out.println("Enter new Employee's Salary: "); 
                salary = reader.nextDouble();
                //years of service / experience 
                System.out.println("enter new employee's years: "); 
                YearsAtCompany = reader.nextInt();
                ReturnAllValues(); //returns the inputed values
    
    }

    //to update the year
    public int Aniversiry(){
        YearsAtCompany += 1; //adds one to the years
        return YearsAtCompany; //returns the years
    }
    //raises the salary based on the percentage input
    public double Raise(double PercentageRaise){ 
        double ExtraMoney =  salary * (PercentageRaise/100); //calculating how much extra money the employee gets
        salary += ExtraMoney; //adding the extra money into the salary 
        return salary; //returning the updated salery 
    }
    //calculating the bonus and adds to the salary
    public double Bonus(){ //assuming the get a bonus every 10 years 
        double ExtraMoney ; //local variable for bonus extra money 
        if (YearsAtCompany < 10){
            ExtraMoney =  salary * 0.5; //calculating how much extra money the employee gets
            salary += ExtraMoney; //adding the extra money into the salary 
            return salary; //returning the updated salery 

        } else { //else if they've been here for over 10 years, they get this
            ExtraMoney = salary * 0.10; //calculating how much extra money the employee gets
            salary += ExtraMoney; //adding the extra money into the salary 
            return salary; //returning the updated salery 
        }
    }

    //a class to show the updates to the user each time something is done. 
    public void ReturnAllValues(){

        System.out.println("Employee ID number: " + employeeID ); //shows ID
        System.out.println("Employee Salary: $" + salary ); //shows salary
        System.out.println("Employee Years at the company: " + YearsAtCompany ); //shows years at company


    }
    //method that allows for updates
    public void Update(){
        int UserChoice; // setting variable for user's choice
        System.out.println("""
            ----------Actions----------
            1 - View Employee data 
            2 - Update the Year 
            3 - give a raise 
            4 - give a bonus                 
                """); 

        System.out.println("What would you like to do today? (1/2/3/4): ");
            UserChoice = reader.nextInt(); //records the User's choice
        
            switch(UserChoice){
                case 1: 
                    ReturnAllValues(); //returns all the values to view data 
                    break; 

                case 2: 
                    Aniversiry(); //updates the aniversiry 
                    ReturnAllValues(); //then returns the updated info 
                    break; 
                case 3: 
                    System.out.println("By what percentage would you like to raise it? (/100) "); 
                    double RaisePercent = reader.nextInt(); //sets the raise percentage to the reader's input
                    Raise(RaisePercent); // sends the value 
                    ReturnAllValues(); //returns updated info
                    break; 
                case 4: 
                    Bonus(); //finds the bonus and do it
                    ReturnAllValues(); //then returns the updated info 
                    break;

            }
         



    }
}
