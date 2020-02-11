import java.util.ArrayList;
import java.util.Arrays;

interface Stats {
    String unit = null;

    double computeArea();

    void reset();
}

public class Lab14 {
    static void printStats(Stats stat) {
        System.out.println(stat.computeArea());
        stat.reset();
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        Square square = new Square(20);
        Country country = new Country(new int[] {10, 20, 30}, new ArrayList<>(){{
            add(10);
            add(20);
            add(30);
        }});

        printStats(rect);
        printStats(square);
        printStats(country);
    }
}

abstract class Shape implements Stats {
    protected String color;
    protected Boolean filled;

    Shape() {
    }

    Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape";
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public String toString() {
        return String.format("Rectangle (%.2f x %.2f)", this.length, this.width);
    }

    @Override
    public double computeArea() {
        return this.width * this.length;
    }

    @Override
    public void reset() {
        this.length = 0;
        this.width = 0;
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, Boolean filled) {
        super(color, filled, side, side);
    }

    double getSide() {
        return super.getLength();
    }

    void setSide(double side) {
        super.setLength(side);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    public String toString() {
        return String.format("Square (%.2f x %.2f)", getSide(), getSide());
    }
}

class Country implements Stats {
    String name;
    int[] provincesAreas;
    ArrayList<Integer> statesAreas;
    String unit;

    public Country(int[] provincesAreas, ArrayList<Integer> statesAreas) {
        this.provincesAreas = provincesAreas;
        this.statesAreas = statesAreas;
    }

    @Override
    public double computeArea() {
        return Arrays.stream(provincesAreas).sum() +
                Arrays.stream((Integer[]) statesAreas.toArray()).reduce(0, Integer::sum);
    }

    @Override
    public void reset() {
        Arrays.stream(this.provincesAreas).forEach(i -> i = 0);
        Arrays.stream((Integer[]) statesAreas.toArray()).forEach(i -> i = 0);
    }
}
