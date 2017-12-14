import java.util.Scanner;

public class Jv_2_Strings_Comparison {

    private static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        if (s.length() >= k) {
            smallest = largest = s.substring(0, k);
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        for (int i = 0; i <= s.length() - k; i++) {
            String st = s.substring(i, i + k);
            if (st.compareTo(smallest) < 0) {
                smallest = st;
            }
            if (st.compareTo(largest) > 0) {
                largest = st;
            }

            // System.out.println(st + " " + smallest + " " + largest);
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();


        System.out.println(getSmallestAndLargest(s, k));
    }
}
