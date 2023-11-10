/*
This is the PartTimeEmployee class. It extends the Person class and adds a classStatus and payRate

@Author: Jack Usery

@Assignment: 4 Qn 3

@Date: 11/09/2020
 */



public class PartTimeEmployee extends Person{


    public static final String classStatusRegular = "Regular";
    public static final String classStatusSeasonal = "Seasonal";
    public static final String classStatusOnCall = "On-Call";
    public static final String classStatusContractor = "Contractor";

    private String classStatus;
    private double payRate;


    // Constructors
    public PartTimeEmployee() {
        classStatus = "";
        payRate = 0.0;
    }

    public PartTimeEmployee(String name, String address, String phoneNumber, String emailAddress, String classStatus, double payRate) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
        this.payRate = payRate;
    }



    // Accessors

    public String getClassStatus() {
        return classStatus;
    }

    public double getPayRate() {
        return payRate;
    }


    // Mutators

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    // toString
    @Override
    public String toString() {
        return "PartTimeEmployee  [name = " + getName() + "]";
    }
}
