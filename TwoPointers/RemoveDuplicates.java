package TwoPointers;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int slow = 0;
        for (int fast = 0; fast < n; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        System.out.println("Unique Count: " + (slow + 1));
        for (int i = 0; i <= slow; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
