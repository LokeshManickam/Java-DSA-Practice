package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Remove: " + stack.pop());
        System.out.println("Stack: " + stack);
        sc.close();
    }
}
