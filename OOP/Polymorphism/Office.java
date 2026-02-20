package Polymorphism;

// Parent class
class Employee {

    void work() {
        System.out.println("Employee is working.");
    }
}

// Child class 1
class Manager extends Employee {

    @Override
    void work() {
        System.out.println("Manager is planning and managing");
    }
}

// Child class 2
class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer is writing code");
    }
}

// Main class
public class Office {

    public static void main(String[] args) {

        // Runtime Polymorphism
        Employee e1 = new Manager();
        Employee e2 = new Developer();

        e1.work();  // Calls Manager's work()
        e2.work();  // Calls Developer's work()
    }
}
