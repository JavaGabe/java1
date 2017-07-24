package scanner;

import java.util.Scanner;
public class UserData {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
       String name = keyboard.nextLine();
       
       System.out.println("Hi, "+name+"! How old are you?");
       int a = Integer.parseInt(keyboard.nextLine());
       
       System.out.println("What is the month of your birthday?");
       String month = keyboard.nextLine();
       
       System.out.println("What is the day of your birthday?");
       int d = Integer.parseInt(keyboard.nextLine());
       
       System.out.println("What is the year of your birthday?");
       int y = Integer.parseInt(keyboard.nextLine());
       
       System.out.println("What is your favorite book?");
       String book = keyboard.nextLine();
       
       System.out.println("What is your hometown?");
       String home = keyboard.nextLine();
       
       System.out.println("What is your lucky number?");
       double l = Double.parseDouble(keyboard.nextLine());
       
       System.out.println("What is your shoe size?");
       double s = Double.parseDouble(keyboard.nextLine());
       
       System.out.println("On a scale of 1 to 5, how excited are you to learn Java?");
       double j = Double.parseDouble(keyboard.nextLine());
       
       System.out.println("What is one cool fact about you?");
       String fact = keyboard.nextLine();
       System.out.println(name+", age "+a+", was born on "+month+" "+d+", "+y+". From "+home+", "+name+" has luck number "+l+" and a shoe size of "+s+". On a scale of 1 to 5, "+name+" is this excited to learn about Java: "+j+"! A fun fact about "+name+" is: "+fact+"!");
       System.out.println("We thank you for giving us all of your personal information.");
       
       int f = a+5;
       boolean b1 = a == d;
       boolean b2 = y / 200 >= 1;
       double b3 = s*j;
       System.out.println(name+" will be "+f+" in 5 years. "+name+"'s age is the same as the day of his birthday: "+b1+". "+name+" was born in or after the year 2000: "+b2+". "+name+"'s shoe size multiplied by their excitement level is "+b3+".");    
    }
    
}