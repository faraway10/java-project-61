package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int MAX_RAND = 99;
    public static void runGame(String inviteText, String[][] quizzes) {
        String userName = showGreet();
        System.out.println(inviteText);

        for (String[] quiz : quizzes) {
            String question = quiz[0];
            String correctAnswer = quiz[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = getUserInput();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    public static String getUserInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static String showGreet() {
        String userName;
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = getUserInput();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
