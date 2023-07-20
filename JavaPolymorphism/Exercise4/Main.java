package JavaPolymorphism.Exercise4;

public class Main {

    public void displayEmployee(String name, String role, double salary)
    {
        System.out.println("Manager: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee emp1  = new Manager("Juan Dela Cruz", 7500, 1500);
        Employee emp2  = new Programmer("Mark Margit", 5000, 600);

        String name = emp1.getName();
        String role = emp1.getRole();
        double salary = emp1.calculateSalary();

        Main obj = new Main();
        obj.displayEmployee(name, role, salary);

        name = emp2.getName();
        role = emp2.getRole();
        salary = emp2.calculateSalary();

        obj.displayEmployee(name, role, salary);


        
    }
    
}
