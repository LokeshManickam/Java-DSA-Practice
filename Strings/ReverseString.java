package Strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String src = sc.nextLine();
        String revString = "";

        for (int i = src.length() - 1; i >= 0; i--) {
            revString += src.charAt(i);
        }

        System.out.println("Reversed String: " + revString);
        sc.close();
    }
}
