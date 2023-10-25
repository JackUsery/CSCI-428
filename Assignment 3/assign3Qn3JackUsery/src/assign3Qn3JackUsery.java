/**
 * This program will append two arrays, merge two arrays, and merge sort two arrays.
 *
 * @author     Usery Jack
 * @assignment CSCI 428 Assignment 3 Question 3
 * @date       10/18/2023
 */

import java.util.Arrays;

public class assign3Qn3JackUsery {
    public static void main(String[] args) {
        int[] a = {1, 4, 9, 16};
        int[] b = {9, 7, 4, 9, 11};
        int[] c = append(a, b);
        int[] d = merge(a, b);
        int[] e = mergeSort(a, b);

        // Print out c
        System.out.print("Append Array: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        // Print out d
        System.out.print("Merge Array: ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
        // Print out e
        System.out.print("Merge sorted Array: ");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }

    }

    // Append method
    public static int [] append(int[] a, int[] b) {
        int[] results = new int[a.length + b.length];

        // if i is less than the length of a
        for (int i = 0; i < a.length; i++) {
            // results at index i equals a at index i
            results[i] = a[i];
        }

        // if i is less than the length of b
        for (int i = 0; i < b.length; i++) {
            // results at index a.length + i equals b at index i
            results[a.length + i] = b[i];
        }

        return results;
    }

    // Merge method
    public static int [] merge(int[] a, int[] b) {
        // set the result array to the length of both arrays combined
        int[] results = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // while i is less than the length of a and j is less than the length of b
        while (i < a.length && j < b.length) {
            results[k++] = a[i++];
            results[k++] = b[j++];
        }

        // while i is less than the length of a
        while (i < a.length) {
            // results equals the value of a at index i
            // increment i and k
            results[k++] = a[i++];
        }

        // while j is less than the length of b
        while (j < b.length) {
            // results equals the value of b at index j
            // increment j and k
            results[k++] = b[j++];
        }

        return results;
    }

    // Merge sort method
    public static int [] mergeSort(int[] a, int[] b) {
        // set the result array to the length of both arrays combined
        int[] results = new int[a.length + b.length];

        // initialize i, j, and k to 0 to keep track of the indexes
        int i = 0;
        int j = 0;
        int k = 0;

        // while i is less that the length of a
        while (i < a.length) {
            // results equals the value of a at index i
            // increment i and k
            results[k++] = a[i++];
        }

        // while j is less that the length of b
        while (j < b.length) {
            // results equals the value of b at index j
            // increment j and k
            results[k++] = b[j++];
        }

        // sort the results of the array to be in ascending order
        Arrays.sort(results);

        return results;
    }
}