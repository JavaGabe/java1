package person2;

public class PhoneBook {

    Person2[] PBList;
    int size;

    public PhoneBook() {
        size = 0;
        PBList = new Person2[100];
    }

    public void addPerson(Person2 P) {
        PBList[size++] = P;
        
    }

    public void printEntries() {
        for (int i = 0; i < size; i++) {
            System.out.println(PBList[i].getFirstName() + " " + PBList[i].getLastName() + ", " + PBList[i].getPhoneNumber());
        }
    }

}
