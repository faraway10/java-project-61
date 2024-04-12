package hexlet.code.games;

import hexlet.code.QuizGenerator;

import java.util.Random;

public class GCD implements QuizGenerator {
    private String question;
    private String answer;
    private final Random random = new Random();

    public String getInviteText() {
        return "Find the greatest common divisor of given numbers.";
    }

    public void generateNextTest() {
        int firstNum = random.nextInt(100);
        int secondNum = random.nextInt(99) + 1;
        int gcd = gcd(firstNum, secondNum);
        question = firstNum + " " + secondNum;
        answer = gcd + "";
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}
