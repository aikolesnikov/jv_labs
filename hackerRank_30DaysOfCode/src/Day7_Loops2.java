import java.util.Scanner;

public class Day7_Loops2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = a;
            int k2 = 1;

            for (int j = 0; j < n; j++) {
                s = s + k2 * b;
                System.out.print(s + " ");
                k2 = k2 * 2;
            }
            System.out.println();
        }
        in.close();
    }
}
