package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void runGame() {
        final int maxRand = 99;
        final char[] operators = new char[]{'+', '-', '*'};
        String[][] quizzes = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            char operator = operators[Utils.generateNumber(0, operators.length - 1)];
            int firstNum = Utils.generateNumber(0, maxRand);
            int secondNum = Utils.generateNumber(0, maxRand);
            int result = calcNumbersByOperator(firstNum, secondNum, operator);

            quizzes[i][0] = firstNum + " " + operator + " " + secondNum;
            quizzes[i][1] = String.valueOf(result);
        }

        String inviteText = "What is the result of the expression?";
        Engine.runGame(inviteText, quizzes);
    }

    private static int calcNumbersByOperator(int firstNum, int secondNum, char operator) {
        switch (operator) {
            case '+':
                return firstNum + secondNum;
            case '-':
                return firstNum - secondNum;
            case '*':
                return firstNum * secondNum;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }
}
