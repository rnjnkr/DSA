package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * WAP to sort an array by frequency of elements in ascending order.
 * If two elements have the same frequency then the smaller element should come first.
 * int inputArr[] ={10,10,9,9, 8, 5, 5, 5, 5, 1, 1, 1, 1, 3 };
 * int outputArr[]  = {3, 8, 9, 9, 10, 10, 1, 1, 1, 1, 5, 5, 5, 5};
 */

public class SortArrayByFrequency {
    public static void main(String[] args) {
        int[] input = {10, 10, 9, 9, 8, 5, 5, 5, 5, 1, 1, 1, 1, 3};
        Map<Integer, Integer> freq = new HashMap<>();

        for (int value : input) {
            if (!freq.containsKey(value)) {
                freq.put(value, 1);
            } else {
                freq.put(value, freq.get(value) + 1);
            }
        }

        List<Integer> lists = Arrays.stream(input).boxed().sorted((a, b) -> {
            int freq1 = freq.get(a);
            int freq2 = freq.get(b);
            if (freq1 != freq2) return freq1 - freq2;
            else {
                return a - b;
            }
        }).collect(Collectors.toList());

        System.out.println(lists);
    }
}
