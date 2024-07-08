In Java, constructors are special methods used to initialize objects. When an object is created, the constructor is called to set up the initial state of the object. Constructors have the same name as the class and do not have a return type, not even `void`.

### Key Points about Constructors

1. **Constructor Name**: Must match the class name.
2. **No Return Type**: Constructors do not have a return type, not even `void`.
3. **Default Constructor**: If no constructor is provided, Java provides a default constructor with no parameters.
4. **Parameterized Constructors**: Constructors can accept parameters to initialize object attributes with specific values.
5. **Constructor Overloading**: A class can have multiple constructors with different parameter lists (overloading).
6. **Constructor Invocation**: Constructors are invoked using the `new` keyword when creating an instance of the class.

### Example: Constructors in Java

Let's create a class `Person` with both a default constructor and a parameterized constructor.

### Person.java

```java
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
```

### Explanation

1. **Default Constructor**:
   - The default constructor initializes the `name` to `"Unknown"` and the `age` to `0`.
   - This constructor is called when an object is created without any parameters.

2. **Parameterized Constructor**:
   - The parameterized constructor allows the user to set the `name` and `age` when creating the object.
   - This constructor is called when an object is created with specific values.

3. **Constructor Invocation**:
   - `Person person1 = new Person();` calls the default constructor.
   - `Person person2 = new Person("Alice", 30);` calls the parameterized constructor.

### Constructor Overloading

Constructor overloading is when a class has more than one constructor with different parameter lists. This allows the class to be initialized in different ways.

### Example: Constructor Overloading

### Person.java (Updated)

```java
public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
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
        // Create instances using different constructors
        Person person1 = new Person();
        person1.display();  // Output: Name: Unknown, Age: 0

        Person person2 = new Person("Alice");
        person2.display();  // Output: Name: Alice, Age: 0

        Person person3 = new Person("Bob", 25);
        person3.display();  // Output: Name: Bob, Age: 25
    }
}
```

### Explanation

1. **Three Constructors**:
   - The default constructor initializes the name and age to default values.
   - The constructor with one parameter initializes the name and sets the age to 0.
   - The parameterized constructor initializes both the name and the age to the provided values.

2. **Constructor Invocation**:
   - `Person person1 = new Person();` calls the default constructor.
   - `Person person2 = new Person("Alice");` calls the constructor with one parameter.
   - `Person person3 = new Person("Bob", 25);` calls the parameterized constructor with two parameters.

### Chaining Constructors with `this()`

You can call one constructor from another within the same class using the `this()` keyword. This can help reduce code duplication.

### Example: Constructor Chaining

### Person.java (Updated with Constructor Chaining)

```java
public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this("Unknown", 0);
    }

    // Constructor with one parameter
    public Person(String name) {
        this(name, 0);
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
        // Create instances using different constructors
        Person person1 = new Person();
        person1.display();  // Output: Name: Unknown, Age: 0

        Person person2 = new Person("Alice");
        person2.display();  // Output: Name: Alice, Age: 0

        Person person3 = new Person("Bob", 25);
        person3.display();  // Output: Name: Bob, Age: 25
    }
}
```

### Explanation

1. **Constructor Chaining**:
   - The default constructor calls the parameterized constructor with default values.
   - The constructor with one parameter calls the parameterized constructor with a default age.

2. **Reduced Code Duplication**:
   - Constructor chaining reduces code duplication by reusing the initialization logic in the parameterized constructor.

Using constructors and understanding their features is crucial for proper object initialization and code organization in Java.
