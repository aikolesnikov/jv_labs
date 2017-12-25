import java.util.*;

/**
 * Created by admin on 12/22/2017.
 */
public class Jv_4_DataStr_12_Deck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }


        Object[] ar = deque.toArray();
        int tSum = 0;
        for (int i = 0; i <= n - m; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = 0; j < m; j++) {
                hs.add(((Integer) ar[i + j]));
            }
            if (hs.size() > tSum)
                tSum = hs.size();

//            for (int j = 0; j < m; j++) {
//                System.out.println(((Integer) ar[i + j]) + " ");
//            }
//            System.out.println();

        }

        System.out.println(tSum);

    }
}
