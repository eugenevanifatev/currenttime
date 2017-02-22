package developers;


public class Middle {
    int mSalary = 150;
    int mProductivity = 2;
    double mUnitCostProductivity = mSalary/mProductivity;

    public int getmSalary() {
        return mSalary;
    }

    public int getmProductivity() {
        return mProductivity;
    }

    public double getUnitCostmProductivity() {
        return mUnitCostProductivity;
    }
}
