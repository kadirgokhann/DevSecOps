/**
 * Info about this package doing something for package-info.java file.
 */
package main;

import java.io.FileWriter;
import java.io.IOException;
/**
 * Number of lines in the output file.
 */
public class main {
    /**
     * Number of lines in the output file.
     */
    public static final int LINES = 7;
    
    /**
     * Info about this package doing something for package-info.java file.
     */     
    public static void main(final String[] args) {
    int index = 0;
    String[] lines = new String[LINES];
    lines[index++] = " 0  4  3  2  1  0 ";
    lines[index++] = " 4  1  2  3  4  1 ";
    lines[index++] = " 3  2  3  4  1  2 ";
    lines[index++] = " 2  3  4  1  2  2 ";
    lines[index++] = " 1  4  1  2  3  2 ";
    lines[index++] = " 0  1  2  2  2  0 ";
    try {
      FileWriter myWriter = new FileWriter("results.txt");
      for (int i = 0; i < LINES; i++) {
        myWriter.write(lines[i] + "\n");
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
