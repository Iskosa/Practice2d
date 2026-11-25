package pr2d;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum1 = 0;
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = 0; j < numbers3[i].length; j++) {
                sum1 += numbers3[i][j];
            }
        }
        System.out.println(sum1);
    }
}
