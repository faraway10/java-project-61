package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void runGame(int questCount) {
        String[] questions = new String[questCount];
        String[] answers = new String[questCount];

        for (var i = 0; i < questCount; i++) {
            Random random = new Random();
            int firstNum = random.nextInt(100);
            int secondNum = random.nextInt(100);
            int operationCode = random.nextInt(3);
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
