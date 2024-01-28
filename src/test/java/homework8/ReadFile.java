package homework8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

  public static void main(String[] args) throws IOException {
    try {
      BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));

      String firstString = reader.readLine();
      System.out.println(firstString);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred while reading the file");
    }
  }
  public void UncheckedException() throws RuntimeException{
    System.out.println("This is an unchecked exception.");
  }
}
