package puzzles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Puzzles {

    public static void main(String[] args) {
        String FILENAME = "puzzle.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            int linenumber = 1;
            while (currentLine != null) {
                
                if (linenumber % 3 == 0) {
                    System.out.println(currentLine);
                    currentLine = reader.readLine();

                } else {
                    currentLine = reader.readLine();
                }
                linenumber++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
