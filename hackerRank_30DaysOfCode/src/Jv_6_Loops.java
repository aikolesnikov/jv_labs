import java.util.Scanner;

public class Jv_6_Loops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if (n >= 2 && n <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", n, i, n * i);
            }
        } else
            System.out.println("wrong");
    }
}
