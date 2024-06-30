Here is a Java program that checks whether a given number is prime or not. The program will prompt the user to enter a number, and then it will determine and display whether the number is prime.

### PrimeNumberChecker.java

```java
import java.util.Scanner;

public class PrimeNumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("Entered number is a Prime number.");
        } else {
            System.out.println("Entered number is not a Prime number.");
        }

        scanner.close();
    }
}
```

### Explanation

1. **Importing Scanner**: The `java.util.Scanner` is imported to read user input from the console.
2. **isPrime Method**: 
    - It checks if a number is prime.
    - Numbers less than or equal to 1 are not prime.
    - It checks divisibility from 2 up to the square root of the number. If the number is divisible by any of these, it is not prime.
3. **Main Method**:
    - It creates a `Scanner` object to read input from the user.
    - It prompts the user to enter a number.
    - It calls the `isPrime` method to check if the number is prime.
    - It prints the appropriate message based on the result.
    - It closes the `Scanner` to prevent resource leaks.

### How to Run

1. Save the code in a file named `PrimeNumberChecker.java`.
2. Open a terminal or command prompt.
3. Navigate to the directory where the file is saved.
4. Compile the program using the command:
   ```sh
   javac PrimeNumberChecker.java
   ```
5. Run the program using the command:
   ```sh
   java PrimeNumberChecker
   ```
6. Enter a number when prompted to see if it is prime.

This program provides a simple and effective way to check for prime numbers and demonstrates basic user input and output handling in Java.
