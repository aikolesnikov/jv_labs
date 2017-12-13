import java.util.InputMismatchException;
import java.util.Scanner;

public class Jv_61_Exception1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        try {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}