package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateNumber(int startNum, int endNum) {
        Random random = new Random();
        return startNum + random.nextInt(endNum - startNum + 1);
    }
}
