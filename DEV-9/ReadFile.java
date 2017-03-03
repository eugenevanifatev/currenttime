import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class for read file
 */
public class ReadFile {

  /**
   * Read file and save it in array of strings.
   *
   * @param fileName file name
   * @return List of lines
   * @throws IOException
   */
  public String[] read(String fileName) throws IOException {
    String[] arrayOfData = new String[0];
    BufferedReader buffer = new BufferedReader(new FileReader(fileName));
    String stringOfFile;
      for (int i = 0; i < arrayOfData.length; i++) {
        while ((stringOfFile = buffer.readLine()) != null) {
          arrayOfData[i] = stringOfFile;
        }
      }
    return arrayOfData;
  }
}