public class SalesPerson extends Employee{
    private double commission= 1000;
    public SalesPerson(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()+commission;
    }
}
