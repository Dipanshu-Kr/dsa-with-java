public class TransposeMatrix_NewMatrix {

    public static void transpose(int[][] matrix) {

        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                result[j][i] = matrix[i][j];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { {1,4,9}, {11,4,3} };
        transpose(matrix);
    }
}
