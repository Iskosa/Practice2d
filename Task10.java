package pr2d;

public class Task10 {
    public static void main(String[] args) {
        int[][] matrix10 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int diagSum = 0;
        for (int i = 0; i < matrix10.length; i++) {
            System.out.print(matrix10[i][i] + " ");
            diagSum += matrix10[i][i];
        }
        System.out.println("\nSum: " + diagSum);
    }
}
