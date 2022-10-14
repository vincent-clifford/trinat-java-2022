package l01.etutorial5punkt0;

import java.util.*;
import java.text.*;
public class Person {
    private String firstName;
    private String lastName;
    private String addressStreet;
    private int addressNumber;
    private int addressPlz;
    private String city;
    private GregorianCalendar dob;

    //constructors
    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
    }
    public Person(String firstName, String lastName, String addressStreet, int addressNumber, int addressPlz, String city, GregorianCalendar dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressStreet = addressStreet;
        this.addressNumber = addressNumber;
        this.addressPlz = addressPlz;
        this.city = city;
        this.dob = dob;
    }
    //methods
    public void print() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd. MMMM yyyy");

        System.out.println(firstName + " " + lastName + "\n" + age() + " Jahre alt.");
        System.out.println("Date of birth: " + simpleDateFormat.format(dob.getTime()));
        System.out.println(addressStreet + " " + addressNumber + "\n" + addressPlz + " " + city + "\n");
    }
    public int age() {
        GregorianCalendar today = new GregorianCalendar();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }
    public void setAddressNumber(int addressNumber) {
        this.addressNumber = addressNumber;
    }
    public void setGetAddressPlz(int getAddressPlz) {
        this.addressPlz = getAddressPlz;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDob(GregorianCalendar dob) {
        this.dob = dob;
    }
    //getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddressStreet() {
        return addressStreet;
    }
    public int getAddressNumber() {
        return addressNumber;
    }
    public int getGetAddressPlz() {
        return addressPlz;
    }
    public String getCity() {
        return city;
    }
    public GregorianCalendar getDob() {
        return dob;
    }
}