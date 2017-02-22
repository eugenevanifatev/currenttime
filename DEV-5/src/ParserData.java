/**
 * Analyzes the number of the operation and calls the operation corresponding to that number
 */
public class ParserData {

    /**
     * Use switch case for parse the number of the operation and calls the operation corresponding
     * to that number
     */
    public void parseNumberOfOption() {
        InputData inputData = new InputData();
        int number = inputData.getNumberOfOptions();
        switch(number) {
            case 1:
                MaximumProductivityWithinAmount firstOption = new MaximumProductivityWithinAmount();
                firstOption.ConsoleOutputResults();
                break;
            case 2:

                break;
            case 3:

                break;
        }
    }
}
