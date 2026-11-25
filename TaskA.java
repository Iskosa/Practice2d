package pr2d;

public class TaskA {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 3, 2},
                {8, 4, 6, 7},
                {2, 9, 1, 3}
        };

        int maxSum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            maxSum += matrix[0][j];
        }
        int maxRow = 0;

        for (int i = 1; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Row " + (maxRow + 1) + " has the largest sum: " + maxSum);
    }
}
