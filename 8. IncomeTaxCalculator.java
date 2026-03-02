import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();

        if (income < 500000) {
            System.out.println(0);
        } else if (income < 1000000) {
            System.out.println(income * 0.2f);
        } else {
            System.out.println(income * 0.3f);
        }
    }
}
