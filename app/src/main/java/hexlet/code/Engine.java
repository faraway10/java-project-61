package hexlet.code;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int MAX_RAND = 99;
    public static void runGame(String userName, String inviteText, String[][] quizzes) {
        System.out.println(inviteText);

        for (String[] quiz : quizzes) {
            String question = quiz[0];
            String correctAnswer = quiz[1];

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
