public class Helper {
    public static int randint(int min, int max) {
        int newNum = 0;
        if (min > max) {
            return -1;
        }
        else if (min == max) {
            return min;
        }

        else if (min >= 0) {
            newNum = (int) (Math.random() * (max - min + 1) + min);
        }
        else if (max < 0){
            min *= -1;
            max *= -1;
            newNum = (int) ((Math.random() * (max - min - 1) + min)) + 1;
            newNum *= -1;
        }
        else if (max == 0) {
            min *= -1;
            max *= -1;
            newNum = (int) (Math.random() * (min - max + 1) + max);
            newNum *= -1;
        }
        else {
            double percent = (double) (min * -1) / max;
            double dNum = Math.random();
            if (dNum < percent) {
                newNum = (int) (Math.random() * (max + 1));
            }
            else if (dNum > percent) {
                newNum = (int) (Math.random() * (min - 1) - 1);
            }
        }
        return newNum;
    }
    public static int average(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum = sum + arr[x];
        }
        return sum / arr.length;
    }
    public static double average(double[] arr) {
        double sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum = sum + arr[x];
        }
        return sum / arr.length;
    }
    public static int[][] to2d(int[] arr, int rows, int columns) {

    }
}
