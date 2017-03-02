import java.util.Scanner;

/**
 * First enters the size of the arrays and checks them. Fills the arrays.
 * Shows the typed arrays. Returns the typed arrays.
 */
public class InputterOfArrays {
  Scanner sc = new Scanner(System.in);
  private int[] sizeOfArrays = new int[4];
  private double[][] array1;
  private double[][] array2;

  /**
   *Introduces the size of the two arrays and displays an error if you enter incorrect characters.
   */
  public void inputSizeOfArrays() {
    try {
      System.out.println("Enter the number of rows of first array:");
      sizeOfArrays[0] = sc.nextInt();
      System.out.println("Enter the number of columns of first array:");
      sizeOfArrays[1] = sc.nextInt();
      System.out.println("Enter the number of rows of second array:");
      sizeOfArrays[2] = sc.nextInt();
      System.out.println("Enter the number of columns of second array:");
      sizeOfArrays[3] = sc.nextInt();
    } catch (Exception e) {
      System.out.println("Error! Incorrect characters.");
    }
  }

  /**
   * Displays true if the array sizes are correct, else - false.
   * @return false or true.
   */
  public boolean checkCorrectFormat() {
    if (sizeOfArrays[1] == sizeOfArrays[2]) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Console with the first array.
   */
  private void fillingFirstArray() {
    array1 = new double[sizeOfArrays[0]][sizeOfArrays[1]];
    for (int i = 0; i < sizeOfArrays[0]; i++) {
      for (int j = 0; j < sizeOfArrays[1]; j++) {
        array1[i][j] = sc.nextDouble();
      }
    }
  }

  /**
   *Console with the second array.
   */
  private void fillingSecondArray() {
    array2 = new double[sizeOfArrays[2]][sizeOfArrays[3]];
    for (int i = 0; i < sizeOfArrays[2]; i++) {
      for (int j = 0; j < sizeOfArrays[3]; j++) {
        array2[i][j] = sc.nextDouble();
      }
    }
  }

  /**
   *Output to the console typed arrays
   */
  public void outputArrayToConsole() {
    System.out.println("First array:");
    for (int i = 0; i < sizeOfArrays[0]; i++) {
      for (int j = 0; j < sizeOfArrays[1]; j++) {
        System.out.print(array1[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("Second array:");
    for (int i = 0; i < sizeOfArrays[2]; i++) {
      for (int j = 0; j < sizeOfArrays[3]; j++) {
        System.out.print(array2[i][j] + " ");
      }
      System.out.println("");
    }
  }

  /**
   * @return first array
   */
  public double[][] getArray1() {
    fillingFirstArray();
    return array1;
  }

  /**
   * @return second array
   */
  public double[][] getArray2() {
    fillingSecondArray();
    return array2;
  }
}

