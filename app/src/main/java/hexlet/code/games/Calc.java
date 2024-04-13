package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void runGame(int roundCount, int maxRandVal) {
        String[] questions = new String[roundCount];
        String[] answers = new String[roundCount];
        final int maxOperationCodeVal = 3;

        for (var i = 0; i < roundCount; i++) {
            Random random = new Random();
            int firstNum = random.nextInt(maxRandVal);
            int secondNum = random.nextInt(maxRandVal);
            int operationCode = random.nextInt(maxOperationCodeVal);
            String operation;
            int result;

            switch (operationCode) {
                case 0:
                    operation = " + ";
                    result = firstNum + secondNum;
                    break;
                case 1:
                    operation = " - ";
                    result = firstNum - secondNum;
                    break;
                default:
                    secondNum /= 10;
                    operation = " * ";
                    result = firstNum * secondNum;
                    break;
            }

            questions[i] = firstNum + operation + secondNum;
            answers[i] = String.valueOf(result);

        }

        String inviteText = "What is the result of the expression?";
        Engine.runGame(inviteText, questions, answers);
    }
}
