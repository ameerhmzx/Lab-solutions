class Question{
    private String text;
    private String answer;

    Question() { }

    Question(String t, String a) {
        this.text = t;
        this.answer = a;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String a) {
        return a.equals(this.answer);
    }

    public void display() {
        System.out.println(this.text);
    }
}
