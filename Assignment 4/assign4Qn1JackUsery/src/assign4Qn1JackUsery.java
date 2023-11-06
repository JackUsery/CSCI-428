/*







 */

import java.io.*;
import java.util.Scanner;

public class assign4Qn1JackUsery {



    public static void main(String[] args) {
        
        // create a new scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the directory name
        System.out.print("Enter the directory name: " );

        // assign the user input to a string variable
        String dirName = input.nextLine();

        // create a new file object with the user input
        File inputDir = new File(dirName);

        // check if the directory exists
        if (inputDir.exists()) {
            // display that the directory already exists
            System.out.println("Directory already exists");
            // exit the program
            System.exit(1);
        } else {
            // create the directory
            System.out.println("Directory created successfully");
            inputDir.mkdirs();
        }
    }

    // directorySize method
   public static int directorySize(File directory) {

       int size = 0; // initialize size to 0

       if (directory.isDirectory()) {
           File[] files = directory.listFiles(); // create an array of files


           for (int i = 0; i < files.length; i++) {

               if (files[i].isFile()) {
                   size++;
               } else {
                   size += directorySize(files[i]);
               }
           }
       }
       return size;
   }
}