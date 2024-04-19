public class Dog extends Animal {

    // Fields

    // Constructors
    public Dog(String name) {
        super(name);
    }

    // Methods
    @Override
    public String makeSound () {
        return "This dog says Woof ";
    }
    @Override
    public String getInfo() throws InvalidAnimalException {
        validateName();
        return "Dog: " + name;
    }
}
