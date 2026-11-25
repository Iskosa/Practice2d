package pr2d;

public class Task12 {
    public static void main(String[] args) {
        int[][] grades = {
                {85, 90, 78, 92},
                {70, 88, 95, 80},
                {60, 75, 82, 89}
        };

        int maxScore = grades[0][0];
        int totalSum = 0;
        int totalCount = 0;

        for (int i = 0; i < grades.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                studentSum += grades[i][j];
                totalSum += grades[i][j];
                totalCount++;
                if (grades[i][j] > maxScore) {
                    maxScore = grades[i][j];
                }
            }
            System.out.println("Student " + (i + 1) + " average: " + (double) studentSum / grades[i].length);
        }

        System.out.println("Class maximum: " + maxScore);
        System.out.println("Overall average: " + (double) totalSum / totalCount);
    }
}
