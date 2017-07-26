package person2;

public class Person2 {

    String firstName, lastName, phoneNumber;
    int age;
    boolean isAStudent;
    double height;

    public Person2(String newFirstName, String newLastName, String newPhoneNumber)

    {
        firstName = newFirstName;
        lastName = newLastName;
        phoneNumber = newPhoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
