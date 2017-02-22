import java.util.Scanner;

/**
 * Entered and stored data about the amount of the order and the required productivity.
 */
public class InputData {
    int money;
    int productivity;
    int numberOfOptions;

    /**
     * Are entered through the console, the necessary amount of money
     */
    public void setMoney() {
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
    }

    /**
     * Are entered through the console, the necessary amount of Productivity
     */
    public void setProductivity() {
        Scanner sc = new Scanner(System.in);
        productivity = sc.nextInt();
    }

    /**
     * Are entered through the console, the necessary number of option
     */
    public void setNumberOfOptions() {
        Scanner sc = new Scanner(System.in);
        numberOfOptions = sc.nextInt();
    }

    /**
     * Get Money
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * Get Productivity
     * @return productivity
     */
    public int getProductivity() {
        return productivity;
    }

    /**
     * Get Number of Options
     * @return numberOfOptions
     */
    public int getNumberOfOptions() {
        return numberOfOptions;
    }
}
