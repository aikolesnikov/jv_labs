import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Jv_31_BigNumber1_BigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
