import java.util.*;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        int n = 576;
        boolean found = false;

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                System.out.println("Square root = " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Not a perfect square");
    }
}
