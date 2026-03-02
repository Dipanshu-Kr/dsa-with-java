public class SolidRhombusPattern {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * n; j++) {
                if (i + j <= n || i + j > n + n)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
