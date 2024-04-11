package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void playEven() {
        String[] questions = new String[3];
        String[] answers = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int currentNum = random.nextInt(100);
            questions[i] = currentNum + "";
            answers[i] = currentNum % 2 == 0 ? "yes" : "no";
        }

        String inviteText = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.runGame(inviteText, questions, answers);
    }
}
