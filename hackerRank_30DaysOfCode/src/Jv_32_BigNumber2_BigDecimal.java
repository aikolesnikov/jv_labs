import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Scanner;


public class Jv_32_BigNumber2_BigDecimal {


    public static Comparator<String> StrComparator
            = new Comparator<String>() {

        public int compare(String s1, String s2) {

            //ascending order
            // return (new BigDecimal(s1)).compareTo(new BigDecimal(s2));

            //descending order
            return (new BigDecimal(s2)).compareTo(new BigDecimal(s1));
        }
    };


    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
        s[i] = sc.next();
        }
        sc.close();

        //Write your code here

        // String[] s = {"9", "-100", "50", "0", "56.6", "90", "0.12", "02.34", "000.000"};

        // Arrays.sort(s, StrComparator);
/*
        Arrays.sort(s,
                new Comparator<String>() {
                    public int compare(String s1, String s2) {
                        return (new BigDecimal(s2)).compareTo(new BigDecimal(s1));
                    }}
                );
*/

/*
        int nn = s.length;
        int k;
        String tS;
        for (int m = nn; m >= 0; m--) {
            for (int i = 0; i < nn - 1; i++) {
                k = i + 1;
                if ((new BigDecimal(s[i])).compareTo(new BigDecimal(s[k])) < 0) {
                    tS = s[i];
                    s[i] = s[k];
                    s[k] = tS;
                }
            }
        }
*/
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
