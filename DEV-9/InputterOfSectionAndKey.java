import java.util.Scanner;

/**
 * Input section and key.
 */
public class InputterOfSectionAndKey {
  String section;
  String key;

  /**
   * Input section and key.
   */
  public void inputData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please, enter section in [ ]:");
    section = sc.nextLine();
    System.out.println("Please, enter key:");
    key = sc.nextLine();
  }

  /**
   *
   * @return name of section.
   */
  public String getSection() {
    return section;
  }

  /**
   *
   * @return name of key.
   */
  public String getKey() {
    return key;
  }
}