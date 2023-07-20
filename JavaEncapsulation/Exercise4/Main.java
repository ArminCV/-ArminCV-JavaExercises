package JavaEncapsulation.Exercise4;

public class Main {

    public static void main(String[] args)
    {

        Employee emp = new Employee();

        emp.setEmpId(15);
        emp.setEmpName("Juan Dela Cruz");
        emp.setEmpSalary(4900.00);

        int id = emp.getEmpId();
        String name = emp.getEmpName();
        double salary = emp.getEmpSalary();

        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);

    }
    
}
