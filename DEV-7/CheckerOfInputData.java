import java.util.regex.*;

/**
 * Verified entered date and time. First checks the string array for the presence of invalid characters.
 * It then puts into an Integer array for further verification.
 * And checks each element of the array separately - this item is in the desired range or not.
 * At the end displays the total summary of all the tests.
 */
public class CheckerOfInputData {
    private int[] arrayDateInt;
    private boolean[] resultOfEachCheck;

    /**
     * Checks invalid characters which are in the string array.
     * @param arrayDate the array of time and date divided into elements.
     * @return result - there are invalid elements or not.
     */
    public boolean checkInvalidCharacters(String[] arrayDate) {
        Pattern pattern = Pattern.compile("\\D+");
        boolean result = false;
        for(int i = 0; i < arrayDate.length; i++) {
            Matcher matcher = pattern.matcher(arrayDate[i]);
            if(matcher.find() == true) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Convert from string array to integer array
     * @param arrayDate the array of time and date divided into elements.
     */
    public void convertFromStringArrayToIntegerArray(String[] arrayDate) {
        arrayDateInt = new int[arrayDate.length];
        resultOfEachCheck = new boolean[arrayDate.length];
        for(int i = 0; i < arrayDate.length; i++) {
                arrayDateInt[i] = Integer.parseInt(arrayDate[i]);
        }
    }

    /**
     *  Verifies, enters the hours setting in the range or not
     */
    private void checkHours() {
        if(arrayDateInt[0] >= 0 && arrayDateInt[0] <= 23) {
            resultOfEachCheck[0] = true;
        } else {
            resultOfEachCheck[0] = false;
        }
    }

    /**
     * Verifies, enters the minutes setting in the range or not
     */
    private void checkMinutes() {
        if(arrayDateInt[1] >= 0 && arrayDateInt[1] <= 59) {
            resultOfEachCheck[1] = true;
        } else {
            resultOfEachCheck[1] = false;
        }
    }

    /**
     * Verifies, enters the seconds setting in the range or not
     */
    private void checkSeconds() {
        if(arrayDateInt[2] >= 0 && arrayDateInt[2] <= 59) {
            resultOfEachCheck[2] = true;
        } else {
            resultOfEachCheck[2] = false;
        }
    }

    /**
     * Verifies, enters the day setting in the range or not
     */
    private void checkDay() {
        if(arrayDateInt[3] >= 1 && arrayDateInt[3] <= 31) {
            resultOfEachCheck[3] = true;
        } else {
            resultOfEachCheck[3] = false;
        }
    }

    /**
     * Verifies, enters the month setting in the range or not
     */
    private void checkMonth() {
        if(arrayDateInt[4] >= 1 && arrayDateInt[4] <= 12) {
            resultOfEachCheck[4] = true;
        } else {
            resultOfEachCheck[4] = false;
        }
    }

    /**
     * Verifies, enters the year setting in the range or not
     */
    private void checkYear() {
        if(arrayDateInt[5] >= 0 && arrayDateInt[5] <= 3000) {
            resultOfEachCheck[5] = true;
        } else {
            resultOfEachCheck[5] = false;
        }
    }

    /**
     * Displays the total summary of all the tests.
     */
    public void resultOfChecking() {
        checkHours();
        checkMinutes();
        checkSeconds();
        checkDay();
        checkMonth();
        checkYear();
        int count = 0;
        for(boolean i : resultOfEachCheck) {
            if(i == false) {
                System.out.println("Error! Invalid data.");
                count++;
                break;
            }
            count++;
        }
        if(count == 6) {
            System.out.println("Successful!");
        }
    }
}
