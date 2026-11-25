package pr2d;

public class Task2 {
    public static void main(String[] args) {
        int[][] numbers2 = {
                {5, 10, 15},
                {20, 25, 30}
        };
        System.out.println(numbers2[1][2]);
        numbers2[0][1] = 99;
        System.out.println(numbers2[0][1]);
    }
}
