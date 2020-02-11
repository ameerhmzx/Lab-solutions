public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.0, 5.0);
        Square square  = new Square(10.0);
        Circle circle = new Circle(10.0);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rect);
        shapes.add(square);
        shapes.add(circle);
        
        display(shapes);
    }
    
    
    private static void display(ArrayList<Shape> shapes){
        for(Shape shape: shapes){
            System.out.println(shape.getArea());
        }
    }
}
