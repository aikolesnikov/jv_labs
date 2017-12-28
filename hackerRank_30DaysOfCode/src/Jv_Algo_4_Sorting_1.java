import java.util.Scanner;

public class Jv_Algo_4_Sorting_1 {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int res = 0;

        int sWith = 0;
        int sWithout = 0;
        for (int i = 0; i < ar.length; i++) {
            sWith += ar[i];
        }
        sWithout = sWith - ar[k];

        return b - sWithout / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);

        if (bonAppetit(n, k, b, ar) == 0)
            System.out.println("Bon Appetit");
        else {
            System.out.println(result);
        }

        // assert (bonAppetit(4, 1, 12, new int[]{3, 10, 2, 9}) == 5);
        // assert (bonAppetit(4, 1, 7, new int[]{3, 10, 2, 9}) == 0);
    }
}

