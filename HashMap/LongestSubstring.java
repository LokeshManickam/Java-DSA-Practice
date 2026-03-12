package HashMap;

import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLenght = 0;
        for (int right = 0; right < 10; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLenght = Math.max(maxLenght, right - left + 1);
        }
        System.out.println("Longest Length: " + maxLenght);
    }
}
