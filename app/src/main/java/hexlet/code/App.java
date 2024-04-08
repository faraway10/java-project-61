package hexlet.code;

public class App {
    public static void main(String[] args) {
        String userName;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String choice = Cli.getUserInput();
        System.out.println("Your choice: " + choice + "\n");

        switch (choice) {
            case "1":
                userName = Greet.showGreet();
                break;
            case "2":
                userName = Greet.showGreet();
                Even.playEven(userName);
                break;
            case "0":
                return;
            default:
                System.out.println("Incorrect input!");
                break;
        }
    }
}
