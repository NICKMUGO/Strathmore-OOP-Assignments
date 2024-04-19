// Main class
public class Main {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        
        // Creating instances of Dog, Cat, and Bird
        Animal dog = new Dog("Kola");
        Animal cat = new Cat("Penny");
        Animal bird = new Bird("Sparrow");
        
        // Demonstrating polymorphism
        animalManager.displayAnimalDetails(dog);
        animalManager.displayAnimalDetails(cat);
        animalManager.displayAnimalDetails(bird);
        
        // Testing invalid animal name
        Animal invalidAnimal = new Dog("");
        animalManager.displayAnimalDetails(invalidAnimal);
    }
}
