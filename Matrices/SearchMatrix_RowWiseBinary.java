public class SearchMatrix_RowWiseBinary {

    public static void search(int[][] matrix, int key) {

        for (int i = 0; i < matrix.length; i++) {

            int start = 0;
            int end = matrix[0].length - 1;

            while (start <= end) {

                int mid = (start + end) / 2;

                if (matrix[i][mid] == key) {
                    System.out.println("Found at (" + i + ", " + mid + ")");
                    return;
                }
                else if (matrix[i][mid] < key)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };

        search(matrix, 33);
    }
}
