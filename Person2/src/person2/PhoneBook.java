package person2;

public class PhoneBook {

    Person2[] PBList;
    int size;

    public void PhoneBook() {
        size = 0;
        PBList = new Person2[100];
    }

    public void addPerson(Person2 P) {
        PBList[size]=P;
        size++;
    }
    public void printEntries

}
