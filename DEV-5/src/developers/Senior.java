package developers;

public class Senior {
    int sSalary = 200;
    int sProductivity = 3;
    double sUnitCostProductivity = sSalary/sProductivity;

    public int getsSalary() {
        return sSalary;
    }

    public int getsProductivity() {
        return sProductivity;
    }

    public double getUnitCostsProductivity() {
        return sUnitCostProductivity;
    }
}
