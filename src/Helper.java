public class Helper {
    public static int randint(int num1, int num2) {
        int newNum = 0;
        if (num1 > num2) {
            return -1;
        }
        else if (num1 == num2) {
            return num1;
        }

        else if (num1 >= 0) {
            newNum = (int) (Math.random() * (num2 - num1 + 1) + num1);
        }
        else if (num2 < 0){
            num1 *= -1;
            num2 *= -1;
            newNum = (int) ((Math.random() * (num2 - num1 - 1) + num1) * -1) + 1;
        }
        else {
            double percent = (double) (num1 * -1) / num2;
            double dNum = Math.random();
            if (dNum < percent) {
                newNum = (int) (Math.random() * (num2 + 1));
            }
            else if (dNum > percent) {
                newNum = (int) (Math.random() * (num1 - 1) - 1);
            }
            //System.out.println(percent);
        }
        return newNum;
    }
}
