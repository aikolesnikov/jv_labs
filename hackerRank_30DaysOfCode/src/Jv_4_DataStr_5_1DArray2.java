import java.util.Scanner;

public class Jv_4_DataStr_5_1DArray2 {


    // assert (canWin(2, new int[]{0, 1, 0, 1, 0, 1})) == true;     //

    static boolean f(int i, int step, int len, int[] ar) {

        if ((i + step) >= len) return true;

        if ((step > 1) && (ar[i + step - 1] == 0)) {
            i = i + step;
            return f(i, step, len, ar);
        } else if (ar[i + 1] == 0) {
            i++;
            return f(i, step, len, ar);
        } else
            return false;
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return f(0, leap, game.length, game);
    }


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
//        while (q-- > 0) {
//            int n = scan.nextInt();
//            int leap = scan.nextInt();
//
//            int[] game = new int[n];
//            for (int i = 0; i < n; i++) {
//                game[i] = scan.nextInt();
//            }
//
//            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
//        }
//        scan.close();

//        System.out.println((canWin(3, new int[]{0, 0, 0, 0, 0})) ? "YES" : "NO");  // yes

        assert (canWin(3, new int[]{0, 0, 0, 0, 0})) == true;
        assert (canWin(5, new int[]{0, 0, 0, 1, 1, 1})) == true;
        assert (canWin(3, new int[]{0, 0, 1, 1, 1, 0})) == false;
        assert (canWin(1, new int[]{0, 1, 0})) == false;     // no
        assert (canWin(5, new int[]{0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1})) == true;     // YES
        assert (canWin(5, new int[]{0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1})) == true;     // YES
        assert (canWin(5, new int[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1})) == false;     // NO
        assert (canWin(2, new int[]{0, 1, 0, 1, 0, 1})) == true;     //
//        assert (canWin(6, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0})) == false;
//        assert (canWin(3, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0})) == true;

    }
}
