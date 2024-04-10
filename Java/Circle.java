public class Circle {
    // Instance variable to store the radius
    private double radius;

    // Constructor to initialize the Circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method to retrieve the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return (float) (Math.PI * radius * radius);
    }

    // Method to calculate and return the perimeter (circumference) of the circle
    public double getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        // Example usage of the Circle class
        Circle myCircle = new Circle(5);

        // Displaying the radius, area, and perimeter of the circle
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Perimeter: " + myCircle.getPerimeter());

        // Updating the radius and displaying the updated information
        myCircle.setRadius(8);
        System.out.println("\nUpdated Radius: " + myCircle.getRadius());
        System.out.println("Updated Area: " + myCircle.getArea());
        System.out.println("Updated Perimeter: " + myCircle.getPerimeter());
    }
}