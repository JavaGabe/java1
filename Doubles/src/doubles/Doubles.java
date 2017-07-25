
package doubles;

import java.util.Scanner;

public class Doubles {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int random = (int)(Math.random() * 6 + 1);
        System.out.println(random);
        int random2 = (int)(Math.random() * 6 + 1);
        System.out.println(random2);
        
        while (random!=random2) {
            System.out.println("Sorry, you didn't get a double.");
            System.out.println("Type anything to continue.");
            String yes = keyboard.nextLine();
            random = (int)(Math.random() * 6 + 1);
            System.out.println(random);
            random2 = (int)(Math.random() * 6 + 1);
            System.out.println(random2);
        }
            System.out.println("Congratulations! You rolled a double.");


    }
    
}
