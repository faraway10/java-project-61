package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    public static void runGame(int roundCount, int maxRandVal) {
        String[] questions = new String[roundCount];
        String[] answers = new String[roundCount];

        for (var i = 0; i < roundCount; i++) {
            Random random = new Random();
            int len = random.nextInt(6) + 5;
            int initNum = random.nextInt(maxRandVal);
            int step = random.nextInt(8) + 2;
            int questNumIndex = random.nextInt(len);

            questions[i] = getProgressionString(len, initNum, step, questNumIndex);
            answers[i] = String.valueOf(initNum + questNumIndex * step);
        }

        String inviteText = "What number is missing in the progression?";
        Engine.runGame(inviteText, questions, answers);
    }

    public static String getProgressionString(int len, int initNum, int step, int questNumIndex) {
        StringJoiner joiner = new StringJoiner(" ");

        for (var n = 0; n < len; n++) {
            String currentNum = String.valueOf(initNum + n * step);
            if (n != questNumIndex) {
                joiner.add(currentNum);
            } else {
                joiner.add("..");
            }
        }

        return joiner.toString();
    }
}
