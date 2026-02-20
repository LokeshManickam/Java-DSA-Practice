
import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > Largest) {
                SecondLargest = Largest;
                Largest = arr[i];
            } else if (arr[i] > SecondLargest && arr[i]
                    != Largest) {
                SecondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element: " + SecondLargest);
    }
}
