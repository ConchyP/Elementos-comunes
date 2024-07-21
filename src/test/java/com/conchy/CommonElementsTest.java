package com.conchy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class CommonElementsTest {
    @Test
    void testFindCommonElements() {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {4, 5, 6, 7, 8, 9};

        Set<Integer> expect = new HashSet<>(Arrays.asList(4, 5, 6));
        Set<Integer> result = CommonElements.findCommonElements(array1, array2);

        assertEquals(expect, result);
    }

    @Test
    public void notCommonElementsTest() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        Set<Integer> expect = new HashSet<>();
        Set<Integer> result = CommonElements.findCommonElements(array1, array2);

        assertEquals(expect, result);
    }

    @Test
    public void allCommonElementsTest() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        Set<Integer> expect = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> result = CommonElements.findCommonElements(array1, array2);

        assertEquals(expect, result);
    }

    @Test
    public void emptyArrayTest() {
        int[] array1 = {};
        int[] array2 = {};

        Set<Integer> expect = new HashSet<>();
        Set<Integer> result = CommonElements.findCommonElements(array1, array2);

        assertEquals(expect, result);
    }

    @Test
    public void singleElementTest() {
        int[] array1 = {1};
        int[] array2 = {1};

        Set<Integer> expect = new HashSet<>(Arrays.asList(1));
        Set<Integer> result = CommonElements.findCommonElements(array1, array2);

        assertEquals(expect, result);
    }

    @Test
    public void differentLengthsTest() {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {5, 10, 15, 20, 25};

        Set<Integer> expect = new HashSet<>(Arrays.asList(5, 10));
        Set<Integer> result = CommonElements.findCommonElements(array1, array2);

        assertEquals(expect, result);
    }
}
