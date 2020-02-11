import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ChoiceQuestion choiceQuestion = new ChoiceQuestion();
        choiceQuestion.setText("What is your Age");
        choiceQuestion.addChoice("10", false);
        choiceQuestion.addChoice("20", true);
        choiceQuestion.addChoice("30", false);

        choiceQuestion.display();
        System.out.print("Enter Correct Answer: ");
        String input = scanner.nextLine();
        if(choiceQuestion.checkAnswer(input))
            System.out.println("Correct Answer!");
            else
            System.out.println("Wrong Answer!");
    }
}

