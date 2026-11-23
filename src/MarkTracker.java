public class MarkTracker {

    private static final int PASSED = 4;
    private static final int PASSED_WELL = 6;
    private static final int PASSED_EXCELLENT = 9;

    public static void main(String[] args) {
        int[][] group = {
                {7,4,9}, //student 1
                {8,4,2},
                {9,9,9}
        };

        for (int student = 0; student < group.length; student++) {
            double average = oneStudentAverage(group, student);
            System.out.println("Average for student " + (student +1) + " is: " +average);
            System.out.println("Pass status: " + howPassed(average));

        }
    }
    public static double oneStudentAverage(int[][] group, int student) {
        double average = 0;
        for (int i = 0; i < group[student].length; i++) {
            average += group[student][i];
        }
        return average / group[student].length;
    }
    public static String howPassed(double average) {
        if(average < PASSED) {
            return "did not pass";
        }
        else if (average < PASSED_WELL) {
            return "passed";
        }
        else if(average < PASSED_EXCELLENT) {
            return "passed well";
        }
        else {
            return "passed excellent";
        }
    }
}