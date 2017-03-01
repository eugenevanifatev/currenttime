/**
 * The entry point of the program.
 */
public class Main {
    public static void main(String[] args) {
        Information info = new Information();
        info.inputRules();
        InputterOfUserDate inputUserDate = new InputterOfUserDate();
        CheckerOfInputData checker = new CheckerOfInputData();
        SplitterOfStingOnArray sp = new SplitterOfStingOnArray();
        String[] arrayDate;
        boolean result = false;
        do {
            inputUserDate.inputterFromConsoleUserDate();
            String userDate = inputUserDate.getUserDate();
            sp.splitSringOnArray(userDate);
            arrayDate = sp.getArrayDate();
            result = checker.checkInvalidCharacters(arrayDate);
            if(result == true) {
                System.out.println("Error! Please, enter correct date.");
            }
        } while (result == true);
        checker.convertFromStringArrayToIntegerArray(arrayDate);
        checker.resultOfChecking();
    }
}
