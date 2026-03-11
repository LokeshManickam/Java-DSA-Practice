package Queue;

import java.util.*;

public class DequeExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(sc.nextInt());
        dq.addLast(sc.nextInt());
        dq.addLast(sc.nextInt());
        dq.addLast(sc.nextInt());
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        sc.close();
    }
}
