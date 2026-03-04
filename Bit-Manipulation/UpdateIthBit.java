public class UpdateIthBit {

    public static int setIthBit(int n, int bitmask){
        return n | bitmask;
    }

    public static int clearIthBit(int n, int bitmask){
        return n & (~bitmask);
    }

    public static int updateIthBit(int n, int pos){

        int bitmask = 1 << pos;

        if((n & bitmask) == 0){
            return setIthBit(n, bitmask);
        } else{
            return clearIthBit(n, bitmask);
        }

    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println(updateIthBit(n,1));

    }
}
