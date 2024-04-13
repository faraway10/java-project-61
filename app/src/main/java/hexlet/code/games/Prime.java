package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void runGame(int roundCount) {
        String[] questions = new String[roundCount];
        String[] answers = new String[roundCount];

        for (var i = 0; i < roundCount; i++) {
            Random random = new Random();
            int num = random.nextInt(100);

            questions[i] = String.valueOf(num);
            answers[i] = checkNumberIsPrime(num) ? "yes" : "no";
        }

        String inviteText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.runGame(inviteText, questions, answers);
    }

    public static boolean checkNumberIsPrime(int num) {
        boolean isPrime = num >= 2;

        for (var n = 2; n <= num / 2; n++) {
            if (num % n == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
