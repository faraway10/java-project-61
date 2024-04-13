package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void runGame(int questCount) {
        String[] questions = new String[questCount];
        String[] answers = new String[questCount];

        for (var i = 0; i < questCount; i++) {
            Random random = new Random();
            int currentNum = random.nextInt(100);
            questions[i] = String.valueOf(currentNum);
            answers[i] = currentNum % 2 == 0 ? "yes" : "no";
        }

        String inviteText = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.runGame(inviteText, questions, answers);
    }
}
