package hexlet.code.games;

import hexlet.code.QuizGenerator;

import java.util.Random;
import java.util.StringJoiner;

public class Progression implements QuizGenerator {
    private String question;
    private String answer;

    public String getInviteText() {
        return "What number is missing in the progression?";
    }

    public void generateNextTest() {
        Random random = new Random();
        int len = random.nextInt(6) + 5;
        int initNum = random.nextInt(100);
        int step = random.nextInt(8) + 2;
        int questNumIndex = random.nextInt(len);
        StringJoiner joiner = new StringJoiner(" ");

        for (var i = 0; i < len; i++) {
            String currentNum = String.valueOf(initNum + i * step);
            if (i != questNumIndex) {
                joiner.add(currentNum);
            } else {
                joiner.add("..");
                this.answer = currentNum;
            }
        }

        this.question = joiner.toString();
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
