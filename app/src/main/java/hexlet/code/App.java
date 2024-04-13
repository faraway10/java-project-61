package hexlet.code;

import hexlet.code.games.Greet;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        int questCount = 3;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = Cli.getUserInput();

        switch (choice) {
            case "1":
                Greet.showGreet();
                break;
            case "2":
                Even.runGame(questCount);
                break;
            case "3":
                Calc.runGame(questCount);
                break;
            case "4":
                GCD.runGame(questCount);
                break;
            case "5":
                Progression.runGame(questCount);
                break;
            case "6":
                Prime.runGame(questCount);
                break;
            case "0":
                return;
            default:
                System.out.println("\nIncorrect input!");
                break;
        }
    }
}
