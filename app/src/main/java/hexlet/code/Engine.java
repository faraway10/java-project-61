package hexlet.code;

public class Engine {
    public static final int rounds = 3;
    public static final int maxRandVal = 99;
    public static void runGame(String inviteText, String[][] quizzes) {
        String userName = App.showGreet();
        System.out.println(inviteText);

        for (int i = 0; i < rounds; i++) {
            String question = quizzes[i][0];
            String correctAnswer = quizzes[i][1];

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
