package pr2d;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers3 = new int[2][3];

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println("Enter 3 numbers for row " + (i + 1) + ":");
            for (int j = 0; j < numbers3[i].length; j++) {
                numbers3[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Your 2x3 array:");
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = 0; j < numbers3[i].length; j++) {
                System.out.print(numbers3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
