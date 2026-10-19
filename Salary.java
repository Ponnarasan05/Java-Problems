
import java.util.Scanner;

class Company
{
    String cmpname;
    String location;

    void getdetails()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter company name:");
        cmpname = s.nextLine();

        System.out.println("Enter location:");
        location = s.nextLine();
    }
}

class Employee extends Company
{
    int id;
    String jobcategory;

    void getdetails()
    {
        super.getdetails();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter employee id:");
        id = s.nextInt();
        s.nextLine();

        System.out.println("Enter job category:");
        jobcategory = s.nextLine();
    }
}

class fulltime extends Employee
{
    int hr;
    int salary;

    void getdetails()
    {
        super.getdetails();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of hours worked:");
        hr = s.nextInt();
    }

    // Function Overloading
    int calsalary()
    {
        if(hr <= 8)
            salary = 5000;
        else
            salary = 5000 + (hr - 8) * 1000;

        return salary;
    }

    int calsalary(int h)
    {
        if(h <= 8)
            return 5000;
        else
            return 5000 + (h - 8) * 1000;
    }

    void display()
    {
        System.out.println("Company: " + cmpname);
        System.out.println("Location: " + location);
        System.out.println("Employee ID: " + id);
        System.out.println("Job Category: " + jobcategory);

        System.out.println("Salary: " + calsalary());

        // Calling overloaded function
        System.out.println("Salary for 10 hours: " + calsalary(10));
    }
}

class partime extends Employee
{
    int hr;
    int salary;

    void getdetails()
    {
        super.getdetails();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of hours worked:");
        hr = s.nextInt();
    }

    // Function Overloading
    int calsalary()
    {
        if(hr <= 4)
            salary = hr * 500;
        else
            salary = 2000 + (hr * 500);

        return salary;
    }

    int calsalary(int h)
    {
        if(h <= 4)
            return h * 500;
        else
            return 2000 + (h * 500);
    }

    void display()
    {
        System.out.println("Company: " + cmpname);
        System.out.println("Location: " + location);
        System.out.println("Employee ID: " + id);
        System.out.println("Job Category: " + jobcategory);

        System.out.println("Salary: " + calsalary());

        // Calling overloaded function
        System.out.println("Salary for 6 hours: " + calsalary(6));
    }
}

public class Salary
{
    public static void main(String[] args)
    {
        fulltime f1 = new fulltime();

        f1.getdetails();
        f1.display();
    }
}

