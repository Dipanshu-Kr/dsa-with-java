public class ClearLastIBits {

    public static int clearLastIBits(int n, int i) {
        int bitmask = (-1) << i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(clearLastIBits(n, 2));
    }
}
