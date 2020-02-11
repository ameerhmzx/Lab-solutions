public class Square extends Rectangle {
    Square() {
    }

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
