package com.example.project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class NumberConverterTests {
    // Test toReversedArray

    @Test
    void given1_returnsAnArrayOf1() {
        NumberConverter numberConverter = new NumberConverter();

        int[] result = numberConverter.toReversedArray(1);

        int[] expectedResult = {1};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void given2_returnsAnArrayOf2() {
        // Arrange -- set up, instantiate objects under test and other setup, e.g. stubs if we need to 
        NumberConverter numberConverter = new NumberConverter();
        
        // Act -- the behaviour we're testing happens
        int[] result = numberConverter.toReversedArray(2);

        // Assert - tell the test framework what to expect
        int[] expectedResult = {2};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void given10_returnsAnArrayWith10() {
        NumberConverter numberConverter = new NumberConverter();

        int[] result = numberConverter.toReversedArray(10);

        int[] expectedResult = {0, 1};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void given11_returnsAnArrayWith11() {
        NumberConverter numberConverter = new NumberConverter();

        int[] result = numberConverter.toReversedArray(11);

        int[] expectedResult = {1, 1};
        assertArrayEquals(expectedResult, result);
    }

    // Test toDigits
    @Test
    void given10_returns1_0() {
        NumberConverter numberConverter = new NumberConverter();

        int[] result = numberConverter.toDigits(10);

        int[] expectedResult = {1, 0};
        assertArrayEquals(expectedResult, result);
    }
}
