public class SearchInRotatedSortedArray {

    public static int search(int arr[], int tar, int s, int e) {
        if (s > e) return -1;

        int mid = s + (e - s) / 2;

        if (arr[mid] == tar) return mid;

        if (arr[s] <= arr[mid]) {
            if (arr[s] <= tar && tar <= arr[mid]) {
                return search(arr, tar, s, mid - 1);
            } else {
                return search(arr, tar, mid + 1, e);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[e]) {
                return search(arr, tar, mid + 1, e);
            } else {
                return search(arr, tar, s, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
