package hexlet.code.games;

import hexlet.code.Cli;

public class Greet {
    public static String showGreet() {
        String userName;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = Cli.getUserInput();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
