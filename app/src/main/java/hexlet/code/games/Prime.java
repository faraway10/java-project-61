package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void runGame(int questCount) {
        String[] questions = new String[questCount];
        String[] answers = new String[questCount];

        for (var i = 0; i < questCount; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            boolean isPrime = num >= 2;

            for (var n = 2; n <= num / 2; n++) {
                if (num % n == 0) {
                    isPrime = false;
                    break;
                }
            }

            questions[i] = String.valueOf(num);
            answers[i] = isPrime ? "yes" : "no";
        }

        String inviteText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.runGame(inviteText, questions, answers);
    }
}
