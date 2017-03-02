/**
 * Entry point of program.
 */
public class Main {

  /**
   * The cycle works as long as the user enters the correct sizes of arrays.
   */
  public static void main(String[] args) {
    InputterOfArrays inputterOfArrays = new InputterOfArrays();
    do {
      inputterOfArrays.inputSizeOfArrays();
      if (inputterOfArrays.checkCorrectFormat() == false) {
        System.out.println("Error! Incorrect size of array.");
      }
    } while (inputterOfArrays.checkCorrectFormat() == false);
    System.out.println("Fill the array:");
    double[][] array1 = inputterOfArrays.getArray1();
    double[][] array2 = inputterOfArrays.getArray2();
    inputterOfArrays.outputArrayToConsole();
    MultiplicatorOfArrays multiplicatorOfArrays = new MultiplicatorOfArrays();
    multiplicatorOfArrays.multiplicate(array1, array2);
    multiplicatorOfArrays.outputResult();
  }
}
