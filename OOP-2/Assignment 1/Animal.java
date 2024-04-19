public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Methods
    public abstract String makeSound();
    public abstract String getInfo() throws InvalidAnimalException;

    public void sleep(){
        System.out.println("Zzz");
    }

    public void validateName() throws InvalidAnimalException {
        if (name == null || name.isEmpty()) {
            throw new InvalidAnimalException("Animal name cannot be null or empty");
        }
    }
}