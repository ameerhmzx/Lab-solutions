import java.util.Scanner;

class Task2 {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner scnr = new Scanner(System.in);
    int max = scnr.nextInt();
    for(int i =0; i< 4; i++){
      System.out.print("Enter an other number: ");
      int num = scnr.nextInt();

      if(num > max)
        max = num;
    }

    System.out.println("Max: " + max);
  }
}
