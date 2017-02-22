/**
 * Print the text for the dialogue with the user. Called metods fo InputData and ParserData.
 *
 * TODO: make another 2 options. To make it possible to check the greatest efficiency,
 *      to eliminate possible errors. To make programmers heirs of the abstract class (just don't know how).
 */
public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        System.out.println("How much you want to spend money: ");
        inputData.setMoney();
        System.out.println("The level of expected productivity: ");
        inputData.setProductivity();
        System.out.println("Select option (1-3): \n" +
                "1) The maximum productivity within the amount. \n" +
                "2) The minimum cost for a fixed productivity. \n" +
                "3) The minimum number of employees outrank Junior for a fixed productivity.");
        inputData.setNumberOfOptions();
        ParserData parserData = new ParserData();
        parserData.parseNumberOfOption();
    }
}
