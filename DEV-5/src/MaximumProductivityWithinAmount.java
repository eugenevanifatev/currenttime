import developers.Junior;
import developers.Lead;
import developers.Middle;
import developers.Senior;

/**
 * Calculates and displays the number of required developers with maximum efficiency
 * and a fixed amount of the order.
 */
public class MaximumProductivityWithinAmount {
    int numberOfJunior;
    int numberOfMiddle;
    int numberOfSenior;
    int numberOfLeads;

    /**
     * Calculates the amount of developer according to the specified parameters.
     */
    private void calculation() {
        InputData inputData = new InputData();
        Junior junior = new Junior();
        Middle middle = new Middle();
        Senior senior = new Senior();
        Lead lead = new Lead();
        numberOfLeads = inputData.getMoney()/lead.getlSalary();
        int rest = inputData.getMoney() - lead.getlSalary()*numberOfLeads;
        if(rest > 0) {
            numberOfSenior = rest/senior.getsSalary();
            rest = rest - senior.getsSalary()*numberOfSenior;
            if(rest > 0) {
                numberOfMiddle = rest/middle.getmSalary();
                rest = rest - middle.getmSalary()*numberOfMiddle;
                if(rest > 0) {
                   numberOfJunior = rest/junior.getjSalary();
                }
            }
        }

    }

    /**
     * Displays the result
     */
    public void ConsoleOutputResults() {
        System.out.println("Number of Juniors: " + numberOfJunior);
        System.out.println("Number of Middles: " + numberOfMiddle);
        System.out.println("Number of Seniors: " + numberOfSenior);
        System.out.println("Number of Leads: " + numberOfLeads);
    }

}
