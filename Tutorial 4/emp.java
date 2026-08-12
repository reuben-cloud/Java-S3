import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Salary: ");
        double sal1 = sc.nextDouble();

        System.out.print("Enter ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Salary: ");
        double sal2 = sc.nextDouble();

        Employee e1 = new Employee(id1, name1, sal1);
        Employee e2 = new Employee(id2, name2, sal2);

        System.out.println("\nEmployee 1:");
        e1.displayEmployee();

        System.out.println("\nEmployee 2:");
        e2.displayEmployee();
    }
}
