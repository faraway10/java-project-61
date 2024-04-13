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

            switch (operationCode) {
                case 0:
                    questions[i] = firstNum + " + " + secondNum;
                    answers[i] = String.valueOf(firstNum + secondNum);
                    break;
                case 1:
                    questions[i] = firstNum + " - " + secondNum;
                    answers[i] = String.valueOf(firstNum - secondNum);
                    break;
                default:
                    secondNum /= 10;
                    questions[i] = firstNum + " * " + secondNum;
                    answers[i] = String.valueOf(firstNum * secondNum);
                    break;
            }
        }

        String inviteText = "What is the result of the expression?";
        Engine.runGame(inviteText, questions, answers);
    }
}
