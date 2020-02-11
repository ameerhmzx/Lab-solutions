import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BankAccount acc = new BankAccount("nmanumr");
    acc.printBalance();

    System.out.print("Enter amount to deposite: ");
    acc.deposit(scanner.nextInt());

    acc.printBalance();
    System.out.print("Enter amount to withdraw: ");
    acc.withdraw(scanner.nextInt());

    acc.printBalance();
    scanner.close();
  }
}
