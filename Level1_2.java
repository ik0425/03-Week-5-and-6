import java.util.Scanner;

public class Level1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get user input for 5 elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {
            int val = numbers[i];
            if (val > 0) {
                String parity = (val % 2 == 0) ? "even" : "odd";
                System.out.println(val + " is positive and " + parity);
            } else if (val < 0) {
                System.out.println(val + " is negative");
            } else {
                System.out.println(val + " is zero");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than the last.");
        } else {
            System.out.println("First element is less than the last.");
        }
        input.close();
    }
}