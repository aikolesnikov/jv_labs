import java.util.Arrays;
import java.util.Scanner;


public class Jv_2_String_Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        char[] aC = a.toUpperCase().toCharArray();
        char[] bC = b.toUpperCase().toCharArray();

        Arrays.sort(aC);
        Arrays.sort(bC);

/*
        for (int i = 0; i < aC.length; i++) {
            System.out.print(aC[i]);
        }
        System.out.println();

        for (int i = 0; i < bC.length; i++) {
            System.out.print(bC[i]);
        }
        System.out.println();


        // System.out.println(aC.toString());
        System.out.println(Arrays.equals(aC, bC));
*/
        return Arrays.equals(aC, bC);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a,b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
