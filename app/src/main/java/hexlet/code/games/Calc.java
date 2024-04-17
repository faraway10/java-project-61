package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void runGame() {
        final char[] operators = new char[]{'+', '-', '*'};
        final int secondNumDecreaseVal = 10;
        String[][] quizzes = new String[Engine.rounds][2];

        for (var i = 0; i < Engine.rounds; i++) {
            char operator = operators[Utils.generateNumber(0, operators.length - 1)];
            int firstNum = Utils.generateNumber(0, Engine.maxRandVal);
            int secondNum = Utils.generateNumber(0, Engine.maxRandVal);
            int result;

            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    secondNum /= secondNumDecreaseVal;
                    result = firstNum * secondNum;
                    break;
                default:
                    throw new RuntimeException("Unknown operator: " + operator);
            }

            quizzes[i][0] = firstNum + " " + operator + " " + secondNum;
            quizzes[i][1] = String.valueOf(result);

        }

        String inviteText = "What is the result of the expression?";
        Engine.runGame(inviteText, quizzes);
    }
}
