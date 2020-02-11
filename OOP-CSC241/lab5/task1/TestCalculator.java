package lab5.task1;


import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        
        Calculator calculator1;
        Calculator calculator2 = new Calculator();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Number 1: ");
        double op1 = scanner.nextDouble();
        
        System.out.print("Enter Number 2: ");
        double op2 = scanner.nextDouble();
        
        System.out.print("Enter Choice: \n\'+\' to add\n\'-\' to subtract\n\'*\' to Multiply\n\'/\' to divide\n\'^\' for Power\n\'&\' for Square Root\n> ");
        char ch = scanner.next().charAt(0);
        
        calculator1 = new Calculator(op1, op2, ch);
    }
}
