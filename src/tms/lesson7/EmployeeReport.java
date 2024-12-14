package tms.lesson7;

public class EmployeeReport {

    public void printEmployeeNameIfSalaryMoreThan(Employee[] employees, int minAmount) {

        for (Employee employee : employees) {

            if (employee.getSalary() >= minAmount) {
                System.out.println(employee.getName());
            }

        }

    }

    public void printEmployeeNameIfSalaryMoreThan(Employee employee, int minAmount) {
            if (employee.getSalary() >= minAmount) {
                System.out.println(employee.getName());
        }
    }

}
