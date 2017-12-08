import java.util.Arrays;

import static java.lang.Float.MAX_VALUE;
import static java.lang.Float.NaN;
import static java.lang.Float.POSITIVE_INFINITY;

public class Main {

    //---------------
    //---  Literals
    //---------------
    static int[] iArr = {1, 02, 0x3, 0b100, 2_147_483_647, 0177_7777_7777, 0x7fff_ffff,
            0b0111_1111_1111_1111_1111_1111_1111_1111};

    static long[] lArr = {1L, 02L, 0x3L, 0b100L, 2_147_483_647L, 0177_7777_7777L, 0x7fff_ffffL,
            0b0111_1111_1111_1111_1111_1111_1111_1111L};

    static float[] fArr = {3.14f, .14f, POSITIVE_INFINITY, MAX_VALUE, NaN};

    static double[] dArr = {3.14, 3.14d, .14d, Double.MAX_VALUE};

    static boolean[] bArr = {true, false};

    static char[] cArr = {'a', '\r', 'W', '\uFFFF', '%', '\'', '\177', '\t', '\u03a9'};

    static Object[] objArr = {null, "abc", new Main(), String.class};

    //---------------
    //---  Variables
    //---------------
    static int varStatic1;  //  Class Variables (Static Fields)
    public int varNonStatic1;     //  Instance Variables (Non-Static Fields)

    void method1(int n) {   //  Parameters
        int m;              //  Local Variables
    }


    //---------------
    //---  Data types
    //---------------
    static byte byteVar1;             // 1 byte 2^8       -128 +127
    static short shortVar1;            // 2 bytes 2^16     -32'768 +32'767
    static int integerVar1;              // 4 bytes 2^32     -2^31 +2^31
    static long longVar1;             // 8 bytes 2^64     -2^64 +2^64
    static float floatVar1;            // 32 bit
    static double doubleVal1;           // 64 bit
    static boolean booleanVal1;          // true, false
    static char charVal1;             // 2 bytes


    public static void main(String[] args) {

        // Literals
        for (int i : iArr) System.out.println(i);
        for (long l : lArr) System.out.println(l);
        for (float f : fArr) System.out.println(f);
        for (double d : dArr) System.out.println(d);
        for (boolean b : bArr) System.out.println(b);
        for (char c : cArr) System.out.println(c);
        for (Object o : objArr) System.out.println(o);
        System.out.println();


        // Variables
        varStatic1 = 1;
        System.out.println("NewObj nonStatic " + new Main().varNonStatic1);
        System.out.println();


        // Data types
        System.out.println(Byte.TYPE + " default " + byteVar1 + " " + "min " + Byte.MIN_VALUE + " max " + Byte.MAX_VALUE);
        System.out.println(Short.TYPE + " default " + shortVar1 + " " + "min " + Short.MIN_VALUE + " max " + Short.MAX_VALUE);
        System.out.println(Integer.TYPE + " default " + integerVar1 + " " + "min " + Integer.MIN_VALUE + " max " + Integer.MAX_VALUE);
        System.out.println(Long.TYPE + " default " + longVar1 + " " + "min " + Long.MIN_VALUE + " max " + Long.MAX_VALUE);
        System.out.println(Float.TYPE + " default " + floatVar1 + " " + "min " + Float.MIN_VALUE + " max " + Float.MAX_VALUE);
        System.out.println(Double.TYPE + " default " + doubleVal1 + " " + "min " + Double.MIN_VALUE + " max " + Double.MAX_VALUE);
        System.out.println(Boolean.TYPE + " default " + booleanVal1 + " " + "min " + Boolean.FALSE + " max " + Boolean.TRUE);
        System.out.println(Character.TYPE + " default " + charVal1 + " " + "min " + Character.MIN_VALUE + " max " + Character.MAX_VALUE);
        System.out.println();

        Object[] myObjArr = {null, new Object(), "abc", 123};
        int[] intArr = {1, 2, 3};
        int intArr1[] = {4, 5, 6};

        double dblArr1[] = new double[]{7.8, 9, 10};
        int intArr2[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int intArr3[][][] = {
                {{2, 3, 4}, {}, {2, 3, 4}},
                {{16}, {2, 3, 4}, {2, 3, 4, 7, 6, 19}}
        };
        System.out.println(myObjArr[0] + " " + intArr1[1] + " " + dblArr1[2] + " " + intArr2[0][2] + " " + intArr3[1][2][1]);

        System.arraycopy(intArr1, 0, intArr, 2, 1);
        for (int i : intArr) System.out.print(i + " ");
        System.out.println();
        System.out.println(Arrays.toString(intArr));
        System.out.println();


        Object obj1 = new Object();
        System.out.println(obj1.toString());

    }
}
