import java.util.Scanner;

public class Level1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] dataPoints = new double[10];
        double totalSum = 0.0;
        int currentIndex = 0;

        System.out.println("Enter up to 10 numbers (Enter 0 or negative to stop):");

        // Infinite loop with break conditions
        while (true) {
            // Check if array is full
            if (currentIndex >= 10) {
                System.out.println("Limit of 10 numbers reached.");
                break;
            }

            double inputVal = sc.nextDouble();

            // Check for exit condition
            if (inputVal <= 0) {
                break;
            }

            // Store value and increment index
            dataPoints[currentIndex] = inputVal;
            currentIndex++;
        }

        // Calculate total using a for loop
        System.out.print("Numbers entered: ");
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(dataPoints[i] + " ");
            totalSum += dataPoints[i];
        }

        System.out.println("\nTotal Sum: " + totalSum);
        sc.close();
    }
}