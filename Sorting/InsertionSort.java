public class InsertionSort {

    public static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {

            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 2, 3};

        sort(nums);

        for (int x : nums)
            System.out.print(x + " ");
    }
}
