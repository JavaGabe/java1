
package car;

public class CatTest {
   
    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        String nickName1 = "Delta";
        String color1 = "Green";
        int year1= 1999;
        int yearsOwned1 = 4;
        double miles1 = 20000;
        
       Car car1= new Car(make1, model1, year1, nickName1, color1, yearsOwned1, miles1);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " nicknamed '" +car1.getNickName() + "' painted "+car1.getColor()+", from " + car1.getYear()+" owned for "+car1.getYearsOwned()+" and driven "+car1.getMiles()+" miles.");
       String make2 = "Lamborghini";
        String model2 = "Gallardo";
        String nickName2 = "Princess";
        String color2 = "Orange";
        int year2= 2010;
        int yearsOwned2 = 7;
        double miles2 = 80000;
        
       Car car2= new Car(make2, model2, year2, nickName2, color2, yearsOwned2, miles2);
       
       System.out.println("Car 2: " + car2.getMake() + " " + car2.getModel() + " nicknamed '" +car2.getNickName() + "' painted "+car2.getColor()+", from " + car2.getYear()+" owned for "+car2.getYearsOwned()+" and driven "+car2.getMiles()+" miles.");
       car2.turnOn();
       car2.turnOff();
       car2.turnOff();
              
    }
    
}