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
