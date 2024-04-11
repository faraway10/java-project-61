package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void playCalc() {
        String[] questions = new String[3];
        String[] answers = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int firstNum = random.nextInt(100);
            int secondNum = random.nextInt(100);
            int operationCode = random.nextInt(3);
            switch (operationCode) {
                case 0:
                    questions[i] = firstNum + " + " + secondNum;
                    answers[i] = firstNum + secondNum + "";
                    break;
                case 1:
                    questions[i] = firstNum + " - " + secondNum;
                    answers[i] = firstNum - secondNum + "";
                    break;
                default:
                    secondNum /= 10;
                    questions[i] = firstNum + " * " + secondNum;
                    answers[i] = firstNum * secondNum + "";
                    break;
            }
        }

        String inviteText = "What is the result of the expression?";
        Engine.runGame(inviteText, questions, answers);
    }
}
