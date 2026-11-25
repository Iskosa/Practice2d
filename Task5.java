package pr2d;

public class Task5 {
    public static void main(String[] args) {
        int[][] numbers2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int smallest = numbers2[0][0];
        int largest = numbers2[0][0];
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                if (smallest > numbers2[i][j]) {
                    numbers2[i][j] = smallest;
                } else if (largest < numbers2[i][j]) {
                    numbers2[i][j] = largest;
                }
            }
        }
    }
}
