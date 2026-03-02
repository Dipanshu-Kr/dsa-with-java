import java.util.*;

public class InbuiltSort {

    public static void main(String[] args) {
        Integer[] arr = {5, 4, 3, 1, 2};

        Arrays.sort(arr);   // Ascending
        Arrays.sort(arr, Collections.reverseOrder()); // Descending

        for (int x : arr)
            System.out.print(x + " ");
    }
}
