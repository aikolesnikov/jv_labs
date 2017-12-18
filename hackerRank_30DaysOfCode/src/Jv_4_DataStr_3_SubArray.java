import java.util.Scanner;

public class Jv_4_DataStr_3_SubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            // Fill array a here
            a[i] = val;
        }

        // int[] a = new int[]{1, -2, 4, -5, 1};

        int nCount = 0;
        int tSum = 0;

        for (int i = 0; i < a.length; i++) {
            tSum = 0;
            for (int j = 0; j < a.length - i; j++) {
                tSum += a[i + j];
                if (tSum<0) nCount++;
            }
        }
        System.out.println(nCount);
    }
}
