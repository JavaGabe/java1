package mathio;

import java.io.*;

public class MathIO {

    public static void main(String[] args) {

        String FILENAME = "numbers.txt";

        //Part 1
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            double n = 7;
            double n1 = 8;
            double n2 = 9;
            double n3 = 10;
            double n4 = 11;
            String line1 = "";

            writer.write(n+ "\n" +n1+ "\n" +n2+ "\n" +n3+ "\n" +n4+ "\n" );
                System.out.println(n + n1 + n2 + n3 + n4);

        } catch (IOException e) {
            e.printStackTrace();

        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            double index = 0;
            while (currentLine != null) {
                System.out.println(currentLine);
                double d = Double.parseDouble(currentLine);
                index += d;
                currentLine = reader.readLine();   
            }
            System.out.println(index);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
