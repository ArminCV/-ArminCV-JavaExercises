package JavaPolymorphism.Exercise4;

public class Programmer extends Employee{

    private double baseSalary;
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay)
    {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    public double calculateSalary()
    {
        return baseSalary + overtimePay;
    }
    
}
