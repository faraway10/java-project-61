package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static void runGame(int roundCount, int maxRandVal) {
        String[] questions = new String[roundCount];
        String[] answers = new String[roundCount];

        for (var i = 0; i < roundCount; i++) {
            Random random = new Random();
            int firstNum = random.nextInt(maxRandVal);
            int secondNum = random.nextInt(maxRandVal - 1) + 1;
            int gcd = gcd(firstNum, secondNum);
            questions[i] = firstNum + " " + secondNum;
            answers[i] = String.valueOf(gcd);
        }

        String inviteText = "Find the greatest common divisor of given numbers.";
        Engine.runGame(inviteText, questions, answers);
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}
