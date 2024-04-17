package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void runGame() {
        String[][] quizzes = new String[Engine.rounds][2];

        for (var i = 0; i < Engine.rounds; i++) {
            int firstNum = Utils.generateNumber(0, Engine.maxRandVal);
            int secondNum = Utils.generateNumber(1, Engine.maxRandVal);
            int gcd = gcd(firstNum, secondNum);
            quizzes[i][0] = firstNum + " " + secondNum;
            quizzes[i][1] = String.valueOf(gcd);
        }

        String inviteText = "Find the greatest common divisor of given numbers.";
        Engine.runGame(inviteText, quizzes);
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}
