package TwoPointers;

import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Not a Palindrome");
                sc.close();
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
        sc.close();
    }
}
