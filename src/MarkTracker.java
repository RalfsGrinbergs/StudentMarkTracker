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

        for (int student = 0; student < group.length; student++) {
            double average = calculateAverage(group, student);
            System.out.println("Average for student " + (student +1) + " is: " +average);
            System.out.println("Pass status: " + passResults(average));

        }
        System.out.println("The best results in group is: " + findBestResults(group));

    }
    public static double calculateAverage(int[][] group, int student) {
        double average = 0;
        for (int i = 0; i < group[student].length; i++) {
            average += group[student][i];
        }
        return average / group[student].length;
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
    public static double findBestResults(int[][] group) {
        double best = calculateAverage(group, 0);
        for (int i = 0; i < group.length ; i++) {
            double average = calculateAverage(group,i);
            if(average > best) {
                best = average;
            }

        }
        return best;

    }
}