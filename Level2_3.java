import java.util.Scanner;

public class Level2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter an integer number: ");
        long number = sc.nextLong();
        
        // Handle negative numbers by converting to positive
        number = Math.abs(number);
        
        // Define array with maxDigit size of 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits until number is 0
        while (number != 0) {
            // Break if we reach the max array size
            if (index == maxDigit) {
                break;
            }
            
            // Extract last digit and add to array
            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
        }

        // Variables for largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find top two digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        sc.close();
    }
}