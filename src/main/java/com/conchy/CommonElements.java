package com.conchy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {4, 5, 6, 7, 8, 9};

     
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.print("Common Elements: ");
        Set<Integer> common = findCommonElements(array1, array2);
        common.forEach(element -> System.out.print(element + " "));
    }

    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
   
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        Set<Integer> commonElements = new HashSet<>();
        for (int num : array2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;
    }
}
