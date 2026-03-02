public class ArrayUpdateFunction {

    public static void update(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] += 1;
    }

    public static void main(String[] args) {
        int[] arr = {90, 97, 93};
        update(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
