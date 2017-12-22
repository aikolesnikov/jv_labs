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


        // ??? deque.toArray().
        for (int i = 0; i <= n - m; i++) {
            HashSet<Integer> hs = new HashSet<>();

            for (int j = 0; j < m; j++) {
                hs.add((Integer) deque.peek());
            }
            System.out.println(deque.poll());
            System.out.println(hs.size());
            System.out.println();
        }


        // for (Object i: deque) System.out.println(((Integer) i).intValue());
    }
}
