package hexlet.code;

import java.util.Random;

public class Even {
    public static void playEven(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int currentNum = random.nextInt(100);
            String correctAnswer = currentNum % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + currentNum);
            System.out.print("Your answer: ");
            String userAnswer = Cli.getUserInput();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
