public abstract class Shape {
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

    public final double getAspectRatio() {
        if (this instanceof Rectangle)
            return ((Rectangle) this).width / ((Rectangle) this).length;
        return 1;
    }

    public String toString() {
        return "Shape";
    }
}
