package HW2;

/*
 * Homework assignment for CS 213
 * Author Shunjie Wan
 */
public class Person {
    String FirstName;
    String LastName;
    String StreetName;
    String State;
    int Zip;
    String Telephone;

    public Person(String  firstName, String lastName, String streetName, String state, int zip, String telephone) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.StreetName = streetName;
        this.State = state;
        this.Zip = zip;
        this.Telephone = telephone;
    }


    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getStreetName() {
        return this.StreetName;
    }

    public void setStreetName(String streetName) {
        this.StreetName = streetName;
    }

    public String getState() {
        return this.State;
    }


    public void setState(String state) {
        this.State = state;
    }

    public int getZip() {
        return this.Zip;
    }

    public void setZip(int zip) {
        this.Zip = zip;
    }

    public String getTelephone() {
        return this.Telephone;
    }

    public void setTelephone(String telephone) {
        this.Telephone = telephone;
    }
}
