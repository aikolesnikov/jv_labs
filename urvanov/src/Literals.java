import static java.lang.Float.MAX_VALUE;
import static java.lang.Float.NaN;
import static java.lang.Float.POSITIVE_INFINITY;

public class Literals {

    static int[] iArr = {1, 02, 0x3, 0b100, 2_147_483_647, 0177_7777_7777, 0x7fff_ffff,
            0b0111_1111_1111_1111_1111_1111_1111_1111};
//        for (int i:iArr) System.out.println(i);

    static long[] lArr = {1L, 02L, 0x3L, 0b100L, 2_147_483_647L, 0177_7777_7777L, 0x7fff_ffffL,
            0b0111_1111_1111_1111_1111_1111_1111_1111L};
//        for (long l:lArr) System.out.println(l);

    static float[] fArr = {3.14f, .14f, POSITIVE_INFINITY, MAX_VALUE, NaN};
//        for (float f:fArr) System.out.println(f);

    static double[] dArr = {3.14, 3.14d, .14d, Double.MAX_VALUE};
//        for (double d:dArr) System.out.println(d);

    static boolean[] bArr = {true, false};
//        for (boolean b:bArr) System.out.println(b);

    static char[] cArr = {'a', '\r', 'W', '\uFFFF', '%', '\'', '\177', '\t', '\u03a9'};
//        for (char c:cArr) System.out.println(c);

}
