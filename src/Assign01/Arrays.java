package Assign01;

/**
 * Name: Aditya Verma
 * Date: Feb 1, 2022
 * Description: Assignment 01 "Arrays" Submission for CS321.
 */
public class Arrays {

    /**
     * Checks if two 1D integer arrays are equal by comparing
     * every element of both arrays correspondingly.
     * @param array1  A 1D integer array
     * @param array2  A 1D integer array
     * @return reValue ; a boolean value; True if arrays are equal, False if arrays are not equal
     */
    public static boolean equals(int[] array1, int[] array2) {

        //storing the lengths of arrays in new variables
        int lenArray1 = array1.length;
        int lenArray2 = array2.length;

        boolean retValue = true;

        /**
         * Checking if both arrays' lengths are equal, if not they are not the same,
         * the arrays cannot be equal.
         */
        if ( lenArray1 != lenArray2) {
            retValue = false;
            return retValue;
        }

        /**
         * Iterating through all elements of both arrays, checking if they are equal.
         * Returning false if a mismatch is found, meaning the arrays are not equal.
         */
        for (int i = 0; i < lenArray1; i++) {
            if (array1[i] != array2[i]) {
                retValue = false;
                return retValue;
            }
        }
        return retValue;
    }

    /**
     * Copies a portion of a given array into a new array
     * @param src  A 1D integer array
     * @param start  starting index of where to start copying 'src'
     * @param end  ending index of where to end copying 'src'
     * @return dest ; an integer array; containing the copied portion of 'src'
     */
    public static int[] arrayCopy(int[] src, int start, int end) {
        /**
         * Calculating the number of iterations
         */
        int len = (end - start) + 1;

        /**
         * Initialising new int[] dest with the size len to copy the part of int[] src into.
         */
        int[] dest = new int[len];

        /**
         * Iterating through src[] starting at index 'start' until index 'end',
         * copying 'len' number of elements into dest[].
         */
        for (int i = 0; i < len; i++) {
            dest[i] = src[start];
            start++;
        }
        return dest;
    }

    /**
     * Computes the sum of all the elements in one 2D integer array.
     * @param array  A 2D integer array
     * @return sum ; an integer value ; the sum of all elements in the 2D array.
     */
    public static int sum2DArray(int[][] array) {

        //iterating through all elements of the 2D array and adding them into the variable sum.
        int sum = 0;
        for ( int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    /**
     * Computes the hamming distance between two arrays
     * @param arr1  A 1D integer array
     * @param arr2  A 1D integer array
     * @return hammingDist ; the computed hamming distance between 'arr1' and 'arr2'
     * @return 0; if both int arrays are of different lengths and thus, invalid inputs.
     */
    public static int hammingDistance(int[] arr1, int[] arr2) {

        //storing the lengths of arrays in new variables
        int lenArray1 = arr1.length;
        int lenArray2 = arr2.length;

        boolean retValue = true;
        int hammingDist = 0;

        /**
         * Checking if both arrays' lengths are equal, if not they are not the same,
         * the arrays cannot be equal.
         */
        if ( lenArray1 != lenArray2) {
            System.out.println("Both int arrays are of different lengths!");
            return 0;
        }

        /**
         * Iterating through all elements of both arrays, checking if they are equal.
         * Incrementing the hamming distance counter hammingDist when a mismatch is found.
         * Returning hammingDist after iterations.
         */
        for (int i = 0; i < lenArray1; i++) {
            if (arr1[i] != arr2[i]) {
                hammingDist++;
            }
        }
        return hammingDist;
    }

    /**
     * Finds the index of the key in a soorted array using recursive binary search
     * @param array  A 1D integer array
     * @param startIndex  The starting index input in the search
     * @param endIndex  The ending index input in the search
     * @param key  an integer
     * @return mid ; the index at which key is found in the sorted array 'array'
     * @return -1; if key was not found in the array after completing recursive binary search
     */
    public static int binarySearch(int[] array, int startIndex, int endIndex, int key) {

        //Checking is entries for endIndex and startIndex are valid.
        if (endIndex >= startIndex) {

            //Finding the mid-point index of the array
            int mid = startIndex + (endIndex - startIndex) / 2;

            //Checking if the element at the mid-point index matches the key, If it does, returning its index
            if (array[mid] == key) {
                return mid;
            }

            /**
             * If key does not match with mid-point index,
             * starting another binary search with the half in which it is likely
             * to exist.
             * Left-half if key is smaller than "mid"
             * Right-half if key is larger than "mid"
             */
             if (array[mid] < key) {
                return binarySearch(array, mid + 1, endIndex, key);
            }
            else {
                return binarySearch(array, startIndex, mid - 1, key);
            }
        }

        //Printing an error statement and returning -1, when key is not found in array.
        System.out.println("Key not found in array!");
        return -1;
    }
}
