import java.util.Scanner;

public class Jv_Algo_1_Warmup_4 {

    static long aVeryBigSum(int n, long[] ar) {
        // Complete this function

        Long tLong = new Long(0);

        for (int i = 0; i < n; i++) {
            tLong += ar[i];
        }

        return tLong;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}

