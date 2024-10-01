public class Circle {
    // Instance variables
    private double radius;
    private double diameter;
    private double area;

    // Constructor
    public Circle() {
        radius = 1; // Default radius
        calculateDiameter();
        calculateArea();
    }

    // Method to set the radius
    public void setRadius(double rad) {
        radius = rad;
        calculateDiameter();
        calculateArea();
    }

    // Method to calculate diameter
    private void calculateDiameter() {
        diameter = 2 * radius;
    }

    // Method to calculate area
    private void calculateArea() {
        area = Math.PI * radius * radius;
    }

    // Getter methods
    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}
