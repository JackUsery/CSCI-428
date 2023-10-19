/**
 * This program prompts the user to enter the center coordinates and a point on the circle. The program then calculates
 * the radius, circumference, and area of the circle.
 *
 * @author  Usery Jack
 * @assignment CSCI 428 Assignment 3 Question 2
 * @date 10/10/2023
 */

import java.util.Scanner;

public class assign3Qn2JackUsery {

    public static final double PI = 3.1416;
    public static void main(String[] args) {

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt user for x1
        System.out.print("Enter the center x-coordinate: ");
        double center_x = scanner.nextDouble();

        // prompt user for y1
        System.out.print("Enter the center y-coordinate: ");
        double center_y = scanner.nextDouble();

        // prompt user for x2
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        // prompt user for y2
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // call radius method
        double radius = radius(center_x, center_y, x2, y2);

        // call diameter method
        double diameter = diameter(radius);

        // call circumference method
        double circumference = circumference(radius);

        // call area method
        double area = area(radius);

        // print results to two decimal places
        System.out.printf("The radius is %.2f\n", radius);
        System.out.printf("The diameter is %.2f\n", diameter);
        System.out.printf("The circumference is %.2f\n", circumference);
        System.out.printf("The area is %.2f\n", area);

        // close scanner object
        scanner.close();
    }


    // distance method
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // radius method
    public static double radius(double center_x, double center_y, double point_x, double point_y) {
        return distance(center_x, center_y, point_x, point_y);
    }

    // diameter method
    public static double diameter(double radius) {
        return 2 * radius;
    }

    // circumference method
    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    // area method
    public static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }
}