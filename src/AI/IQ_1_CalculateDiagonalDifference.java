package AI;

public class IQ_1_CalculateDiagonalDifference {

    public static void main(String[] args) {
        // test the below method with a valid array input
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };
        System.out.println(calculateDiagonalDifference(matrix)); // Expected output: 2

    }
    /*
       Given a square matrix, create a method that can calculate the absolute difference between the sums of its diagonals.

    For example, the square matrix  is shown below:
            1 2 3
            4 5 6
            9 8 9

        Output:
            The absolute difference is: 2
     */

    public static int calculateDiagonalDifference(int[][] matrix) {
        // provide the required code based on the method name
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[i][matrix.length - 1 - i];
        }

        return Math.abs(sum1 - sum2);
    }


}
