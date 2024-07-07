Sure! Below is a sample Java program that demonstrates the use of static variables, methods, blocks, and nested classes all within a single `Main.java` file.

### Main.java

```java
public class Main {
    
    // Static variable
    static int count = 0;

    // Static block
    static {
        System.out.println("Static block executed.");
        count = 5;
    }

    // Static method
    static void displayCount() {
        System.out.println("Count is: " + count);
    }

    // Static nested class
    static class NestedClass {
        void show() {
            // Accessing static variable from the outer class
            System.out.println("Count from nested class is: " + count);
        }
    }

    public static void main(String[] args) {
        // Accessing static method without creating an instance
        displayCount();

        // Modifying static variable
        count += 10;
        displayCount();

        // Creating an instance of the static nested class
        NestedClass nested = new NestedClass();
        nested.show();
    }
}
```

### Explanation

1. **Static Variable**:
   ```java
   static int count = 0;
   ```

   This variable is shared among all instances of the `Main` class.

2. **Static Block**:
   ```java
   static {
       System.out.println("Static block executed.");
       count = 5;
   }
   ```

   This block is executed once when the class is loaded. It initializes the static variable `count`.

3. **Static Method**:
   ```java
   static void displayCount() {
       System.out.println("Count is: " + count);
   }
   ```

   This method can be called without creating an instance of the `Main` class. It prints the value of the static variable `count`.

4. **Static Nested Class**:
   ```java
   static class NestedClass {
       void show() {
           System.out.println("Count from nested class is: " + count);
       }
   }
   ```

   This nested class can access the static members of the outer class. In the `show` method, it prints the value of the static variable `count`.

5. **Main Method**:
   ```java
   public static void main(String[] args) {
       displayCount();

       count += 10;
       displayCount();

       NestedClass nested = new NestedClass();
       nested.show();
   }
   ```

   - The `main` method first calls the static method `displayCount` to print the initial value of `count`.
   - Then it modifies the static variable `count` and calls `displayCount` again to print the updated value.
   - Finally, it creates an instance of the static nested class `NestedClass` and calls its `show` method to print the value of `count`.

### How to Run

1. Save the above code in a file named `Main.java`.
2. Open a terminal or command prompt and navigate to the directory where the file is saved.
3. Compile the file using the command:
   ```sh
   javac Main.java
   ```
4. Run the compiled program using the command:
   ```sh
   java Main
   ```

### Expected Output

```
Static block executed.
Count is: 5
Count is: 15
Count from nested class is: 15
```

This example covers the use of `static` keyword in various contexts within a single Java program.
