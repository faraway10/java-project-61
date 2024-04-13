package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    public static void runGame(int roundCount, int maxRandVal) {
        String[] questions = new String[roundCount];
        String[] answers = new String[roundCount];
        final int minProgressionLen = 5;
        final int maxProgressionLen = 10;
        final int minStepVal = 2;
        final int maxStepVal = 9;

        for (var i = 0; i < roundCount; i++) {
            Random random = new Random();
            int len = getRandomIntInRange(minProgressionLen, maxProgressionLen);
            int initNum = random.nextInt(maxRandVal);
            int step = getRandomIntInRange(minStepVal, maxStepVal);
            int questNumIndex = random.nextInt(len);

            questions[i] = getProgressionString(len, initNum, step, questNumIndex);
            answers[i] = String.valueOf(initNum + questNumIndex * step);
        }

        String inviteText = "What number is missing in the progression?";
        Engine.runGame(inviteText, questions, answers);
    }

    private static String getProgressionString(int len, int initNum, int step, int questNumIndex) {
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

    private static int getRandomIntInRange(int startNum, int endNum) {
        Random random = new Random();
        return startNum + random.nextInt(endNum - startNum + 1);
    }
}
