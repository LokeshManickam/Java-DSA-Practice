
import java.util.Scanner;

class Employee {

    protected String name;

    Employee(String name) {
        this.name = name;
    }
}

class Developer extends Employee {

    int employeeId;

    Developer(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Staff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int employeeId = sc.nextInt();

        Developer d = new Developer(name, employeeId);
        d.display();

        sc.close();
    }
}
