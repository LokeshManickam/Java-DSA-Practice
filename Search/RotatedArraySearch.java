package Search;

import java.util.Scanner;

public class RotatedArraySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Index: " + mid);
                sc.close();
                return;
            }
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[right]) {
                    left = mid - 1;
                } else {
                    right = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        System.out.println("Index: -1");
        sc.close();
    }
}
