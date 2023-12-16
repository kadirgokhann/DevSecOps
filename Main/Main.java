package Main;

import java.io.FileWriter;
import java.io.IOException; 


public class Main {
  public static void main(String[] args) {
    String[] lines = new String[6];
    lines[0] = " 0  4  3  2  1  0 ";
    lines[1] = " 4  1  2  3  4  1 ";
    lines[2] = " 3  2  3  4  1  2 ";
    lines[3] = " 2  3  4  1  2  2 ";
    lines[4] = " 1  4  1  2  3  2 ";
    lines[5] = " 0  1  2  2  2  0 ";
    try {
      FileWriter myWriter = new FileWriter("results.txt");
      for (int i = 0; i < 6; i++) 
      {
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
