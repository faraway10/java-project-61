package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void runGame() {
        String[][] quizzes = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int num = Utils.generateNumber(0, Engine.MAX_RAND);

            quizzes[i][0] = String.valueOf(num);
            quizzes[i][1] = isPrime(num) ? "yes" : "no";
        }

        String userName = App.showGreet();
        String inviteText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.runGame(userName, inviteText, quizzes);
    }

    public static boolean isPrime(int num) {
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
