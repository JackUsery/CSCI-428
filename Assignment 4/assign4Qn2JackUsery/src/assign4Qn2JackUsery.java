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