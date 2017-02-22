package developers;


public class Lead {
    int lSalary = 250;
    int lProductivity = 4;
    double lUnitCostProductivity = lSalary/lProductivity;

    public int getlSalary() {
        return lSalary;
    }

    public int getlProductivity() {
        return lProductivity;
    }

    public double getUnitCostlProductivity() {
        return lUnitCostProductivity;
    }
}
