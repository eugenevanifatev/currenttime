/**
 * Class for search value of key in section
 */
public class FinderOfSectionAndKey {

  /**
   * @param arrayOfData Array of arguments file
   */
  public boolean findSection(String[] arrayOfData, String section) {
    for (int i = 0; i < arrayOfData.length; i++) {
      if (arrayOfData[i].contains(section)) {
        return true;
      } else {
        System.out.println("Section not found.");
      }
    }
    return false;
  }

  /**
   * @param arrayOfData Array of arguments file
   */
  public boolean findKey(String[] arrayOfData, String key) {
    for (int i = 0; i < arrayOfData.length; i++) {
      if (arrayOfData[i].contains(key)) {
        return true;
      } else {
        System.out.println("Key not found.");
      }
    }
    return false;
  }

  /**
   * Find value of key.
   *
   * @param arrayOfData Array of lines
   * @return value of key
   */
  public void findValueOfKey(String[] arrayOfData, String key) {
    for (int i = 0; i < arrayOfData.length; i++) {
      if (arrayOfData[i].contains(key)) {
        String[] stringSplitedOnKeyAndValue = arrayOfData[i].split("=");
        System.out.println(stringSplitedOnKeyAndValue[1]);
      }
    }
  }
}