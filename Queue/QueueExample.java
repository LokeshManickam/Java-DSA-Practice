package Queue;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sc.nextInt());
        queue.add(sc.nextInt());
        queue.add(sc.nextInt());
        System.out.println("Front: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after Removed: " + queue);
        sc.close();
    }
}
