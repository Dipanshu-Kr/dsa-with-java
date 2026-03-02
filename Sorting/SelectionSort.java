public class SelectionSort {

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex])
                    minIndex = j;
            }

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 2, 3};

        sort(nums);

        for (int x : nums)
            System.out.print(x + " ");
    }
}
