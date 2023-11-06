/*







 */

import java.io.*;
import java.util.Scanner;

public class assign4Qn1JackUsery {



    public static void main(String[] args) {


        // create a new scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the directory name
        System.out.print("Enter the File name: " );

        // assign the user input to a string variable
        String fileName = input.nextLine();

        // create a new file object with the user input
        File inputFile = new File(fileName);

        // check if the directory exists
        if (inputFile.exists()) {
            // display that the directory already exists
            System.out.println("Directory already exists");
            // exit the program
            System.exit(1);
        } else {
            // create the directory
            System.out.println("Directory created successfully");
            inputFile.mkdirs();
        }

    }
}