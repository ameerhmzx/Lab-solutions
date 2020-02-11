import java.util.ArrayList;

interface Movable {
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}

interface Filter {
    Boolean accept();
}

public class Lab16 {
    public static void main(String[] args) {
        ArrayList<Filter> movables = new ArrayList<>() {{
            add(new MovablePoint(0, 0, 1, 1));
            add(new MovablePoint(0, 0, 1, 1));
            add(new MovableCircle(0, 0, 1, 1, 1));
            add(new MovableCircle(0, 0, 1, 1, 2));
        }};
        move(movables);
    }

    public static void move(ArrayList<Filter> movables) {
        for (Filter movable : movables) {
            System.out.println(movable.accept());
        }
    }
}

class MovablePoint implements Movable, Filter {
    int x;
    int y;

    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }

    @Override
    public Boolean accept() {
        return this.x > this.y;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class MovableCircle implements Movable, Filter {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public Boolean accept() {
        return this.radius < 5;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
