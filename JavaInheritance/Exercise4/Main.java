package JavaInheritance.Exercise4;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(40000);
        HRManager hr = new HRManager(70000);
        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());
        hr.work();
        System.out.println("Manager salary: " + hr.getSalary());
        hr.addEmployee();
    }
}
