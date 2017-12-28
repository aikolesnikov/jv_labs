import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Jv_Algo_4_Sorting_1 {



/*
  -- LongTime solution
  static String[] bigSorting(String[] arr) {
        // Complete this function

        String[] tStringAr = new String[arr.length];

        BigInteger[] iAr = new BigInteger[arr.length];
        for (int i = 0; i < iAr.length; i++) {
            iAr[i] = new BigInteger(arr[i]);
        }

        Arrays.sort(iAr);

        for (int i = 0; i < tStringAr.length; i++) {
            tStringAr[i] = iAr[i].toString();
        }

        // return new String[]{"31415926535897932384626433832795", "1", "3", "10", "3", "5"};
        return tStringAr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();

        // bigSorting(new String[]{"31415926535897932384626433832795", "1", "3", "10", "3", "5"});
        // assert (bigSorting(new String[]{"31415926535897932384626433832795", "1", "3", "10", "3", "5"}) ==
        //        new String[]{"31415926535897932384626433832795", "1", "3", "10", "3", "5"});
    }*/
}

