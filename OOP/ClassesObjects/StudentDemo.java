
import java.util.Scanner;

class Student {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentDemo {   // <-- match file name

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.name = sc.nextLine();
        s.age = sc.nextInt();

        s.display();
        sc.close();
    }
}
