package pr2d;

public class Task4 {
    public static void main(String[] args) {
        int[][] numbers1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int odd = 0;
        int even = 0;
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers1[i].length; j++) {
                if (numbers1[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
    }
}
