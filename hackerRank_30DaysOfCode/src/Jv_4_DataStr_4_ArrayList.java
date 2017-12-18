import java.util.ArrayList;
import java.util.Scanner;

public class Jv_4_DataStr_4_ArrayList {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 0;

        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(new ArrayList<>());
            m = scan.nextInt();
            for (int j = 0; j < m; j++) {
                ar.get(i).add(scan.nextInt());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ar.get(i).size(); j++) {
                System.out.println(ar.get(i).get(j));
            }
        }
//        ar.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
//        ar.add(new ArrayList<>(Arrays.asList(4, null, 6)));
//        ar.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        // System.out.println(ar.get(1).get(1));

        n = scan.nextInt();
        int[][] arR = new int[n][2];
        for (int i = 0; i < n; i++) {
            arR[i][0] = scan.nextInt();
            arR[i][1] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            // System.out.println(arR[i][0] + " " + arR[i][1]);
            Integer tempInt = ar.get(arR[i][0]).get(arR[i][1]);
            System.out.println(tempInt == null ? "ERROR!" : ar.get(arR[i][0]).get(arR[i][1])
            );
        }

    }
}

