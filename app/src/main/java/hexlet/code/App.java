package hexlet.code;

import hexlet.code.games.Greet;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        String choice = Cli.getUserInput();
        System.out.println("Your choice: " + choice + "\n");

        switch (choice) {
            case "1":
                Greet.showGreet();
                break;
            case "2":
                Even even = new Even();
                Engine.runGame(even);
                break;
            case "3":
                Calc calc = new Calc();
                Engine.runGame(calc);
                break;
            case "4":
                GCD gcd = new GCD();
                Engine.runGame(gcd);
                break;
            case "5":
                Progression progression = new Progression();
                Engine.runGame(progression);
                break;
            case "0":
                return;
            default:
                System.out.println("Incorrect input!");
                break;
        }
    }
}
