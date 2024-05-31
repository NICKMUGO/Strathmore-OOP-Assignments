package DecoratorDesignPattern; //why must you import this

public class Demo {

    // Fields

    // Constructors

    // Methods

    // Main method (if applicable)
    public static void main(String[] args) {
        Area rectangle= new Rectangle(3, 4);

        Area rectangle_inches= new Areaininches(rectangle);

        Area rectangle_cm = new Areaincm(rectangle);

        rectangle_inches.getarea();
        rectangle_cm.getarea();

        System.out.println("This is a rectangle" + rectangle_inches.getarea());

        System.out.println("This is a rectangle" + rectangle_cm.getarea());
    }
}
