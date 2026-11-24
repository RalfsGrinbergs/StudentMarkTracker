public class MarkTracker {

    private static final int MIN_PASS_MARK = 4;
    private static final int MIN_WELL_MARK = 6;
    private static final int MIN_EXCELLENT_MARK = 9;

    public static void main(String[] args) {
        int[][] group = {
                {7,4,9}, //student 1
                {8,4,2},
                {9,9,9}
        };
        double highestAverage = 0;

        for (int student = 0; student < group.length; student++) {
            double average = calculateAverage(group[student]);
            System.out.println("Average for student " + (student +1) + " is: " +average);
            System.out.println("Pass status: " + passResults(average));
            if(average > highestAverage) {
                highestAverage = average;
            }
        }
        System.out.println("The best result in the group is: " + highestAverage);
    }

    public static double calculateAverage(int[] studentGrades) {
        double average = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            average += studentGrades[i];
        }
        return average / studentGrades.length;
    }

    public static String passResults(double average) {
        if(average < MIN_PASS_MARK) {
            return "did not pass";
        }
        else if (average < MIN_WELL_MARK) {
            return "passed";
        }
        else if(average < MIN_EXCELLENT_MARK) {
            return "passed well";
        }
        else {
            return "passed excellent";
        }
    }
    }
