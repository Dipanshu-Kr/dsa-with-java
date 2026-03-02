import java.util.*;

public class DecimalToBinary {

    public static int decToBin(int n) {
        int bin = 0, place = 1;

        while (n > 0) {
            int rem = n % 2;
            bin += rem * place;
            place *= 10;
            n /= 2;
        }

        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(decToBin(n));
    }
}
