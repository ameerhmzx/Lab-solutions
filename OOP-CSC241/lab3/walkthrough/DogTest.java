public class DogTest{
  public static void main(String[] args){
    Dog d1 = new Dog();
    System.out.printf("My dog %s ", d1.name);
    d1.sleep();
    System.out.printf("Hello %s \n", d1.name);
    d1.speak();
  }
}
