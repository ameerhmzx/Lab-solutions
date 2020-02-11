class Main {

  public static void main(String[] args) {

    // Create cylinder object from class Cylinder
    Cylinder cylinder1 = new Cylinder();

    // Setting Values
    cylinder1.setRadius(10f);
    cylinder1.setHeight(20f);

    //print Details
    cylinder1.displayInfo();

    // Cylinder 2 
    Cylinder cylinder2 = new Cylinder(2f);
    cylinder2.displayInfo();

    //Cylnder 3
    Cylinder cylinder3 = new Cylinder(2f, 3f);
    System.out.println("Cylinder3's radius : " + cylinder3.getRadius());
    System.out.println("Cylinder3's Height : " + cylinder3.getHeight());
    System.out.println("Cylinder3's Area : " + cylinder3.computeArea());
    System.out.println("Cylinder3's Volume : " + cylinder3.computeVolume());

  }
}
