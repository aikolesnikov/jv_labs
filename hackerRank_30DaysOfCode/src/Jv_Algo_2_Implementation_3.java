import java.util.Scanner;

public class Jv_Algo_2_Implementation_3 {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function


        if ((v1 == v2) && (x1!=x2)) return "NO";
        if ((x2 - x1) % (v1 - v2) != 0) return "NO";


            int N = Math.abs((x2 - x1) / (v1 - v2));


        return (((x1 + v1 * N) == (x2 + v2 * N)) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
//        assert(kangaroo(0, 3, 4, 2).equals("YES"));
//        assert(kangaroo(0, 2, 5, 3).equals("NO"));
//        assert(kangaroo(43, 2, 70, 2).equals("NO"));

        System.out.println(result);


    }
}

