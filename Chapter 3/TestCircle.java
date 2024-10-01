public class TestCircle {
    public static void main(String[] args) {
        // Create three Circle objects
        Circle a = new Circle();
        Circle b = new Circle();
        
        // Set the radius of the first circle
        a.setRadius(3);
        // Print the radius, diameter, and area of the first circle
        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of the first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());
        System.out.println();

        // Set the radius of the second circle
        b.setRadius(20);
        // Print the radius, diameter, and area of the second circle
        System.out.println("Radius of the second circle: " + b.getRadius());
        System.out.println("Diameter of the second circle: " + b.getDiameter());
        System.out.println("Area of the second circle: " + b.getArea());
    }
}