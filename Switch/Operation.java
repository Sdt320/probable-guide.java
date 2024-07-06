import java.util.Scanner;

public class Operation {
    private int num1;
    private int num2;

    public Operation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addition() {
        int result = num1 + num2;
        System.out.println("Result of addition: " + result);
    }

    public void subtraction() {
        int result = num1 - num2;
        System.out.println("Result of subtraction: " + result);
    }

    public void multiplication() {
        int result = num1 * num2;
        System.out.println("Result of multiplication: " + result);
    }

    public void division() {
        if (num2 != 0) {
            double result = (double) num1 / num2;
            System.out.println("Result of division: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public void Mathopr() {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
