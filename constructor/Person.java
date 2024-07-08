public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create an instance using the default constructor
        Person person1 = new Person();
        person1.display();  // Output: Name: Unknown, Age: 0

        // Create an instance using the parameterized constructor
        Person person2 = new Person("Alice", 30);
        person2.display();  // Output: Name: Alice, Age: 30
    }
}
