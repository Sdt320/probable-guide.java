Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class to inherit fields and methods from another class. It promotes code reuse and establishes a natural hierarchy between classes.

### Key Points about Inheritance

1. **Base Class (Super Class)**: The class whose properties and methods are inherited by another class.
2. **Derived Class (Sub Class)**: The class that inherits the properties and methods from the base class.
3. **`extends` Keyword**: Used to declare inheritance in Java.
4. **`super` Keyword**: Used to refer to the immediate parent class object.

### Example: Inheritance in Java

Let's create a simple example to demonstrate inheritance. We'll have a base class `Animal` and a derived class `Dog`.

### Animal.java (Base Class)

```java
public class Animal {
    // Fields
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to display animal sound
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}
```

### Dog.java (Derived Class)

```java
public class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Call the constructor of the base class
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }

    // Method specific to Dog class
    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}
```

### Main.java (Testing the Inheritance)

```java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();  // Output: Generic Animal makes a sound

        Dog dog = new Dog("Rex");
        dog.makeSound();  // Output: Rex barks
        dog.fetch();      // Output: Rex is fetching the ball
    }
}
```

### Explanation

1. **Base Class `Animal`**:
   - Contains a protected field `name` and a constructor to initialize it.
   - Defines a method `makeSound` that can be overridden by derived classes.

2. **Derived Class `Dog`**:
   - Extends `Animal`, inheriting its fields and methods.
   - Calls the base class constructor using `super(name)`.
   - Overrides the `makeSound` method to provide a specific implementation for dogs.
   - Adds a new method `fetch` that is specific to the `Dog` class.

3. **Main Class**:
   - Demonstrates creating instances of `Animal` and `Dog`.
   - Calls methods on these instances to show inheritance and method overriding in action.

### Benefits of Inheritance

1. **Code Reuse**: Common functionality can be defined in a base class and reused in derived classes, reducing code duplication.
2. **Hierarchy and Organization**: Establishes a clear relationship between classes, making the code easier to understand and maintain.
3. **Polymorphism**: Allows objects to be treated as instances of their base class, enabling flexible and dynamic method calls.

### Access Control

- **private**: Members are not accessible outside the class.
- **protected**: Members are accessible within the same package and by subclasses.
- **public**: Members are accessible from any other class.
- **default (no modifier)**: Members are accessible within the same package.

### Example: Access Control in Inheritance

### Animal.java (Updated with Access Control)

```java
public class Animal {
    // Private field
    private String privateName;

    // Protected field
    protected String protectedName;

    // Public field
    public String publicName;

    // Default access field
    String defaultName;

    // Constructor
    public Animal(String name) {
        this.privateName = name;
        this.protectedName = name;
        this.publicName = name;
        this.defaultName = name;
    }

    // Public method
    public void displayNames() {
        System.out.println("Private Name: " + privateName);
        System.out.println("Protected Name: " + protectedName);
        System.out.println("Public Name: " + publicName);
        System.out.println("Default Name: " + defaultName);
    }
}
```

### Dog.java (Updated to Demonstrate Access Control)

```java
public class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Method to display names
    public void displayNames() {
        // System.out.println("Private Name: " + privateName); // Not accessible
        System.out.println("Protected Name: " + protectedName);
        System.out.println("Public Name: " + publicName);
        System.out.println("Default Name: " + defaultName); // Accessible within the same package
    }
}
```

### Main.java (Testing Access Control)

```java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.displayNames();  // Can access all fields within the class

        Dog dog = new Dog("Rex");
        dog.displayNames();     // Demonstrates access to protected, public, and default fields

        System.out.println("Public Name: " + dog.publicName);  // Public field is accessible
        // System.out.println("Protected Name: " + dog.protectedName); // Protected field not accessible outside the package or subclass
        // System.out.println("Default Name: " + dog.defaultName);     // Default field not accessible outside the package
    }
}
```

### Explanation

- The `private` field `privateName` is not accessible in the `Dog` class.
- The `protected` field `protectedName` is accessible in the `Dog` class because it is a subclass of `Animal`.
- The `public` field `publicName` is accessible everywhere.
- The default access field `defaultName` is accessible within the same package.

### Conclusion

Inheritance is a powerful feature in Java that allows for hierarchical class relationships, promoting code reuse, organization, and polymorphism. By understanding and utilizing inheritance effectively, you can write more modular, maintainable, and reusable code.
