import java.util.*;
public class Count_freq_Of_Elements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4,2};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr)
        {
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
