package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        System.out.println("Question 2: What color is a purple finch?");
        System.out.println("\tA) Purple");
        System.out.println("\tB) Orange");
        System.out.println("\tC) Pink");
        System.out.println("\tD) Red");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the color of a purple finch is actually red!");
        }    
        System.out.println("Question 3: How long was the 100 Years War?");
        System.out.println("\tA) 100 years");
        System.out.println("\tB) 72 years");
        System.out.println("\tC) 116 years");
        System.out.println("\tD) 102 years");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the 100 Years War lasted 116 years!");
        }    
        System.out.println("Question 4: From which animal do we get catgut?");
        System.out.println("\tA) Chickens");
        System.out.println("\tB) Sheep");
        System.out.println("\tC) Cat");
        System.out.println("\tD) Cow");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, we get catgut from sheep!");
        }    
        System.out.println("Question 5: What is 8+6*9?");
        System.out.println("\tA) 136");
        System.out.println("\tB) 126");
        System.out.println("\tC) 62");
        System.out.println("\tD) 23");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, 8+6*9 is 62!");
        }    
        System.out.println("Question 6: What is EU's favorite programming language?");
        System.out.println("\tA) Python");
        System.out.println("\tB) C++");
        System.out.println("\tC) Java");
        System.out.println("\tD) PHP");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("That answer is acceptable.");
        }    
        System.out.println("Question 7: How long was the 30 Years War?");
        System.out.println("\tA) 30 years");
        System.out.println("\tB) 33 years");
        System.out.println("\tC) 28 years");
        System.out.println("\tD) 20 years");
        String answer7 = keyboard.nextLine();
        if (answer7.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Not sorry, the 30 Years War was 30 years long.");
        }    
            System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
        
    }
    
}