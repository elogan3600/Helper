public class Tester {
    public static void main(String[] args) {
        int rand = 0;
        int[] arr = new int[10000];
        for (int x = 0; x < 10000; x++) {
           rand = Helper.randint(-2,3);
           arr[x] = rand;
           System.out.println(rand);
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = (double) sum / arr.length;
        System.out.println(average);
        int j = 0;
        }
    }
