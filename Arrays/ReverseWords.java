
import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            result.append(arr[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}
