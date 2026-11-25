package pr2d;

public class Task7 {
    public static void main(String[] args) {
        int[][] numbers1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < numbers1.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbers1[i].length; j++) {
                sum += numbers1[j][i];
            }
            System.out.println(sum);
        }
    }
}
