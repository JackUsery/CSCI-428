/*
This is the junior class that extends the full time employee class. It has a mentor and a rank.

@Author: Jack Usery

@Assignment: 4 Qn 3

@Date: 11/09/2020
 */

public class Junior extends FullTimeEmployee {

    private String mentor;
    private String rank;



    // constructor
    public Junior() {

        mentor = "";
        rank = "";
    }

    public Junior(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired, String mentor, String Rank) {

        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.mentor = mentor;
        this.rank = Rank;

    }

    // accessors
    public String getMentor() {

        return mentor;

    }

    public String getRank() {

        return rank;

    }


    // mutators

    public void setRank(String Rank) {

        this.rank = rank;

    }

    public void setMentor(String mentor) {

        this.mentor = mentor;

    }

    // toString
    @Override
    public String toString() {
        return "Junior  [name = " + getName() + "]";
    }

}
