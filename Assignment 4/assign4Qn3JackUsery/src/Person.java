/*
This program creates a Person class that has a name, address, phone number, and email address.

@Author: Jack Usery

@Assignment: 4 Qn 3

@Date: 11/09/2020
 */

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;


    // constructor
    public Person() {

        name = "";
        address = "";
        phoneNumber = "";
        emailAddress = "";

    }

    public Person(String name, String address, String phoneNumber, String emailAddress) {

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;

    }

    // accessors

    public String getName() {

        return name;

    }

    public String getAddress() {

        return address;

    }

    public String getPhoneNumber() {

        return phoneNumber;

    }

    public String getEmailAddress() {

        return emailAddress;

    }


    // mutators

    public void setName(String name) {

        this.name = name;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;

    }

    @Override
    public String toString() {

        return "Person [name = " + name + "]";

    }
}
