package hexlet.code;

import hexlet.code.games.Greet;

public class Engine {
    public static void runGame(QuizGenerator quizGen) {
        String userName = Greet.showGreet();
        System.out.println(quizGen.getInviteText());

        for (int i = 0; i < 3; i++) {
            quizGen.generateNextTest();
            String question = quizGen.getQuestion();
            String correctAnswer = quizGen.getAnswer();

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = Cli.getUserInput();

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
}
