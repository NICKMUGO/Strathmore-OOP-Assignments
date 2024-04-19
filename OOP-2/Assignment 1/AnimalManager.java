public class AnimalManager {
    public void displayAnimalDetails(Animal animal) {
        try {
            animal.validateName(); 
            System.out.println(animal.makeSound());
            animal.sleep();
            if (animal instanceof Flyable) {
                Flyable flyableAnimal = (Flyable) animal;
                System.out.println(flyableAnimal.fly());
            }
            System.out.println(animal.getInfo());
        } catch (InvalidAnimalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}