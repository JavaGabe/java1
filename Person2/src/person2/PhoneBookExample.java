package person2;

public class PhoneBookExample {

    public static void main(String[] args) {
        String firstName1 = "Gabe";
        String lastName1 = "Tejeda";
        String phoneNumber1 = "7023548838";

        Person2 p1 = new Person2(firstName1, lastName1, phoneNumber1);
        
        Person2 p2 = new Person2("Tony", "Stark", "6805335772");
        Person2 p3 = new Person2("Robert", "Downey Jr.", "6804024428");
        Person2 p4 = new Person2("Alexander", "Hamilton", "7189197544");
        Person2 p5 = new Person2("Jaime", "Mathet", "8054710452");

        PhoneBook PB1 = new PhoneBook();
        PB1.addPerson(p1);
        PB1.addPerson(p2);
        PB1.addPerson(p3);
        PB1.addPerson(p4);
        PB1.addPerson(p5);
        
        PB1.printEntries();
    }
}
