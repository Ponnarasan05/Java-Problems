package employee;

public class Employee {
    public int id;
    public String name;
    public double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(id + "  " + name + "  " + salary);
    }
}
package payroll;

import employee.Employee;

public class Payroll {

    public double calculate(Employee e) {
        return e.salary + (e.salary * 0.10);
    }
}
package report;

import employee.Employee;

public class Report {

    public void generate(Employee[] e) {
        System.out.println("\nEmployee Report");

        for (Employee x : e) {
            x.display();
        }
    }
}
import employee.Employee;
import payroll.Payroll;
import report.Report;

public class package1{

    public static void main(String[] args) {

        Employee[] employees = {
            new Employee(101, "Arun", 20000),
            new Employee(102, "Kumar", 25000),
            new Employee(103, "Ravi", 30000)
        };

        Payroll p = new Payroll();
        Report r = new Report();

        r.generate(employees);

        System.out.println("\nPayroll");
        for (Employee e : employees) {
            System.out.println(e.name + " : " + p.calculate(e));
        }
    }
}