import java.util.Scanner;

public class Jv_4_DataStr_2_2DArray {

    public static void main(String[] args) {


        /*
        Scanner in = new Scanner(System.in);
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
*/
        int arrOld[][] = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int arr[][] = new int[][]{
                {0, 6, -7, 1, 6, 3},
                {-8, 2, 8, 3, -2, 7},
                {-3, 3, -6, -3, 0, -6},
                {5, 0, 5, -1, -5, 2},
                {6, 2, 8, 1, 3, 0},
                {8, 5, 0, 4, -7, 4}
        };

        /*
        0 6 -7 1 6 3
-8 2 8 3 -2 7
-3 3 -6 -3 0 -6
5 0 5 -1 -5 2
6 2 8 1 3 0
8 5 0 4 -7 4
         */
        // print array
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.print(arr[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        // glass array
        int glassSum = arr[0][0] + arr[0][1] + arr[0][2]
                + arr[1][1] +
                arr[2][0] + arr[2][1] + arr[2][2];

        int glass_i = 0;
        int glass_j = 0;
        int tSum = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                // System.out.print(arr[i][j] + "_" + tSum + " ");
                tSum = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1]
                        + arr[i][j] +
                        arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];

                if (glassSum < tSum) {
                    glassSum = tSum;
                    glass_i = i;
                    glass_j = j;
                }
            }
            // System.out.println();
        }

        // System.out.println(glassSum + " " + glass_i + " " + glass_j);
        System.out.println(glassSum);

    }
}
