package pr2d;

public class Task11 {
    public static void main(String[] args) {
        int[][] matrix11 = {
                {1, -2, 3},
                {-4, 5, -6},
                {7, 8, -9}
        };

        System.out.println("Before:");
        for (int i = 0; i < matrix11.length; i++) {
            for (int j = 0; j < matrix11[i].length; j++) {
                System.out.print(matrix11[i][j] + " ");
                if (matrix11[i][j] < 0) {
                    matrix11[i][j] = 0;
                }
            }
            System.out.println();
        }

        System.out.println("After:");
        for (int i = 0; i < matrix11.length; i++) {
            for (int j = 0; j < matrix11[i].length; j++) {
                System.out.print(matrix11[i][j] + " ");
            }
            System.out.println();
        }
    }
}
