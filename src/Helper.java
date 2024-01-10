public class Helper {
    public static int randint(int num1, int num2) {
        int newNum = 0;
        System.out.println((num2 + ((num1 * -1) + 1)));
        if (num1 < 0) {
            newNum = (int) (Math.random() * (num2 + (num1 * -1)) + (num1 - 1));
        }
        return newNum;
    }
}
