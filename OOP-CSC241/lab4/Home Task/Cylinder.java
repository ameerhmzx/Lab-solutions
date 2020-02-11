/**
 * Cylinder
 */
public class Cylinder {

  private float radius;
  private float height;

  // A no-argument constructor
  public Cylinder(){

  }

  // A one-argument constructor receiving height and setting radius to default value 1
  public Cylinder(float height){
    this(height, 1f);
  }

  // A two-argument constructor receiving height and radius
  public Cylinder(float height, float radius){
    this.height = height;
    this.radius = radius;
  }

//  Methods:
//  Setter functions (total 2)
  public void setHeight(float height){
    this.height = height;
  }

  public void setRadius(float radius){
    this.radius = radius;
  }

// Getter functions (total 2)
  public float getHeight(){
    return height;
  }

  public float getRadius(){
    return radius;
  }

// computeArea
  public float computeArea(){
     return (22/7)* (float) (Math.pow(radius, 2));
  }

// computeVolume
  public float computeVolume(){
    return computeArea()*height;
  }

// displayInfo
// Showing cylinder height, radius, area and volume
  public void displayInfo(){
    System.out.println("Cylinder's Height: " + height);
    System.out.println("Cylinder's Radius" + radius);
    System.out.println("Area : " + computeArea());
    System.out.println("Volume :" + computeVolume());
  }
}
