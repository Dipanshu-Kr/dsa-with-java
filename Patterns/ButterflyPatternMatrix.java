public class ButterflyPatternMatrix {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if ((j - i >= 1 && i + j <= n) ||
                    (i + j >= n + 2 && i - j >= 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
