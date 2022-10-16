package model;

public class Person extends Pieces {
    private String firstname;
    private String lastname;

    public Person(String named, double price, String firstname, String lastname) {
        super(named, price);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFullName(){
        return firstname + " " + lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
