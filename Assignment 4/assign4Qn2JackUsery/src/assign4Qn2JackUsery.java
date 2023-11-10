/*
generates an array of 1000 random integers, prompts the user to enter an index between 0 and 1000, and prints the value at that index if it's within bounds; otherwise, it prints "Out of Bounds."

@Author Jack Usery

@Assignment 4 Qn 2

@Date 11/07/2023
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class assign4Qn2JackUsery {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] size = new int[1000];

        for (int i = 0; i < size.length; i++) {
            size[i] = random.nextInt(1000);
        }

        try {
            System.out.print("Enter an index between 0 and 1000: ");
            int index = scanner.nextInt();
            if (index < 0 || index > 1000) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                System.out.println("The number at index " + index + " is " + size[index]);
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
        finally {
            scanner.close();
        }
    }
}