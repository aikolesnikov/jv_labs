import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Jv_33_BigNumber3_PrimalityTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        // Write your code here.

/*
        // tries //////////////////////////////////////
        String res = "not prime";
        if (n.intValue() > 2) {

            if ((n.mod(new BigInteger("2")).compareTo(BigInteger.ZERO)) > 0) {

                // for (BigInteger i = new BigInteger("0"); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
                // for (BigInteger i = BigInteger.ZERO; i.compareTo(n.divide(new BigInteger("2"))) < 0; i = i.add(BigInteger.ONE)) {
                for (BigInteger i = new BigInteger("3"); i.compareTo(n.divide(new BigInteger("2"))) < 0; i = i.add(new BigInteger("2"))) {
                    if (n.mod(i).equals(BigInteger.ZERO)) {
                        break;
                    }
                }
                res = "prime";
            }
        }

        // test 8306193547961364862906443093104785840173353478461 not prime
        // 282755483533707287054752184321121345766861480697448703443857012153264407439766013042402571 prime
        System.out.println(res);
        // ///////////////////////////////////////////////
*/
        System.out.println(
                n.isProbablePrime(100) ?  "prime" : "not prime"
        );
    }
}
