package hexlet.code.games;

import hexlet.code.QuizGenerator;

import java.util.Random;

public class Calc implements QuizGenerator {
    private String question;
    private String answer;
    private final Random random = new Random();

    public String getInviteText() {
        return "What is the result of the expression?";
    }

    public void generateNextTest() {
        int firstNum = random.nextInt(100);
        int secondNum = random.nextInt(100);
        int operationCode = random.nextInt(3);
        switch (operationCode) {
            case 0:
                question = firstNum + " + " + secondNum;
                answer = String.valueOf(firstNum + secondNum);
                break;
            case 1:
                question = firstNum + " - " + secondNum;
                answer = String.valueOf(firstNum - secondNum);
                break;
            default:
                secondNum /= 10;
                question = firstNum + " * " + secondNum;
                answer = String.valueOf(firstNum * secondNum);
                break;
        }
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
