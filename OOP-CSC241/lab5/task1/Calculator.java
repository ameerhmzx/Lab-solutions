package lab5.task1;


public class Calculator {
    private double operand1;
    private double operand2;
    private char choice;

    public Calculator() {
    }

    public Calculator(double operand1, double operand2, char choice) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.choice = choice;
        
        switch(choice){
            case '+':
                System.out.println(add());
                break;
            case '-':
                System.out.println(subtract());
                break;
            case '*':
                System.out.println(multiply());
                break;
            case '/':
                System.out.println(divide());
                break;
            case '^':
                System.out.println(power());
                break;
            case '&':
                System.out.println(squareRoot());
                break;
            default:
                System.out.println("Wrong Option!");
                break;
        }
    }
    
    public double add(){
        return operand1+operand2;
    }
    public double subtract(){
        return operand1-operand2;
    }
    public double multiply(){
        return operand1 * operand2;
    }
    public double divide(){
        return operand1/operand2;
    }
    public double power(){
        return Math.pow(operand1, operand2);
    }
    public double squareRoot(){
        return Math.sqrt(operand1);
    }
}
