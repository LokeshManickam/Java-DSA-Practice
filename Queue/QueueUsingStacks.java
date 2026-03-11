package Queue;

import java.util.*;

public class QueueUsingStacks {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void enqueue(int x) {
        stack1.push(x);
    }

    public static int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return stack2.pop();
    }

    public static int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        enqueue(sc.nextInt());
        enqueue(sc.nextInt());
        enqueue(sc.nextInt());
        enqueue(sc.nextInt());
        System.out.println(dequeue());
        System.out.println(peek());
        sc.close();
    }
}
