package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    public static void runGame(int questCount) {
        String[] questions = new String[questCount];
        String[] answers = new String[questCount];

        for (var i = 0; i < questCount; i++) {
            Random random = new Random();
            int len = random.nextInt(6) + 5;
            int initNum = random.nextInt(100);
            int step = random.nextInt(8) + 2;
            int questNumIndex = random.nextInt(len);
            StringJoiner joiner = new StringJoiner(" ");

            for (var n = 0; n < len; n++) {
                String currentNum = String.valueOf(initNum + n * step);
                if (n != questNumIndex) {
                    joiner.add(currentNum);
                } else {
                    joiner.add("..");
                    answers[i] = currentNum;
                }
            }

            questions[i] = joiner.toString();
        }

        String inviteText = "What number is missing in the progression?";
        Engine.runGame(inviteText, questions, answers);
    }
}
