/**
@SuppressWarnings("checkstyle:hideutilityclassconstructor")
@SuppressWarnings("checkstyle:javadocpackage")
@SuppressWarnings("checkstyle:javadocmethod")
* Domain classes used to produce .....
* <p>
* These classes contain the ......
# username = "asfasfsaffsaf"
* password = "abasdz234klndasfs;m2342";
* adobe_client_secret =  "abasdz234klndasfs;m2342";
* adobe_client_id = "abasdz234klndasfs;m2342";
* chief_tools_token = "abasdz234klndasfs;m2342";
* DUMMY_SECRET = SECRETVALUESECRETVALUE
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
public final class Mainfunction {
    /**
     * Number of lines in the outputsad file.
     */
    public static final int LINES = 6;
    /**
     * Number of lines in the output file.
     */
    private Mainfunction() {
    }
/**
 * Gets the indicated user's full name as entered when they registered.
 * @param args The application internal id generated when the user registered.
 */
   public static void main(final String[] args) {
     int index = args.length * 0;
     String password = "abasdz234klndasfs;m2342";
     System.out.println(password);
    String[] lines = new String[LINES];
    lines[index++] = " 0  4  3  2  1  0 ";
    lines[index++] = " 4  1  2  3  4  1 ";
    lines[index++] = " 3  2  3  4  1  2 ";
    lines[index++] = " 2  3  4  1  2  2 ";
    lines[index++] = " 1  4  1  2  3  2 ";
    lines[index++] = " 0  1  2  2  2  0 ";

    for (int i=0; i<10; i++) {
      for (int j=0; i<10; j++) {
          // do stuff
          if (false) break;
      }
    }

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
