import java.util.*;

public class BinaryToDecimal {

    public static int binToDec(int n) {
        int decimal = 0, base = 1;

        while (n > 0) {
            int rem = n % 10;
            decimal += rem * base;
            base *= 2;
            n /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(binToDec(n));
    }
}
