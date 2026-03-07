package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Enter the Element");
        String str = sc.nextLine();
        // Push characters into stack
        for (int i = 1; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        // Pop characters to reverse string
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed += stack.pop();
        }
        System.out.println("Reversed String: " + reversed);
    }
}
