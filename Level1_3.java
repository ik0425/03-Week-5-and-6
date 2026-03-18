import java.util.Scanner;

public class Level1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its table: ");
        
        int baseNumber = sc.nextInt();
        int[] tableResults = new int[10];

        // Store results in the array
        for (int i = 0; i < tableResults.length; i++) {
            // Index 0 stores baseNumber * 1
            tableResults[i] = baseNumber * (i + 1);
        }

        // Display results
        System.out.println("Multiplication Table for " + baseNumber + ":");
        for (int i = 0; i < tableResults.length; i++) {
            System.out.println(baseNumber + " * " + (i + 1) + " = " + tableResults[i]);
        }
        sc.close();
    }
}