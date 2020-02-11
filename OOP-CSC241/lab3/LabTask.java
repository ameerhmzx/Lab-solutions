public class LabTask {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10.5f);
        r.setHeight(20f);
        
        System.out.println("Area of Rectangle = " + r.getArea());
        System.out.println("Perimeter of Rectangle = " + r.getPerimeter());
    }
}

class Rectangle {
    private float length;
    private float height;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public float getArea(){
        return length*height;
    }
    
    public float getPerimeter(){
        return (length+height)*2;
    }
}
