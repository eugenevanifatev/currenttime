/**
 * Gets 2 of the array creates a third array.
 * It saves the result of the multiplication of two arrays.
 * Displays the result on the screen.
 */
public class MultiplicatorOfArrays {
  double[][] result;

  /**
   * Multiply 2 array and stores the third
   * @param array1 first array
   * @param array2 second array
   */
  public void multiplicate(double[][] array1, double[][] array2) {
   int sizeOfLineOfFirstArray = array1.length;
   int sizeOfLineOfSecondArray = array2.length;
   int sizeOfColumnOfSecondArray = array2[0].length;
   result = new double[sizeOfLineOfFirstArray][sizeOfColumnOfSecondArray];
    for (int i = 0; i < sizeOfLineOfFirstArray; i++) {
      for (int j = 0; j < sizeOfColumnOfSecondArray; j++) {
        for (int k = 0; k < sizeOfLineOfSecondArray; k++) {
          result[i][j] += array1[i][k] * array2[k][j];
        }
      }
    }
  }

  /**
   * Displays the result on the screen.
   */
  public void outputResult() {
    System.out.println("Result array:");
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
