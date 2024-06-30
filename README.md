# probable-guide.java
In Object-Oriented Programming (OOP), classes and objects are core concepts. Let's dive into their definitions, usage, and examples in Java.

### Class
A class is a blueprint or prototype that defines the attributes (fields) and behaviors (methods) that objects of the class can have. It serves as a template for creating objects.

- **Defining a Class**: In Java, a class is defined using the `class` keyword followed by the class name. The class body is enclosed within curly braces `{}`.

```java
public class Car {
    // Fields (attributes)
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method (behavior)
    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}
```

### Object
An object is an instance of a class. When a class is defined, no memory is allocated until an object of that class is created. Objects are created using the `new` keyword followed by the class constructor.

- **Creating an Object**: You create an object by using the class name and the `new` keyword.

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2020);
        
        // Calling a method on the object
        myCar.displayInfo();
    }
}
```

### Example Breakdown

1. **Class Definition**:
    - `Car` class has three fields: `color`, `model`, and `year`.
    - The constructor `Car(String color, String model, int year)` initializes the object's fields.
    - The method `displayInfo()` prints the car's details.

2. **Object Creation**:
    - `Car myCar = new Car("Red", "Toyota", 2020);` creates a new instance of the `Car` class with specified values.
    - `myCar.displayInfo();` calls the `displayInfo` method on the `myCar` object to display the car's details.

### Accessing Fields and Methods
You can access the fields and methods of an object using the dot operator (`.`).

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2020);
        
        // Accessing fields
        System.out.println("Model: " + myCar.model);
        System.out.println("Color: " + myCar.color);
        System.out.println("Year: " + myCar.year);
        
        // Modifying fields
        myCar.color = "Blue";
        
        // Calling a method
        myCar.displayInfo(); // Updated color will be displayed
    }
}
```

### Summary

- **Class**: A blueprint that defines the attributes and methods of objects. It does not allocate memory until an object is created.
- **Object**: An instance of a class with a specific state and behavior. It is created using the `new` keyword followed by the class constructor.

If you have any specific questions or need more examples related to classes and objects, feel free to ask!
