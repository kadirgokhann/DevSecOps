/**
* Domain classes used to produce .....
* <p>
* These classes contain the ......
* </p>
*
* @since 1.0
* @author somebody
* @version 1.0
*/
package main;

import java.io.FileWriter;
import java.io.IOException;
/**
 * Number of lines in the output file.
 */
public class Mainfunction {
    /**
     * Number of lines in the output file.
     */
    public static final int LINES = 7;
/**
 * Gets the indicated user's full name as entered when they registered.
 * @param args The application internal id generated when the user registered.
 * @return "void" ???  How do you get a name if it returns VOID?
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