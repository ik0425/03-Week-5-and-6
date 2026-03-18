import java.util.Scanner;

public class Level2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a very large integer: ");
        long number = sc.nextLong();
        number = Math.abs(number);
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Process digits with dynamic array resizing
        while (number != 0) {
            // Check if array is full
            if (index == maxDigit) {
                // Increase maxDigit size by 10
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                
                // Copy old array values into the new temp array
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                
                // Assign digits array to the larger temp array
                digits = tempArray;
                System.out.println("...Array resized to " + maxDigit + "...");
            }

            // Extract and store digit
            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        // Find largest and second largest from the full set of digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Processed " + index + " digits.");
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        sc.close();
    }
}