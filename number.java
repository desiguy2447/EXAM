import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        int[] randomNumbers = new int[500];
        Random random = new Random();

        // Generate 500 random numbers
        for (int i = 0; i < 500; i++) {
            randomNumbers[i] = random.nextInt(1000); // Generate random numbers between 0 and 999
        }

        // Sort the array of random numbers
        Arrays.sort(randomNumbers);

        // Ask the user for the value of N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N for the Nth smallest number: ");
        int n = scanner.nextInt();

        // Print the nth smallest number
        if (n > 0 && n <= 500) {
            System.out.println("The " + n + "th smallest number is: " + randomNumbers[n - 1]);
        } else {
            System.out.println("Invalid input. Please enter a value between 1 and 500.");
        }
    }
}
