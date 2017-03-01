import java.util.Scanner;

/**
 * Inputs from console user time and date.
 */
public class InputterOfUserDate {
    private String userDate;

    /**
     * Inputs from console user time and date.
     */
    public void inputterFromConsoleUserDate() {
        Scanner sc = new Scanner(System.in);
        userDate = sc.nextLine();
    }

    /**
     * @return the array of time and date divided into elements.
     */
    public String getUserDate() {
        return userDate;
    }
}
