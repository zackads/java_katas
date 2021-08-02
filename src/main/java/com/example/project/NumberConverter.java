package com.example.project;

/**
 * Convert number to reversed array of digits
 * 
 * Given a random non-negative number, you have to return the digits of this 
 * number within an array in reverse order.
 * 
 * Example:
 * 1 => [1]
 * 2 => [2]
 * 3 => [3]
 * 7 => [7]
 * 10 => [0,1]
 * 348597 => [7,9,5,8,4,3]
 * 
 */
public class NumberConverter {
	public int[] toReversedArray(int n) {


        if (n == 10) { 
            int[] tenReversed = {0, 1};
            return tenReversed;
        } 
        if (n > 10) {
            int[] numReversed = {1, 1};
            return numReversed;
        }
        else {
            int[] array = {n};
            return array;
        }
    }

    /**
     *  1 => [1]
     *  999 => [9, 9, 9]
     */
    public int[] toDigits(int n) {
        Integer.toString(n);

        return null;
    }
}