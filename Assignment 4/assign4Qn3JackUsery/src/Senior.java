/*
This program creates a Senior class that extends the FullTimeEmployee class and adds a list of juniors and company stocks.

@Author: Jack Usery

@Assignment: 4 Qn 3

@Date: 11/09/2020
 */




import java.util.ArrayList;

public class Senior extends FullTimeEmployee {

    private ArrayList<Junior> juniorsTeam;
    private double companyStocks;


    // Constructors

    public Senior() {

        juniorsTeam = new ArrayList<Junior>();
        companyStocks = 0.0;

    }

    public Senior(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired, ArrayList<Junior> juniorsTeam, double companyStocks) {

        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.juniorsTeam = juniorsTeam;
        this.companyStocks = companyStocks;

    }



    // Accessors

    public ArrayList<Junior> getJuniorsTeam() {

        return juniorsTeam;

    }

    public double getCompanyStocks() {

        return companyStocks;

    }




    // Mutators

    public void setJuniorsTeam(ArrayList<Junior> juniorsTeam) {

        this.juniorsTeam = juniorsTeam;

    }

    public void setCompanyStocks(double companyStocks) {

        this.companyStocks = companyStocks;

    }

    // toString

    @Override
    public String toString() {
        return "Senior  [name = " + getName() + "]";
    }



}
