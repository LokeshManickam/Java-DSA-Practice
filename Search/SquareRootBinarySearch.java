package Search;

import java.util.Scanner;

public class SquareRootBinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid == x) {
                System.out.println("Square Root: " + mid);
                sc.close();
                return;
            }
            if ((long) mid * mid < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Square Root: " + ans);
        sc.close();
    }
}
