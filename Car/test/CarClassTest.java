import car.Car;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarClassTest {
    double e = .0000000000000001;
    Car c = new Car("Toyota", "Camry", 1999, "Delta", "Green", 4, 20000);
    
    @Test
    public void makeGetterTest() {
        assertEquals(c.getMake(), "Toyota");
    }
    
    @Test
    public void makeSetterTest() {
        c.setMake("Honda");
        assertEquals(c.getMake(), "Honda");
    }
    
    @Test
    public void modelGetterTest() {
        assertEquals(c.getModel(), "Camry");
    }
        
    @Test
    public void modelSetterTest() {
        c.setModel("Camry");
        assertEquals(c.getModel(), "Camry");
    }
    
    @Test
    public void yearGetterTest() {
        assertEquals(c.getYear(), 1999);
    }
    
    @Test
    public void yearSetterTest() {
        c.setYear(1999);
        assertEquals(c.getYear(), 1999);
    }
    
    @Test
    public void nicknameGetterTest() {
        assertEquals(c.getNickName(), "Delta");
    }
    
    @Test
    public void nicknameSetterTest() {
        c.setNickName("Delta");
        assertEquals(c.getNickName(), "Delta");
    }
    
    @Test
    public void colorGetterTest() {
        assertEquals(c.getColor(), "Green");
    }
    
    @Test
    public void colorSetterTest() {
        c.setColor("Green");
        assertEquals(c.getColor(), "Green");
    }
    
    @Test
    public void yearsownedGetterTest() {
        assertEquals(c.getYearsOwned(), 4);
    }
    
    @Test
    public void yearsownedSetterTest() {
        c.setColor("Green");
        assertEquals(c.getYearsOwned(), 4);
    }
    
    @Test
    public void milesGetterTest() {
        assertEquals(c.getMiles(), 20000, e);
    }
    
     @Test
    public void milesSetterTest() {
        c.setMiles(20000);
        assertEquals(c.getMiles(), 20000, e);
    }
}
