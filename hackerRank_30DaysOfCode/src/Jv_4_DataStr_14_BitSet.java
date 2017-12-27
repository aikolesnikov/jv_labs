import java.util.BitSet;
import java.util.Scanner;

public class Jv_4_DataStr_14_BitSet {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int setSize = in.nextInt();
        int testCases = in.nextInt();
        in.nextLine();

        BitSet bs1 = new BitSet(setSize);
        BitSet bs2 = new BitSet(setSize);

        while (testCases > 0) {
            {
                String op = in.next();
                int left_operand = in.nextInt();
                int right_operand = in.nextInt();
                ;

                switch (op) {
                    case "AND":
                        if (left_operand == 1)
                            bs1.and(bs2);
                        else
                            bs2.and(bs1);
                        //System.out.println("and");
                        break;

                    case "OR":
                        if (left_operand == 1)
                            bs1.or(bs2);
                        else
                            bs2.or(bs1);
                        // System.out.println("or");
                        break;

                    case "XOR":
                        if (left_operand == 1)
                            bs1.xor(bs2);
                        else
                            bs2.xor(bs1);
                        // System.out.println("xor");
                        break;

                    case "FLIP":
                        if (left_operand == 1)
                            bs1.flip(right_operand);
                        else
                            bs2.flip(right_operand);
                        // System.out.println("flip");
                        break;
                    case "SET":
                        if (left_operand == 1)
                            bs1.set(right_operand);
                        else
                            bs2.set(right_operand);
                        // System.out.println("set");
                        break;
                    default:
                        System.out.println("def");
                        break;
                }
            }
            System.out.println(bs1.cardinality() + " " + bs2.cardinality());
            testCases--;
        }
    }
}
