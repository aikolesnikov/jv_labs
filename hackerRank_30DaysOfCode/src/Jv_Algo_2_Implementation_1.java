import java.util.Scanner;

public class Jv_Algo_2_Implementation_1 {

    static int[] solve(int[] grades) {

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {

                int tNext = 1;
                while (((grades[i] + tNext++) % 5) != 0) {
                }
                if (tNext <= 3){
                    grades[i] = grades[i] + tNext - 1;
                }

            }
        }

        // Complete this function
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }

        int[] result = solve(grades);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
//        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i] + " ");
        }

        System.out.println("");

    }
}

