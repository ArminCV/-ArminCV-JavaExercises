package JavaEncapsulation.Exercise4;

public class Employee {

    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public void setEmpId(int employee_id)
    {
        this.employee_id = employee_id;
    }

    public int getEmpId()
    {
        return employee_id;
    }

    public void setEmpName(String employee_name)
    {
        this.employee_name = employee_name;
    }

    public String getEmpName()
    {
        return employee_name;
    }

    public void setEmpSalary(double employee_salary)
    {
        this.employee_salary = employee_salary;
    }

    public double getEmpSalary()
    {
        return employee_salary;
    }
    
}
