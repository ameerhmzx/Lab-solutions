import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape[] shapesArray = new Shape[5];
        shapesArray[0] = new Rectangle();
        shapesArray[1] = new Circle();
        shapesArray[2] = new Square();
        shapesArray[3] = new Rectangle();
        shapesArray[4] = new Square();

        System.out.println(
                "\nSelect shape to change data:" +
                        "\n1- Circle" +
                        "\n2- Square" +
                        "\n3- Rectangle" +
                        "\n -1 to Exit");
        Scanner scanner = new Scanner(System.in);
        switch(scanner.nextInt()){
            case 1:
                System.out.print("Enter Radius: ");
                double radius = scanner.nextDouble();
                for(Shape shape : shapesArray)
                    if(shape instanceof Circle)
                        ((Circle) shape).setRadius(radius);
                break;
            case 2:
                System.out.print("Enter Side: ");
                double side = scanner.nextDouble();
                for(Shape shape : shapesArray)
                    if(shape instanceof Square)
                        ((Square) shape).setSide(side);
                break;
            case 3:
                System.out.print("Enter Length: ");
                double length = scanner.nextDouble();
                System.out.print("\nEnter Width: ");
                double width = scanner.nextDouble();
                for(Shape shape : shapesArray)
                    if(shape instanceof Rectangle) {
                        ((Rectangle) shape).setLength(length);
                        ((Rectangle) shape).setWidth(width);
                    }
                break;
            case -1:
                break;
        }

        shapesSummary(shapesArray);

    }

    private static void shapesSummary(Shape [] s){
        for (Shape shape: s){
            if(!(shape instanceof Circle)){
                System.out.println(shape);
            }
        }
    }
}


class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
        this.color = "green";
        this.filled = true;
        System.out.println("Inside Shape no-arg constructor.");
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        System.out.println("Inside Shape 2-arg constructor.");
    }

    public String getColor() {
        return this.color;
    }
    public boolean isFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A " + ((this.filled) ? "filled " : "unfilled "  ) + "shape with " + this.color + " color.";
    }
}



class Square extends Rectangle {
    public Square() {
        super();
        System.out.println("Inside Sqaure no-arg constructor.");
    }
    public Square(double side) {
        super(side, side);
        System.out.println("Inside Sqaure 1-arg constructor.");
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        System.out.println("Inside Sqaure 3-arg constructor.");
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }


    @Override
    public String toString() {
        return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString();
    }
}


class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return String.format("A circle with radius = %.1f ", getRadius()) + super.toString();
    }
}

class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
        System.out.println("Inside Rectangle no-arg constructor.");
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
        System.out.println("Inside Rectangle 2-arg constructor.");
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
        System.out.println("Inside Rectangle 4-arg constructor.");
    }

    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }
    public double getPerimeter() {
        return 2*this.length + 2*this.width;
    }


    @Override
    public String toString() {
        return "A Rectangle with width=" + this.width + " and length=" + this.length + ", which is a subclass of " + super.toString();
    }
}
