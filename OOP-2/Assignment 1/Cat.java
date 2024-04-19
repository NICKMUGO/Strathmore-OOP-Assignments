
public class Cat extends Animal {

    // Fields

    // Constructors
    public Cat(String name) {
        super(name);
    }

    // Methods
    @Override
    public String makeSound(){
        return "The cat says meow";
    }

    @Override
    public String getInfo() throws InvalidAnimalException {
        validateName();
        return "Cat: " + name;
    }
}
