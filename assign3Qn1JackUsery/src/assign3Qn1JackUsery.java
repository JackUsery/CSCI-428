/**
 * This program creates a 2D array of size 20x30 and fills it with 0s and 1s in a checkerboard pattern. Then fills the top and bottom rows with 0s. Then computes the sum of the elements in the array and prints the array in tabular form.
 *
 * @author  Usery Jack
 * @assignment CSCI 428 Assignment 3 Question 1
 * @date 10/10/2023
 */


public class assign3Qn1JackUsery {

    public static void main(String[] args) {
        // declare the 2D array
        int[][] board = new int[20][30];
        // fill the array with 0
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                board[i][j] = 0;
            }
        }
        // fill elements with 0s and 1s in a checkerboard pattern
        for (int i = 0; i < board.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < board[1].length; j++) {
                    if (j % 2 == 0) {
                        board[i][j] = 0;
                    } else {
                        board[i][j] = 1;
                    }
                }
            } else {
                for (int j = 0; j < board[1].length; j++) {
                    if (j % 2 == 0) {
                        board[i][j] = 1;
                    } else {
                        board[i][j] = 0;
                    }
                }
            }
        }
        // fill the top and bottom rows with 0s
        for (int i = 0; i < board[1].length; i++) {
            board[0][i] = 0;
            board[board.length - 1][i] = 0;
        }
        // compute the sum of the elements in the array
        int sum = 0;
        for (int[] ints : board) {
            for (int j = 0; j < board[1].length; j++) {
                sum += ints[j];
            }
        }
        // print the array in tabular form
        for (int[] ints : board) {
            for (int j = 0; j < board[1].length; j++) {
                System.out.printf("%d ", ints[j]);
            }
            System.out.println();
        }
    }
}