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
