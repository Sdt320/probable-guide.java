public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();  // Output: Generic Animal makes a sound

        Dog dog = new Dog("Rex");
        dog.makeSound();  // Output: Rex barks
        dog.fetch();      // Output: Rex is fetching the ball
    }
}
