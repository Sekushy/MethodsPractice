import java.util.Date;

public class Main {

    public static int multiplyTwoNumbers(int numberOne, int numberTwo) {
        int sum = numberOne * numberTwo;
        return sum;
    }

    public static int multiplyTwoNumbers(int numberOne, int numberTwo, int numberThree) {
        return numberOne * numberTwo * numberThree;
    }

    public static void getCurrentDateTime() {
        Date date = new Date();
        System.out.println(date.getTime());
    }

    public static void main(String[] args) {
        int sum = multiplyTwoNumbers(3,5, 7);
        int sum2 = multiplyTwoNumbers(6, 9);
        int sum3 = multiplyTwoNumbers(10, 72);

        System.out.println(sum2);

        System.out.println(multiplyTwoNumbers(10, 10));
        getCurrentDateTime();
    }
}