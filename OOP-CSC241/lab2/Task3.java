import java.util.Scanner;

class Task3 {
  public static void main(String[] args) {
    float investment = 1000f;
    for(int i = 0; i < 9; i++){
      investment *= 1.05;
      System.out.printf("%d\t%.2f\n", i+1, investment);
    }
  }
}
