
import java.util.Scanner;

public class RangeSumQuery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] prefix = new int[num];

        // Input array
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Build prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < num; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int leftIndex = sc.nextInt();
        int rightIndex = sc.nextInt();

        int sum;
        if (leftIndex == 0) {
            sum = prefix[rightIndex];
        } else {
            sum = prefix[rightIndex] - prefix[leftIndex - 1];
        }

        System.out.println("Sum from index " + leftIndex + " to " + rightIndex + " : " + sum);
        sc.close();
    }
}
