/**
 * Contains information, which is displayed on the screen
 */
public class Information {

    /**
     * Describes the format in which you want to enter the date and time.
     * The description of the format and an example of writing.
     */
    public void inputRules() {
        System.out.println("Pattern format of date and time: hh:mm:ss DD/MM/YYYY");
        System.out.println("hh - hours");
        System.out.println("mm - minutes");
        System.out.println("ss - seconds");
        System.out.println("DD - day");
        System.out.println("MM - month");
        System.out.println("YYYY - year");
        System.out.println("Example: 10:12:23 1/3/2017");
        System.out.println("Please, enter time and date:");
    }
}
