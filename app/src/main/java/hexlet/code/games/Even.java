package hexlet.code.games;

import hexlet.code.QuizGenerator;

import java.util.Random;

public class Even implements QuizGenerator {
    private String question;
    private String answer;
    private final Random random = new Random();

    public String getInviteText() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public void generateNextTest() {
        int currentNum = random.nextInt(100);
        this.question = currentNum + "";
        this.answer = currentNum % 2 == 0 ? "yes" : "no";
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
