package TwoPointers;

import java.util.Scanner;

public class TwoSumSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new Int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Indices:" + left + " " + right);
                sc.close();
                return;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found");
        sc.close();
    }
}
