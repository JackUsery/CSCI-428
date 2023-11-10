/*
This program creates a FullTimeEmployee class that extends the Person class and adds an office, salary, and date hired.

@Author: Jack Usery

@Assignment: 4 Qn 3

@Date: 11/09/2020
 */

public class FullTimeEmployee extends Person {

    private String office;
    private double salary;
    private String dateHired;

    // Constructors
    public FullTimeEmployee() {

        office = "";
        salary = 0.0;
        dateHired = "";
    }

    public FullTimeEmployee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired) {

        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;

    }

    // Accessors

    public String getOffice() {

        return office;

    }

    public double getSalary() {

        return salary;

    }

    public String getDateHired() {

        return dateHired;

    }

    // Mutators

    public void setOffice(String office) {

        this.office = office;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

    public void setDateHired(String dateHired) {

        this.dateHired = dateHired;

    }

    // toString
    @Override
    public String toString() {

        return "FullTimeEmployee [name = " + getName() + "]";
    }
}
