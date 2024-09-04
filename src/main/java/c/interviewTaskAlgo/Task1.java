package c.interviewTaskAlgo;

import java.util.*;

//without sorting, n-length array, withdraw unique elements
public class Task1 {

    public static void main(String[] args) {

        int[] arr = {9, 4, 9, 6, 7, 4, 5};

        Set<Integer> uniqueValues = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        // First pass: identify duplicates and unique values
        for (int value : arr) {
            if (!uniqueValues.add(value)) {
                duplicates.add(value);
            }
        }

        // Second pass: remove duplicates from uniqueValues
        uniqueValues.removeAll(duplicates);

        System.out.println(uniqueValues);

    }
}