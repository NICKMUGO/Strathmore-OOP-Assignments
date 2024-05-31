package FactoryDesignPattern;
public abstract class Shape {

    // Fields
    public abstract String getProperties();

    // Constructors
    public static Shape createShape(String type){
        if (type.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if (type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else if (type.equalsIgnoreCase("square")){
            return new Square();
            }
        return null;
    }

    // Methods

    // Main method (if applicable)
    public static void main(String[] args) {
        Shape circle = Shape.createShape("circle");

        if (circle != null) {
            System.out.println(circle.getProperties());
        } else {
            System.out.println("Invalid shape type.");
        }
    }
}
