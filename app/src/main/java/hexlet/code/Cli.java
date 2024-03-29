package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getUserInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
