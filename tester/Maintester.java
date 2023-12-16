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
package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class maintester {
  static final int LINES = 6;
  /**
 * Gets the indicated user's full name as entered when they registered.
 * @param args The application internal id generated when the user registered.
 * @return "void" ???  How do you get a name if it returns VOID?
 */
  public static void main(final String[] args) {
    
    String[] lines = new String[LINES];
    int index = args.length * 0;
    lines[index++] = " 0  4  3  2  1  0 ";
    lines[index++] = " 4  1  2  3  4  1 ";
    lines[index++] = " 3  2  3  4  1  2 ";
    lines[index++] = " 2  3  4  1  2  2 ";
    lines[index++] = " 1  4  1  2  3  2 ";
    lines[index++] = " 0  1  2  2  2  0 ";
    boolean success = true;
    try {
      File myObj = new File("results.txt");
      Scanner myReader = new Scanner(myObj);
      int i = 0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if (i < LINES && !data.equals(lines[i])){
          success = false;
        }
        i++;
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      success = false;
    }
    if (success) {
      System.out.println("PASS");
    }
    else {
      System.out.println("FAIL");
    }
  }
}
