import java.util.InputMismatchException;
import java.util.Scanner;

class MyCalculator2 {
    long power(int a, int b) throws Exception {

        if ((a < 0) || (b < 0)) {
            throw new Exception("n or p should not be negative.");
        } else if ((a == 0) && (b == 0)) {
            throw new Exception("n and p should not be zero.");
        } else {
            long p = 1;
            for (int i = 1; i <= b; i++) {
                p = p * a;
            }
            return p;
        }
    }
}

public class Jv_62_Exception2 {

    public static final MyCalculator2 my_calculator = new MyCalculator2();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
