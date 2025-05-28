public class Manager extends Employee{
    private double bonus= 1000;

    public Manager(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()+bonus;
    }

}
