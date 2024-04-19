// Concrete subclass: Bird
public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Chirp";
    }

    @Override
    public String getInfo() throws InvalidAnimalException {
        validateName();
        return "Bird: " + name;
    }

    @Override
    public String fly() {
        return "Bird is flying";
    }
}
