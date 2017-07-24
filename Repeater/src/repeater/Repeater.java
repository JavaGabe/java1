package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat it: " );
       String input = keyboard.nextLine();
       System.out.println("Type how many times you want me to repeat it: ");
       int repeat = Integer.parseInt(keyboard.nextLine());
       System.out.println("Here we go!");
       int count = 0;
       while (count < repeat) {
           int num = count +1;
           System.out.println(num+". "+input);
           count ++;
       }
    }
    
}