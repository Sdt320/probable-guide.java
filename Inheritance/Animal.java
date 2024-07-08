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
