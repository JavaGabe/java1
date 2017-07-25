
package highorlow.java;

import java.util.Scanner;

public class HighOrLowJava {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int random = (int)(Math.random() * 100 + 1);
        System.out.println("Guess my number between 1 and 100.");
        int guess = Integer.parseInt(keyboard.nextLine());
        while (random!=guess) {
            if (random > guess) {
                System.out.println("You are too low. Try again.");
                
            }
            else  {
                System.out.println("You are too high. Try again.");
            }
             guess = Integer.parseInt(keyboard.nextLine());
        }
        System.out.println("Congratulations! The number is "+random);
        }
    }
    
