Let's expand on your provided `Main` class to include the `Operation` class that performs the mathematical operations. Below is a complete version with both classes, `Main` and `Operation`, working together.

### Main.java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag = 1;
        Scanner s = new Scanner(System.in);

        while (flag == 1) {
            System.out.println("Hello, let's do Mathematical operations");
            System.out.print("Do you like to continue? (1 for yes, 0 for no): ");
            flag = s.nextInt();

            if (flag != 1) {
                break;
            }

            System.out.print("Enter the first value: ");
            int num1 = s.nextInt();
            System.out.print("Enter the second value: ");
            int num2 = s.nextInt();

            Operation o = new Operation(num1, num2);
            o.Mathopr();
        }
        s.close();
    }
}
```

### Operation.java

```java
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
```

### Explanation

1. **Main Class**:
    - A `while` loop runs as long as the user chooses to continue (`flag == 1`).
    - The user is prompted to enter two integer values.
    - An `Operation` object is created with the entered values.
    - The `Mathopr` method of the `Operation` object is called to perform the chosen mathematical operation.

2. **Operation Class**:
    - Contains methods for addition, subtraction, multiplication, and division.
    - The `Mathopr` method displays a menu for the user to choose an operation and calls the corresponding method based on the user's choice.

### How to Compile and Run

1. Save the `Main` class in a file named `Main.java`.
2. Save the `Operation` class in a file named `Operation.java`.
3. Open a terminal or command prompt and navigate to the directory where the files are saved.
4. Compile both files using the command:
   ```sh
   javac Main.java Operation.java
   ```
5. Run the `Main` program using the command:
   ```sh
   java Main
   ```
6. Follow the on-screen instructions to perform the desired mathematical operations.
