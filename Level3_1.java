import java.util.Scanner;

public class Level3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Take the input for a number
        System.out.print("Enter a number to find digit frequency: ");
        if (!sc.hasNextLong()) {
            System.err.println("Invalid input. Please enter a valid number.");
            System.exit(1);
        }
        long inputNumber = sc.nextLong();
        long tempNumber = Math.abs(inputNumber);
        long numberForCounting = tempNumber;

        // 2. Find the count of digits in the number to define array size
        int digitCount = 0;
        if (numberForCounting == 0) {
            digitCount = 1;
        } else {
            while (numberForCounting > 0) {
                numberForCounting /= 10;
                digitCount++;
            }
        }

        // 3. Find the digits in the number and save them in an array
        int[] digitsArray = new int[digitCount];
        numberForCounting = tempNumber; // Reset for extraction
        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = (int)(numberForCounting % 10);
            numberForCounting /= 10;
        }

        // 4. Find the frequency of each digit using an array of size 10
        // The index 0-9 represents the digit, and the value represents its count
        int[] frequencyArray = new int[10];
        
        // Loop through the digits array and increase the frequency count
        for (int i = 0; i < digitsArray.length; i++) {
            int digitValue = digitsArray[i];
            frequencyArray[digitValue]++;
        }

        // 5. Display the frequency of each digit
        System.out.println("\nDigit Frequency Table for " + inputNumber + ":");
        System.out.println("---------------------------------");
        System.out.println("Digit | Frequency");
        System.out.println("---------------------------------");
        for (int i = 0; i < frequencyArray.length; i++) {
            // Only display digits that appeared at least once
            if (frequencyArray[i] > 0) {
                System.out.println("  " + i + "   |    " + frequencyArray[i]);
            }
        }
        
        sc.close();
    }
}