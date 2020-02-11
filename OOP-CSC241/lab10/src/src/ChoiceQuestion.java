import java.util.ArrayList;

class ChoiceQuestion extends Question{
    private ArrayList<String> choices;

    ChoiceQuestion() {
        this.choices = new ArrayList<String>();
    }

    ChoiceQuestion(ArrayList<String> choices) {
        this.choices = choices;
    }

    public void addChoice(String c, boolean b) {
        this.choices.add(c);
        if(b)
            super.setAnswer(c);
    }

    public void display() {
        super.display();
        for (String choice : this.choices)
            System.out.println(choice);
    }
}
