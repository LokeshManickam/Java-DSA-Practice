
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toLowerCase();

        boolean isPalindrome = true;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(right) != str.charAt(left)) {
                isPalindrome = false;
                break;
            }
            right--;
            left++;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
