import java.io.IOException;

/**
 * Entry point of program
 */
public class Main {

  /**
   * @param args Name file which we need to read
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    String fileName = args[0];
    InputterOfSectionAndKey in = new InputterOfSectionAndKey();
    in.inputData();
    String section = in.getSection();
    String key = in.getKey();
    ReadFile readFile = new ReadFile();
    readFile.read(fileName);
    String[] arrayOfData = readFile.read(fileName);
    FinderOfSectionAndKey find = new FinderOfSectionAndKey();
    find.findSection(arrayOfData, section);
    if (find.findKey(arrayOfData, key) == true){
      find.findValueOfKey(arrayOfData, key);
    }

  }
}