// Define your class
public class LZBuilder {
    // Create your fields
    double radius;
    final double PI = 3.14159;
    // No-arg constructor that sets radius to 0.0
    public LZBuilder() {
        radius = 0;
    }
    public LZBuilder(double radius2) {
        radius = radius2;
    }

    // Method to set the radius
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative");
        }
    }
    // Method to retrieve the radius
    public double getRadius() {
        return radius;
    }
    // Method to retrieve the area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // Method to retrieve the diameter
    public double getDiameter() {
        return radius * radius;
    }
    // Method to retrieve the circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
}
}