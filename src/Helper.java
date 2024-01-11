public class Helper {
    public static int randint(int num1, int num2) {
        int newNum;
        newNum = (int) (Math.random() * (Math.abs(num2 - num1) + 1) + num1);
        System.out.println((Math.abs(num2 - num1) + 1));
//        if (num1 < 0) {
//            double percent = (double) (num1 * -1) / num2;
//            double dNum = Math.random();
//            if (dNum < percent) {
//                newNum = (int) (Math.random() * (num2 + 1));
//            }
//            else if (dNum > percent) {
//                newNum = (int) (Math.random() * (num1 - 1) - 1);
//            }
//            System.out.println(percent);
//        }
        return newNum;
    }
}
