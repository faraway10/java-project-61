package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void runGame() {
        String[][] quizzes = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int currentNum = Utils.generateNumber(0, Engine.MAX_RAND);
            quizzes[i][0] = String.valueOf(currentNum);
            quizzes[i][1] = currentNum % 2 == 0 ? "yes" : "no";
        }

        String inviteText = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.runGame(inviteText, quizzes);
    }
}
