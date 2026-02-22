package Strings;

import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            sc.close();
            return;
        }

        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println("Not an Anagram");
                sc.close();
                return;
            }
        }

        System.out.println("Anagram");
        sc.close();
    }
}
