/*





*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;

public class assign4Qn1JackUsery {



    public static void main(String[] args) {

        // Prompt the user to enter a directory name
        System.out.print("Enter directory name: ");
        Scanner scanner = new Scanner(System.in);
        String directoryName = scanner.nextLine();

        // Create a new directory
        boolean directoryCreated = createDirectory(directoryName);

        if (directoryCreated) {
            System.out.println("Directory created successfully");
            // Measure the directory size
            int fileSize = directorySize(directoryName);
            System.out.println("Number of files in the directory: " + fileSize);

            // Create a file to save a large dataset
            String fileName = "input.txt";
            generateDataset(directoryName, fileName);
            System.out.println("Dataset created and saved as " + fileName);

            String outputFileName = "output.txt";
            processData(directoryName, fileName, outputFileName);
        } else {
            System.out.println("Directory already exists");
        }
    }

    // Create a new directory and return true if successful, false if it already exists
    private static boolean createDirectory(String directoryName) {
        File directory = new File(directoryName);
        if (!directory.exists()) {
            return directory.mkdirs();
        }
        return false;
    }

    // Measure the directory size using the listFiles method
    private static int directorySize(String directoryName) {
        File directory = new File(directoryName);
        File[] files = directory.listFiles();
        if (files != null) {
            return files.length;
        }
        return 0;
    }

    // Generate a dataset and save it to a file
    private static void generateDataset(String directoryName, String fileName) {
        File directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        String filePath = directoryName + File.separator + fileName;

        try (PrintWriter writer = new PrintWriter(filePath)) {
            Random random = new Random();

            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = getRandomRank();
                double salary = getRandomSalary(rank);

                String line = firstName + " " + lastName + " " + rank + " $" + String.format("%.2f", salary);
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to generate a random rank
    private static String getRandomRank() {
        String[] ranks = {"entry", "middle", "senior"};
        Random random = new Random();
        return ranks[random.nextInt(ranks.length)];
    }

    // Helper method to generate a random salary based on rank
    private static double getRandomSalary(String rank) {
        Random random = new Random();
        switch (rank) {
            case "entry":
                return 40000 + random.nextDouble() * 20000;
            case "middle":
                return 40000 + random.nextDouble() * 110000;
            case "senior":
                return 75000 + random.nextDouble() * 225000;
            default:
                return 0;
        }
    }

    private static void processData(String directoryName, String inputFileName, String outputFileName) {
        double totalSalaryEntry = 0, totalSalaryMiddle = 0, totalSalarySenior = 0, totalSalaryAll = 0;
        int countEntry = 0, countMiddle = 0, countSenior = 0, totalCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(directoryName + File.separator + inputFileName));
             PrintWriter writer = new PrintWriter(directoryName + File.separator + outputFileName)) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String rank = parts[2];
                double salary = Double.parseDouble(parts[3].substring(1)); // remove the "$" sign

                switch (rank) {
                    case "entry":
                        totalSalaryEntry += salary;
                        countEntry++;
                        break;
                    case "middle":
                        totalSalaryMiddle += salary;
                        countMiddle++;
                        break;
                    case "senior":
                        totalSalarySenior += salary;
                        countSenior++;
                        break;
                }

                totalSalaryAll += salary;
                totalCount++;
            }

            // Calculate average salaries
            double averageSalaryEntry = countEntry > 0 ? totalSalaryEntry / countEntry : 0;
            double averageSalaryMiddle = countMiddle > 0 ? totalSalaryMiddle / countMiddle : 0;
            double averageSalarySenior = countSenior > 0 ? totalSalarySenior / countSenior : 0;
            double averageSalaryAll = totalCount > 0 ? totalSalaryAll / totalCount : 0;

            // Save results to output.txt
            writer.println("Total Salary for Entry Level: $" + totalSalaryEntry);
            writer.println("Average Salary for Entry Level: $" + averageSalaryEntry);
            writer.println("Total Salary for Middle Level: $" + totalSalaryMiddle);
            writer.println("Average Salary for Middle Level: $" + averageSalaryMiddle);
            writer.println("Total Salary for Senior Level: $" + totalSalarySenior);
            writer.println("Average Salary for Senior Level: $" + averageSalarySenior);
            writer.println("Total Salary for All Employees: $" + totalSalaryAll);
            writer.println("Average Salary for All Employees: $" + averageSalaryAll);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}