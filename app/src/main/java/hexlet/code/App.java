package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        showGameMenu();
        String userChoice = Cli.getUserInput();
        runGameByUserChoice(userChoice);
    }

    public static void showGameMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

    public static void runGameByUserChoice(String userChoice) {
        switch (userChoice) {
            case "1":
                showGreet();
                break;
            case "2":
                Even.runGame();
                break;
            case "3":
                Calc.runGame();
                break;
            case "4":
                GCD.runGame();
                break;
            case "5":
                Progression.runGame();
                break;
            case "6":
                Prime.runGame();
                break;
            case "0":
                return;
            default:
                throw new RuntimeException("\nUnknown user choice: " + userChoice);
        }
    }

    public static String showGreet() {
        String userName;
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = Cli.getUserInput();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
