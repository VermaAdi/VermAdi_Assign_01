package Assign01;
import java.util.Scanner;

/**
 * Name: Aditya Verma
 * Date: Feb 7, 2022
 * Description: Assignment 01 "Arrays" Test Class Submission for CS321.
 */
public class Test {
    /**
     * Tests all functions in the class "Arrays".
     * @param args A string array containing the command line arguments
     */
    public static void main(String[] args) {

        //test for equals()
        System.out.println("--------------------------------------------------------------------");
        int[] testEquals1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] testEquals2 = new int[]{1, 12, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean retEquals = Arrays.equals(testEquals1, testEquals2);
        System.out.print("equals() result: " + retEquals + "\n");

        //test for arrayCopy()
        System.out.println("--------------------------------------------------------------------");
        int[] testArray = new int[] {1, 2, 3, 4, 5, 6};
        int[] testArrayCopy = Arrays.arrayCopy(testArray, 0, 2);
        System.out.print("arrayCopy() result: ");
        for(int i = 0; i < testArrayCopy.length; i++) {
            System.out.print(testArrayCopy[i] + " ");
        }
        System.out.println();

        //test for sum2DArray()
        System.out.println("--------------------------------------------------------------------");
        int[][] arr2D = {{2, 8, 10}, {1, 49, 5, 20}, {5, 10}};
        int sum2D = Arrays.sum2DArray(arr2D);
        System.out.println("Sum of 2D array = " + sum2D);

        /**
         * Tests for hammingDistance(), existing test arrays and custom user-input arrays (BONUS)
         */
        System.out.println("--------------------------------------------------------------------");
        int[] arr1 = new int[] {0,1,1,0};
        int[] arr2 = new int[] {1,1,1,1};
        int hammDist1 = Arrays.hammingDistance(arr1, arr2);
        System.out.println("Hamming Distance for Array Set 1 = " + hammDist1);

        int[] array1 = new int[] {1, 0, 1, 0};
        int[] array2 = new int[] {0, 1, 0, 1};
        int hammDist2 = Arrays.hammingDistance(array1, array2);
        System.out.println("Hamming Distance for Array Set 2 = " + hammDist2);

        System.out.println("\n-------------------------------BONUS--------------------------------");
        //BONUS 5% ! User Input Arrays' Hamming Distance Calculator
        Scanner scanner = new Scanner(System.in);
        int arrayLen = 0;

        System.out.println();
        //scanning the length of arrays the user wants to enter.
        System.out.println("Calculate the Hamming Distance for your own custom 2 arrays!");
        System.out.println("How many integers will be in your array?");
        if (scanner.hasNextInt()) {
            arrayLen = scanner.nextInt();
        }

        int[] userArr1 = new int[arrayLen];
        int[] userArr2 = new int[arrayLen];

        //initialising every "userArr1" array element using Scanner user input
        for(int i = 0; i < arrayLen; i++) {
            System.out.printf("Please Enter Element Number %d for the 1st Array ", i + 1);
            if (scanner.hasNextInt()) {
                userArr1[i] = scanner.nextInt();
            }
        }
        System.out.println();

        //initialising every "userArr2" array element using Scanner user input
        for(int i = 0; i < arrayLen; i++) {
            System.out.printf("Please Enter Element Number %d for the 2nd Array ", i + 1);
            if (scanner.hasNextInt()) {
                userArr2[i] = scanner.nextInt();
            }
        }
        System.out.println();

        //Displaying userArr1. First Array that the user entered.
        System.out.print("First Array you entered is: ");
        for (int i = 0; i < userArr1.length; i++) {
            System.out.print(userArr1[i] + " ");
        }

        //Displaying userArr2. Second Array that the user entered.
        System.out.print("\nSecond Array you entered is: ");
        for (int i = 0; i < userArr2.length; i++) {
            System.out.print(userArr2[i] + " ");
        }
        System.out.println();

        //Calculating the hamming distance and displaying it.
        int hammDist3 = Arrays.hammingDistance(userArr1, userArr2);
        System.out.println("Hamming Distance for User Input Array Set = " + hammDist3);

        /**
         * Testing binarySearch()
         */
        System.out.println("--------------------------------------------------------------------");
        int [] binarySearchTestArray = new int[] {1, 3, 5, 7, 10, 11, 12};
        int resIndex = Arrays.binarySearch(binarySearchTestArray, 0, binarySearchTestArray.length, 5);
        System.out.println("Recursive Binary Search found key to be at index: " + resIndex);
    }
}
