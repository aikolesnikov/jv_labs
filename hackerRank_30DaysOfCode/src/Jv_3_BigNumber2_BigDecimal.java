import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class Jv_3_BigNumber2_BigDecimal  {


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
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // String[] s = new String[n + 2];
        // for (int i = 0; i < n; i++) {
            // s[i] = sc.next();
        // }
        // sc.close();

        //Write your code here

        String[] s = {"0", "56.6", "50", "02.34", "0.12",
                ".12", "0", "000.000", "-100"};
        //Output

        // Arrays.sort(s, StrComparator);
        Arrays.sort(s,
                new Comparator<String>() {
                    public int compare(String s1, String s2) {
                        return (new BigDecimal(s2)).compareTo(new BigDecimal(s1));
                    }}
                );



        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
