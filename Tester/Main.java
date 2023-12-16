package Tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String[] lines = new String[6];
            lines[0] = " 0  4  3  2  1  0 ";
            lines[1] = " 4  1  2  3  4  1 ";
            lines[2] = " 3  2  3  4  1  2 ";
            lines[3] = " 2  3  4  1  2  2 ";
            lines[4] = " 1  4  1  2  3  2 ";
            lines[5] = " 0  1  2  2  2  0 ";
            boolean success = true;
            try {
                File myObj = new File("results.txt");
                Scanner myReader = new Scanner(myObj);
                int i = 0;
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if ( i < 6 && ! data.equals(lines[i]))
                    success = false;
                    i++;
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
                success = false;
            }
            if (success)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
    }
}
