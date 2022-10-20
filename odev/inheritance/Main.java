package odev.inheritance;

public class Main {
    public static void main(String[] args) {
        Costumer costumer = new Costumer();
        Employee employee = new Employee();
        System.out.println(costumer.age);
        System.out.println(employee.salary);
        EmployeeManager employeeManager = new EmployeeManager();
        CostumerManager costumerManager = new CostumerManager();
        employeeManager.BestEmployee();
        costumerManager.List();
    }
}
