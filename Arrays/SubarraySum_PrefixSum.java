public class SubarraySum_PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            prefix[i] = prefix[i - 1] + arr[i];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }
        }

        System.out.println("Max sum = " + max);
        System.out.println("Min sum = " + min);
    }
}
