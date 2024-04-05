import java.util.ArrayList;
import java.util.Collections;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    private void setFilled(boolean filled) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFilled'");
    }

    private void setColor(String color) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setColor'");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Circle))
            return false;
        Circle other = (Circle) obj;
        return Double.compare(radius, other.radius) == 0;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    public static void main(String[] args) {
        // Creating some Circle objects
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(7);
        Circle circle4 = new Circle(3);

        // Comparing circles
        System.out.println("Circle 1 area: " + circle1.getArea());
        System.out.println("Circle 2 area: " + circle2.getArea());
        System.out.println("Circle 1 compared to Circle 2: " + circle1.compareTo(circle2));
        System.out.println("Circle 2 compared to Circle 1: " + circle2.compareTo(circle1));

        // Creating an ArrayList of Circle objects
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
        circles.add(circle4);

        // Sorting the ArrayList of circles
        System.out.println("Before sorting: " + circles);
        Collections.sort(circles);
        System.out.println("After sorting: " + circles);

        // Testing equals method
        System.out.println("Circle 2 equals Circle 4: " + circle2.equals(circle4));
    }
}