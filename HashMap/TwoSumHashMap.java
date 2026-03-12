package HashMap;

import java.util.*;

public class TwoSumHashMap {

    public static void main(String[] args) {
        int[] arr = {2, 7, 10, 12, 15};
        int Target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = Target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println(complement + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
    }
}
