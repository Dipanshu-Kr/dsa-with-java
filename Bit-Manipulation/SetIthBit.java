public class SetIthBit {

    public static int setIthBit(int n, int pos) {
        int bitmask = 1 << pos;
        return n | bitmask;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(setIthBit(n, 2));
    }
}
