import java.util.Scanner;

public class Level2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EMPLOYEE_COUNT = 10;
        
        // Define arrays for salary and years of service
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        
        // Define arrays for new salary and bonus amount
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];

        // Variables for totals
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Loop to take input with validation
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("  Enter Salary: ");
            double sal = sc.nextDouble();
            System.out.print("  Enter Years of Service: ");
            double years = sc.nextDouble();

            // Validation: if invalid, decrement counter and ask again
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Values must be positive. Please try again.");
                i--; 
                continue;
            }
            salaries[i] = sal;
            yearsOfService[i] = years;
        }

        // Loop to calculate bonuses and salaries
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            // 5% if > 5 years, else 2%
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            // Accumulate totals
            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("\n--- Zara Company Payout Summary ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}