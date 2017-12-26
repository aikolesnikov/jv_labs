import java.util.Scanner;

public class Jv_2_Strings_4_Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int aL = A.length();

        for (int i=0; i<A.length()/2;i++){
            if (A.charAt(i)!=A.charAt(aL-1-i)){
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
