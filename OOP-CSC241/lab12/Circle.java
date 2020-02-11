public class Circle extends Shape {
    private double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return String.format("Circle (%.2f)", this.radius);
    }
}
