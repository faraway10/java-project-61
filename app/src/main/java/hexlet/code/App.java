package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        showGameMenu();
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.next();
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

    public static void showGreet() {
        Scanner scan = new Scanner(System.in); // dry
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scan.next();
        System.out.println("Hello, " + userName + "!"); // dry
    }
}
