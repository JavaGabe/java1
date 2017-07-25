
package forloopfun;

import java.util.Scanner;

public class ForLoopFun {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
 
        for (int i =0;i<10;i++) {
            System.out.println("I love Java!");
        }
        System.out.println("What number would you like me to count to?");
            int countto = Integer.parseInt(keyboard.nextLine());
        for (int i =0;i<=countto;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("What number do you want me to start counting from?");
            int start = Integer.parseInt(keyboard.nextLine());
        System.out.println("What number do you want me to end counting from?");
            int end = Integer.parseInt(keyboard.nextLine());
        System.out.println("What number do you want me to count by?");
            int countby = Integer.parseInt(keyboard.nextLine());
        for (int i =start;i<=end;i+=countby) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        int[] array = new int [10];
        for (int i =0;i<10;i++) {
            array[i] = i+1;
        }
        int[] array1 = new int [10];
        for (int i =0;i<10;i++) {
            array1[i] = array[i]+2;
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        int[] array2 = new int [100];
        for (int i=0;i<100;i++) {
            array2[i] = i+1;
            System.out.println(array2[i]);
        if ();
        }
    }
    
}
