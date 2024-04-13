package hexlet.code.games;

import hexlet.code.QuizGenerator;

import java.util.Random;

public class Prime implements QuizGenerator {
    private String question;
    private String answer;
    private final Random random = new Random();

    public String getInviteText() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public void generateNextTest() {
        int num = random.nextInt(100);
        boolean isPrime = num >= 2;

        for (var i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        this.question = String.valueOf(num);
        this.answer = isPrime ? "yes" : "no";
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
