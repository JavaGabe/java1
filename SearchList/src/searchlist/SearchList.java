package searchlist;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList();
        int random = (int) (Math.random() * 50 + 1);
        a1.add(random);
        a1.add((int) (Math.random() * 50 + 1));
        a1.add((int) (Math.random() * 50 + 1));
        a1.add((int) (Math.random() * 50 + 1));
        a1.add((int) (Math.random() * 50 + 1));
        a1.add((int) (Math.random() * 50 + 1));
        a1.add((int) (Math.random() * 50 + 1));
        a1.add((int) (Math.random() * 50 + 1));
        a1.add((int) (Math.random() * 50 + 1));
        a1.add((int) (Math.random() * 50 + 1));
        System.out.println("What number would you like to search?");
        int s = Integer.parseInt(keyboard.nextLine());
        boolean found = false;
        if (a1.contains(s)) {
            found = true;
            System.out.println("Number found.");
        } 
        else {
            System.out.println("Number not found.");
        }
        int highest = 0;
        for (int a : a1) {
            if (a > highest) {
                highest = a;
            }
        }
        System.out.println(a1);
        System.out.println(highest);
        ArrayList<String> a2 = new ArrayList();
        a2.add("A ");
        a2.add("bunch ");
        a2.add("of ");
        a2.add("revolutionary ");
        a2.add("manumission ");
        a2.add("abolitionists, ");
        a2.add("give ");
        a2.add("me ");
        a2.add("your ");
        a2.add("position ");
        a2.add("show ");
        a2.add("me ");
        a2.add("where ");
        a2.add("your ");
        a2.add("ammunition ");
        a2.add("is!");
        
        ArrayList<String> a3 = new ArrayList();
        int z = 0;
        for (String b : a2) {
            if (b > z) {
                z = b;
            }
                
        }
    }
    a3.add(b)
                        a2.remove(b)

}
