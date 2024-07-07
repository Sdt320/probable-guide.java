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

