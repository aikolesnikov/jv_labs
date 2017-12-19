import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Jv_4_DataStr_4_ArrayList {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 0;

        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            ar.add(new ArrayList<>());
//            m = scan.nextInt();
//            for (int j = 0; j < m; j++) {
//                ar.get(i).add(scan.nextInt());
//            }
//        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < ar.get(i).size(); j++) {
//                System.out.println(ar.get(i).get(j));
//            }
//        }
//        ar.add(new ArrayList<>(Arrays.asList(41, 77, 74, 22, 44)));
//        ar.add(new ArrayList<>(Arrays.asList(12)));
//        ar.add(new ArrayList<>(Arrays.asList(37, 34, 36, 52)));
//        ar.add(new ArrayList<>(Arrays.asList()));
//        ar.add(new ArrayList<>(Arrays.asList(20, 22, 33)));

        ar.add(new ArrayList<>(Arrays.asList(43, 35, 26, 34, 78, 99, 70)));
        ar.add(new ArrayList<>(Arrays.asList(71, 11, 16)));
        ar.add(new ArrayList<>(Arrays.asList(70, 19, 42, 30, 84, 20, 57, 45)));
        ar.add(new ArrayList<>(Arrays.asList()));
        ar.add(new ArrayList<>(Arrays.asList(20)));
        ar.add(new ArrayList<>(Arrays.asList()));
        ar.add(new ArrayList<>(Arrays.asList()));
        ar.add(new ArrayList<>(Arrays.asList()));
        // System.out.println(ar.get(1).get(1));


//        int nn = scan.nextInt();
//        int[] arR = new int[n * 2];
//        for (int i = 0; i < nn * 2; i += 2) {
//            arR[i] = scan.nextInt();
//            arR[i + 1] = scan.nextInt();
//        }

        int[] arR = new int[]{
                5, 1,
                5, 7,
                1, 7,
                5, 3,
                5, 2,
                4, 7,
                5, 2,
                1, 2,
                4, 1,
                2, 3};

        for (int i = 0; i < 20; i += 2) {
            try {
                System.out.println(ar.get(arR[i] - 1).get(arR[i + 1] - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}

