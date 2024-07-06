To create a simple Java program that demonstrates multithreading by extending the `Thread` class, you can follow the example below. This example will include a `SampleThread` class that extends `Thread` and overrides its `run` method to print a message.

### SampleThread.java

```java
public class SampleThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        SampleThread thread = new SampleThread();
        thread.start();
    }
}
```

### Explanation

1. **Extending Thread**: The `SampleThread` class extends the `Thread` class.
2. **Overriding run Method**: The `run` method is overridden to define the code that should run in the thread.
3. **Creating and Starting the Thread**: In the `main` method, an instance of `SampleThread` is created and started using the `start` method. The `start` method calls the `run` method in a new thread.

### How to Run

1. Open your Java development environment.
2. Create a new file named `SampleThread.java`.
3. Copy and paste the code above into the file.
4. Compile the file using the command:
   ```sh
   javac SampleThread.java
   ```
5. Run the compiled program using the command:
   ```sh
   java SampleThread
   ```

When you run the program, it should output:
```
Thread is running...
```

This demonstrates the basic concept of creating and running a thread in Java by extending the `Thread` class.
