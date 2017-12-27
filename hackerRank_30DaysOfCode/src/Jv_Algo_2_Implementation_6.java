import java.util.Scanner;

public class Jv_Algo_2_Implementation_6 {

    static int solve(int n, int[] s, int d, int m) {
        // Complete this function

        if ((s.length == 1)) {
            if (s[0] != d) return 0;
            else return 1;
        }

        int tCount = 0;

        for (int i = 0; i <= s.length - m; i++) {

            int tSum = 0;
            for (int j = 0; j < m; j++)
                tSum += s[i + j];
            if (tSum == d)
                tCount++;
        }

        return tCount;
    }

    public static void main(String[] args) {
/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
*/


        assert (solve(5, new int[]{1, 2, 1, 3, 2}, 3, 2) == 2);
        assert (solve(6, new int[]{1, 1, 1, 1, 1}, 3, 2) == 0);
        assert (solve(1, new int[]{4}, 4, 1) == 1);
        assert (solve(19, new int[]{2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1}, 18, 7) == 3);

    }
}

