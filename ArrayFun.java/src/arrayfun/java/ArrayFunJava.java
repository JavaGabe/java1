package arrayfun.java;

public class ArrayFunJava {

    public static void main(String[] args) {
        int[] array = new int[10];

        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;
        array[5] = 11;
        array[6] = 13;
        array[7] = 15;
        array[8] = 17;
        array[9] = 19;

        System.out.println("The element at index " + 0 + " is " + array[0]);
        System.out.println("The element at index " + 1 + " is " + array[1]);
        System.out.println("The element at index " + 2 + " is " + array[2]);
        System.out.println("The element at index " + 3 + " is " + array[3]);
        System.out.println("The element at index " + 4 + " is " + array[4]);
        System.out.println("The element at index " + 5 + " is " + array[5]);
        System.out.println("The element at index " + 6 + " is " + array[6]);
        System.out.println("The element at index " + 7 + " is " + array[7]);
        System.out.println("The element at index " + 8 + " is " + array[8]);
        System.out.println("The element at index " + 9 + " is " + array[9]);
        System.out.println();

        double[] array1 = new double[10];

        array1[0] = 1.25;
        array1[1] = 1.25;
        array1[2] = 1.25;
        array1[3] = 1.25;
        array1[4] = 1.25;
        array1[5] = 1.25;
        array1[6] = 1.25;
        array1[7] = 1.25;
        array1[8] = 1.25;
        array1[9] = 1.25;

        int index = 0;
        while (index < 10) {
            array1[index] = index;
            System.out.println("The element at index " + index + " is 1.25");
            System.out.println();
            index++;
        }

        int[] array2 = new int[1000];

        int index1 = 0;
        while (index1 < 1000) {
            array2[index1] = index1;
            int random = (int) (Math.random() * 1000 + 1);
            System.out.println("The element at index " + index1 + " is " + random);
            index1++;
        }

        int[] array3 = new int[1000];

        int index2 = 0;
        while (index2 < 1000) {
            array2[index2] = index2;
            int random1 = (int) (Math.random() * 1000 + 1);
            System.out.print(" " + random1 + " ");
            index2++;
            int index3 =0;
            while (index3 )
        }
    }

}
