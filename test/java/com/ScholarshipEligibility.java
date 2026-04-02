import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Details
        System.out.print("Enter your marks percentage: ");
        double marks = sc.nextDouble();

        System.out.print("Enter annual family income (in ₹): ");
        double income = sc.nextDouble();

        System.out.print("Enter your category (SC/ST/OBC/General): ");
        String category = sc.next();

        // Eligibility Criteria
        boolean isQualified = false;
        
        // Example Rule: Marks > 60%, Income < 2.5 lakh, Must be SC/ST/OBC
        if (marks >= 60.0 && income <= 250000 && 
           (category.equalsIgnoreCase("SC") || 
            category.equalsIgnoreCase("ST") || 
            category.equalsIgnoreCase("OBC"))) {
            isQualified = true;
        }

        // Output Result
        if (isQualified) {
            System.out.println("Congratulations! You are eligible for the scholarship.");
        } else {
            System.out.println("Sorry, you do not meet the criteria.");
        }
        
        sc.close();
    }
}
