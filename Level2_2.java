import java.util.Scanner;

public class Level2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age for " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height for " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Initialize tracking variables
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i < friends.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display findings
        System.out.println("\nThe youngest friend is: " + friends[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex]);
        sc.close();
    }
}