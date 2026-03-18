import java.util.Scanner;

public class Level1_1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        final int VOTING_AGE_THRESHOLD = 18;

        // Take user input for 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            if (inputScanner.hasNextInt()) {
                studentAges[i] = inputScanner.nextInt();
            } else {
                System.err.println("Invalid input. Please enter an integer.");
                System.exit(1);
            }
        }

        // Process and check eligibility
        for (int i = 0; i < studentAges.length; i++) {
            int currentAge = studentAges[i];
            
            // Validate age and check voting status
            if (currentAge < 0) {
                System.out.println("Invalid age: " + currentAge);
            } else if (currentAge >= VOTING_AGE_THRESHOLD) {
                System.out.println("The student with the age " + currentAge + " can vote.");
            } else {
                System.out.println("The student with the age " + currentAge + " cannot vote.");
            }
        }
        inputScanner.close();
    }
}