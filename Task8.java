package pr2d;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int count = 0;
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                if (numbers2[i][j] > number) {
                    count++;
                }
            }
        }
        System.out.println("Numbers than greater your number: " + count);
    }
}
