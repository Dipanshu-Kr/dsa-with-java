public class LastOccurrence {
    public static int lastOcc(int arr[], int i, int target) {
        if (i < 0) return -1;
        if (arr[i] == target) return i;
        return lastOcc(arr, i - 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 7, 9, 6};
        System.out.println(lastOcc(arr, arr.length - 1, 6));
    }
}
