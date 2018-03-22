package pract1;

public class Task4 {

    public void rotateMatrix(int n) {
        System.out.println("First matrix:");
        int[][] matrix = inputMatrix(n);
        showMatrix(matrix);
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            int k = n - 1;
            for (int j = 0; j < n; j++) {
                result[k][i] = matrix[i][j];
                k--;
            }
        }
        System.out.println("Result matrix:");
        showMatrix(result);
    }

    public int[][] inputMatrix(int n) {
        int[][] result = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) {
                result[i][j] = (int)((Math.random() * 50)) - 25;
            }
            return result;
    }

    public void showMatrix(int[][] matrix) {
        for(int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
