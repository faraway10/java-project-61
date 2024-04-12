package hexlet.code;

public interface QuizGenerator {
    String getInviteText();
    void generateNextTest();
    String getQuestion();
    String getAnswer();
}
