package Queue;

import java.util.*;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = arr[dq.peekFirst()];
            }
        }
        for (int num : result) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}
