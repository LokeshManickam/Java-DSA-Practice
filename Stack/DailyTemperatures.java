package Stack;

import java.util.*;

public class DailyTemperatures {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] temp = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && temp[stack.peek()] <= temp[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = 0; 
            }else {
                result[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        for (int r : result) {
            System.out.print(r + " ");
        }

        sc.close();
    }
}
